package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utulities.results.DataResult;
import kodlamaio.northwind.core.utulities.results.Result;
import kodlamaio.northwind.entity.concretes.JobPosition;

public interface JobPositionService {
	public DataResult<List<JobPosition>> getAll();
	public Result add(JobPosition jobPosition);

	
	
}
