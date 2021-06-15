package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ExperienceForCVService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ExperienceForCVDao;
import kodlamaio.northwind.entity.concretes.ExperienceForCV;

@Service
public class ExperienceForCVManager implements ExperienceForCVService{

	ExperienceForCVDao experienceForCVDao;
	
	@Autowired
	public ExperienceForCVManager(ExperienceForCVDao experienceForCVDao) {
		super();
		this.experienceForCVDao = experienceForCVDao;
	}

	@Override
	public Result add(ExperienceForCV experienceForCV) {
		experienceForCVDao.save(experienceForCV);
		return new SuccessResult("Experience for CV added");
	}

	@Override
	public Result update(ExperienceForCV experienceForCV) {
		experienceForCVDao.save(experienceForCV);
		return new SuccessResult("Experience updated.");
	}

	@Override
	public Result delete(int id) {
		experienceForCVDao.deleteById(id);
		return new SuccessResult("Experience deleted.");
	}

	@Override
	public DataResult<ExperienceForCV> getById(int id) {
		
		return new SuccessDataResult<ExperienceForCV>(experienceForCVDao.getById(id));
	}

	@Override
	public DataResult<List<ExperienceForCV>> getAll() {
		return new SuccessDataResult<List<ExperienceForCV>>(experienceForCVDao.findAll()); 
	}

	@Override
	public DataResult<List<ExperienceForCV>> getAllByJobSeekerId(int id) {
		
		return new SuccessDataResult<List<ExperienceForCV>>(experienceForCVDao.getAllByJobSeeker_id(id));
	}

	@Override
	public DataResult<List<ExperienceForCV>> getAllByJobSeekerIdOrderByEndAtDesc(int id) {
		
		return new SuccessDataResult<List<ExperienceForCV>>(experienceForCVDao.getAllByJobSeeker_idOrderByEndAtDesc(id));
	}
	

}
