package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.JobPositionService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.ErrorResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.JobPositionDao;
import kodlamaio.northwind.entity.concretes.JobPosition;


@Service
public class JobPositionManager implements JobPositionService {

	JobPositionDao jobPositionDao;
	JobPositionValidationManager jobPositionValidationManager;
	
	@Autowired
	public JobPositionManager(JobPositionDao dao, JobPositionValidationManager jobPositionValidationManager) {
		super();
		this.jobPositionDao = dao;
		this.jobPositionValidationManager = jobPositionValidationManager;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"Data listed");
	}
 
	@Override
	public Result add(JobPosition jobPosition) {
		if(jobPositionValidationManager.checkJobPositionSingularity(jobPosition) == true) {
			this.jobPositionDao.save(jobPosition);
			return new SuccessResult("Data added");
		}
		else {
			return new ErrorResult("Could not add data because it is not unique");
		}
		
	}



	

}
