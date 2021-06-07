package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.JobAdvertService;
import kodlamaio.northwind.core.utulities.results.DataResult;
import kodlamaio.northwind.core.utulities.results.ErrorResult;
import kodlamaio.northwind.core.utulities.results.Result;
import kodlamaio.northwind.core.utulities.results.SuccessDataResult;
import kodlamaio.northwind.core.utulities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.JobAdvertDao;
import kodlamaio.northwind.entity.concretes.JobAdvert;

@Service
public class JobAdvertManager implements JobAdvertService {
	private JobAdvertDao jobAdvertDao;

	@Autowired
	public JobAdvertManager(JobAdvertDao jobAdvertDao) {
		super();
		this.jobAdvertDao = jobAdvertDao;
	}

	@Override
	public Result add(JobAdvert jobAdvert) {
		if (CheckIfNullField(jobAdvert) == true) {
			this.jobAdvertDao.save(jobAdvert);
			return new SuccessResult("Job advert has been added.");
		} else {
			return new ErrorResult("You have entered missing information. Please fill in all fields.");
		}
	}

	@Override
	public Result update(JobAdvert jobAdvert) {
		this.jobAdvertDao.save(jobAdvert);
		return new SuccessResult("Job Advert has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.jobAdvertDao.deleteById(id);
		return new SuccessResult("Job advert has been deleted.");
	}

	@Override
	public Result changeOpenToClose(int id) {
		if (getById(id) == null) {
			return new ErrorResult("There is no such job advert.");
		} else if (getById(id).getData().isOpen() == false) {
			return new ErrorResult("This job advert is already closed.");
		} else {
			JobAdvert jobAdvert = getById(id).getData();

			jobAdvert.setOpen(false);
			update(jobAdvert);

			return new SuccessResult("JobAdvert successfully closed.");
		}
	}

	@Override
	public DataResult<JobAdvert> getById(int id) {
		return new SuccessDataResult<JobAdvert>(this.jobAdvertDao.getOne(id));
	}

	@Override
	public DataResult<List<JobAdvert>> getAll() {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findAll());
	}

	@Override
	public DataResult<List<JobAdvert>> findAllByOrderByPublishedAt() {

		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findAllByOrderByPublishedAtDesc());
	}

	@Override
	public DataResult<List<JobAdvert>> getAllOpenJobAdvertByEmployer(int id) {

		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getAllOpenJobAdvertByEmployer(id));
	}

	@Override
	public DataResult<List<JobAdvert>> getAllOpenJobAdvertList() {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getAllOpenJobAdvertList());
	}

	private boolean CheckIfNullField(JobAdvert jobAdvert) {
		if (jobAdvert.getJobPosition() != null && jobAdvert.getDescription() != null && jobAdvert.getCity() != null
				&& jobAdvert.getOpenPositionCount() != 0) {
			return true;
		}
		return false;
	

}
	
}
