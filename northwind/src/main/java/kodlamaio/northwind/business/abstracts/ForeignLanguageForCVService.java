package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entity.concretes.ForeignLanguageForCV;

public interface ForeignLanguageForCVService {
	Result add(ForeignLanguageForCV foreignLanguageForCV);
	Result update(ForeignLanguageForCV foreignLanguageForCV);
	Result delete(int id);
	DataResult<ForeignLanguageForCV> getById(int id);	
	DataResult<List<ForeignLanguageForCV>> getAll();
	DataResult<List<ForeignLanguageForCV>> getAllByJobSeekerId(int id);
}
