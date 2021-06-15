package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entity.concretes.JobPosition;

public interface JobPositionService {
	public DataResult<List<JobPosition>> getAll();
	public Result add(JobPosition jobPosition);

	
	
}
