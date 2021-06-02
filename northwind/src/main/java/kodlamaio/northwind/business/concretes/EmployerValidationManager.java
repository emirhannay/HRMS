package kodlamaio.northwind.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.dataAccess.abstracts.EmployerDao;
import kodlamaio.northwind.entity.concretes.Employer;

@Service
public class EmployerValidationManager {
	EmployerDao employerDao;
	
	@Autowired
	public EmployerValidationManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}
	
	
		public boolean checkEmailSingularity(Employer employer) {
			var result = employerDao.findByEmail(employer.getEmail());
			
			if(result != null)
			{
				return false;
			}
			else {
				return true;
			}
			
		}

	
}
