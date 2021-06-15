package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entity.concretes.Employer;
import kodlamaio.northwind.entity.concretes.JobPosition;

public interface EmployerService {
	public Result add(Employer employer);
	public DataResult<List<Employer>> getAll();
}
