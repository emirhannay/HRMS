package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.EmployerService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.ErrorResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.EmployerDao;
import kodlamaio.northwind.entity.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	EmployerDao employerDao;
	EmployerValidationManager validationManager;
	
	

	@Autowired
	public EmployerManager(EmployerDao employerDao, EmployerValidationManager validationManager) {
		super();
		this.employerDao = employerDao;
		this.validationManager = validationManager;
	}

	

	@Override
	public Result add(Employer employer) {
		if(validationManager.checkEmailSingularity(employer) == true) {
			employerDao.save(employer);
			return new SuccessResult("Başarıyla eklendi.");
		}
		else {
			return new ErrorResult("Eklenemedi.");
		}
		
	}



	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Data listed");
	}
	
}
