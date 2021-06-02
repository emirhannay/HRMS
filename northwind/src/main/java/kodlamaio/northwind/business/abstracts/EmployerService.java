package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utulities.results.DataResult;
import kodlamaio.northwind.core.utulities.results.Result;
import kodlamaio.northwind.entity.concretes.Employer;
import kodlamaio.northwind.entity.concretes.JobPosition;

public interface EmployerService {
	public Result add(Employer employer);
	public DataResult<List<Employer>> getAll();
}
