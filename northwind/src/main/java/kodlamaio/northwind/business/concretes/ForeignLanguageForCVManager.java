package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ForeignLanguageForCVService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ForeignLanguageForCVDao;
import kodlamaio.northwind.entity.concretes.ForeignLanguageForCV;

@Service
public class ForeignLanguageForCVManager implements ForeignLanguageForCVService {

	private ForeignLanguageForCVDao foreignLanguageForCVDao;

	@Autowired
	public ForeignLanguageForCVManager(ForeignLanguageForCVDao foreignLanguageForCVDao) {
		super();
		this.foreignLanguageForCVDao = foreignLanguageForCVDao;
	}

	@Override
	public Result add(ForeignLanguageForCV foreignLanguageForCV) {
		foreignLanguageForCVDao.save(foreignLanguageForCV);
		return new SuccessResult("Foreign language added.");
	}

	@Override
	public Result update(ForeignLanguageForCV foreignLanguageForCV) {
		this.foreignLanguageForCVDao.save(foreignLanguageForCV);
		return new SuccessResult("Foreign language has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.foreignLanguageForCVDao.deleteById(id);;
		return new SuccessResult("Foreign language has been deleted.");
	}

	@Override
	public DataResult<ForeignLanguageForCV> getById(int id) {
		
		return new SuccessDataResult<ForeignLanguageForCV>(this.foreignLanguageForCVDao.getById(id));
	}

	@Override
	public DataResult<List<ForeignLanguageForCV>> getAll() {
		
		return new SuccessDataResult<List<ForeignLanguageForCV>>(this.foreignLanguageForCVDao.findAll());
	}
	

	@Override
	public DataResult<List<ForeignLanguageForCV>> getAllByJobSeekerId(int id) {
		
		return new SuccessDataResult<List<ForeignLanguageForCV>>(this.foreignLanguageForCVDao.getAllByJobSeeker_id(id));
	}

}
