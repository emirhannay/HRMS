package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entity.concretes.ProgrammingSkillForCV;

public interface ProgrammingSkillForCVService {
	Result add(ProgrammingSkillForCV programmingSkillForCV);
	Result update(ProgrammingSkillForCV programmingSkillForCV);
	Result delete(int id);
	DataResult<ProgrammingSkillForCV> getById(int id);
	DataResult<List<ProgrammingSkillForCV>> getAll();
	DataResult<List<ProgrammingSkillForCV>> getAllByJobSeekerId(int id);
	
}
