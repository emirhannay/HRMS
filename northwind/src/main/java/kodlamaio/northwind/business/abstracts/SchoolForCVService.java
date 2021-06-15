package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entity.concretes.SchoolForCV;

public interface SchoolForCVService {
	Result add(SchoolForCV schoolForCV);
	Result update(SchoolForCV schoolForCV);
	Result delete(int id);
	DataResult<SchoolForCV> getById(int id);	
	DataResult<List<SchoolForCV>> getAll();
	DataResult<List<SchoolForCV>> getAllByJobSeekerIdOrderByEndAtDesc(int id);
	DataResult<List<SchoolForCV>> getAllByJobSeekerId(int id);
}
