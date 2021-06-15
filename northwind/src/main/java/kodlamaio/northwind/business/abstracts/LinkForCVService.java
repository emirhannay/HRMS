package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entity.concretes.LinkForCV;

public interface LinkForCVService {
	Result add(LinkForCV linkForCV);
	Result update(LinkForCV linkForCV);
	Result delete(int id);
	DataResult<LinkForCV> getById(int id);	
	DataResult<List<LinkForCV>> getAll();
	DataResult<List<LinkForCV>> getAllByJobSeekerId(int id);
}