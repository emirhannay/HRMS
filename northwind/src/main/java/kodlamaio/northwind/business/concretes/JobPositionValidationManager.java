package kodlamaio.northwind.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.dataAccess.abstracts.JobPositionDao;
import kodlamaio.northwind.entity.concretes.JobPosition;

@Service
public class JobPositionValidationManager {
	

	JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionValidationManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	public boolean checkJobPositionSingularity(JobPosition jobPosition) {
		var result = jobPositionDao.findByJobTitle(jobPosition.getJobTitle());
		
		if(result != null) {
			return false;
		}
		else {
			return true;
		}
		
		
	}
	
}
