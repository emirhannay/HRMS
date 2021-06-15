package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entity.concretes.CoverLetterForCV;

public interface CoverLetterForCVService {
	Result add(CoverLetterForCV coverLetterForCV);

	Result update(CoverLetterForCV coverLetterForCV);

	Result delete(int id);

	DataResult<CoverLetterForCV> getById(int id);
	
	DataResult<List<CoverLetterForCV>> getAll();
}
