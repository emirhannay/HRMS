package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.SchoolForCVService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.SchoolForCVDao;
import kodlamaio.northwind.entity.concretes.SchoolForCV;

@Service
public class SchoolForCVManager implements SchoolForCVService {

	private SchoolForCVDao schoolForCVDao;

	@Autowired
	public SchoolForCVManager(SchoolForCVDao schoolForCVDao) {
		super();
		this.schoolForCVDao = schoolForCVDao;
	}

	@Override
	public Result add(SchoolForCV schoolForCV) {
		this.schoolForCVDao.save(schoolForCV);
		return new SuccessResult("School added.");
	}

	@Override
	public Result update(SchoolForCV schoolForCV) {
		this.schoolForCVDao.save(schoolForCV);
		return new SuccessResult("School updated.");
	}

	@Override
	public Result delete(int id) {
		this.schoolForCVDao.deleteById(id);
		return new SuccessResult("School deleted.");
	}

	@Override
	public DataResult<SchoolForCV> getById(int id) {
		return new SuccessDataResult<SchoolForCV>(this.schoolForCVDao.getById(id));
	}

	@Override
	public DataResult<List<SchoolForCV>> getAll() {
		return new SuccessDataResult<List<SchoolForCV>>(this.schoolForCVDao.findAll());
	}

	@Override
	public DataResult<List<SchoolForCV>> getAllByJobSeekerIdOrderByEndAtDesc(int id) {
		return new SuccessDataResult<List<SchoolForCV>>(this.schoolForCVDao.getAllByJobSeeker_idOrderByEndAtDesc(id));
	}

	@Override
	public DataResult<List<SchoolForCV>> getAllByJobSeekerId(int id) {
		return new SuccessDataResult<List<SchoolForCV>>(this.schoolForCVDao.getAllByJobSeeker_id(id));
	}

}
