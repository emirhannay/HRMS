package kodlamaio.northwind.business.concretes;


import org.springframework.stereotype.Service;

import kodlamaio.northwind.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.northwind.entity.concretes.JobPosition;
import kodlamaio.northwind.entity.concretes.JobSeeker;

@Service
public class JobSeekerValidationManager {
	JobSeekerDao jobSeekerDao;

	public JobSeekerValidationManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}
	
	public boolean checkEmailSingularity(JobSeeker jobSeeker) {
		var result = jobSeekerDao.findByEmail(jobSeeker.getEmail());
	
		if(result != null) {
			return false;
		}
		else {
			return true;
		}
	}
		public boolean checkIdentificationNoSingularity(JobSeeker jobSeeker) {
			var result = jobSeekerDao.findByIdentificationNo(jobSeeker.getIdentificationNo());
			
			if(result != null) {
				return false;
			}
			else {
				return true;
			}
		}
	
}