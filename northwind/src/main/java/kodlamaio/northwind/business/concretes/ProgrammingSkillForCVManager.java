package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProgrammingSkillForCVService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProgrammingSkillForCVDao;
import kodlamaio.northwind.entity.concretes.ProgrammingSkillForCV;

@Service
public class ProgrammingSkillForCVManager implements ProgrammingSkillForCVService{

private ProgrammingSkillForCVDao programmingSkillForCVDao;
	
	
	@Autowired
	public ProgrammingSkillForCVManager(ProgrammingSkillForCVDao programmingSkillForCVDao) {
		super();
		this.programmingSkillForCVDao = programmingSkillForCVDao;
	}

	@Override
	public Result add(ProgrammingSkillForCV programmingSkillForCV) {
		this.programmingSkillForCVDao.save(programmingSkillForCV);
		return new SuccessResult("Programming skill added.");
	}

	@Override
	public Result update(ProgrammingSkillForCV programmingSkillForCV) {
		this.programmingSkillForCVDao.save(programmingSkillForCV);
		return new SuccessResult("Programming skill updated.");
	}

	@Override
	public Result delete(int id) {
		this.programmingSkillForCVDao.deleteById(id);
		return new SuccessResult("Programming skill deleted.");
	}

	@Override
	public DataResult<ProgrammingSkillForCV> getById(int id) {
		return new SuccessDataResult<ProgrammingSkillForCV>(this.programmingSkillForCVDao.getById(id));
	}

	@Override
	public DataResult<List<ProgrammingSkillForCV>> getAll() {
		return new SuccessDataResult<List<ProgrammingSkillForCV>>(this.programmingSkillForCVDao.findAll());
	}

	@Override
	public DataResult<List<ProgrammingSkillForCV>> getAllByJobSeekerId(int id) {
		return new SuccessDataResult<List<ProgrammingSkillForCV>>(this.programmingSkillForCVDao.getAllByJobSeeker_id(id));
	}

}
