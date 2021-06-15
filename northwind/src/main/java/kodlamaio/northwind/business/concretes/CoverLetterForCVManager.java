package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.CoverLetterForCVService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.CoverLetterForCVDao;
import kodlamaio.northwind.entity.concretes.CoverLetterForCV;

@Service
public class CoverLetterForCVManager implements CoverLetterForCVService{
	
	private CoverLetterForCVDao coverLetterForCVDao;
	
	@Autowired
	public CoverLetterForCVManager(CoverLetterForCVDao coverLetterForCVDao) {
		super();
		this.coverLetterForCVDao = coverLetterForCVDao;
	}

	@Override
	public Result add(CoverLetterForCV coverLetterForCV) {
		this.coverLetterForCVDao.save(coverLetterForCV);
		return new SuccessResult("Cover letter added.");
	}

	@Override
	public Result update(CoverLetterForCV coverLetterForCV) {
		this.coverLetterForCVDao.save(coverLetterForCV);
		return new SuccessResult("Cover letter updated");
	}

	@Override
	public Result delete(int id) {
		this.coverLetterForCVDao.deleteById(id);
		return new SuccessResult("Cover letter deleted.");
	}

	@Override
	public DataResult<CoverLetterForCV> getById(int id) {
		
		return new SuccessDataResult<CoverLetterForCV>(coverLetterForCVDao.getById(id));
	}

	@Override
	public DataResult<List<CoverLetterForCV>> getAll() {
		
		return new SuccessDataResult<List<CoverLetterForCV>>(coverLetterForCVDao.findAll());
	}

}
