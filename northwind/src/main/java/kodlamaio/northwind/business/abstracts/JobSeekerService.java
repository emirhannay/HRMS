package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utulities.results.DataResult;
import kodlamaio.northwind.core.utulities.results.Result;
import kodlamaio.northwind.entity.concretes.JobSeeker;

public interface JobSeekerService {
	public Result add(JobSeeker jobSeeker);
	DataResult<List<JobSeeker>> getAll();
	DataResult<JobSeeker> getByNationalId(String nationalId);
}
