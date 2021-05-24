package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.entity.concretes.JobTitle;

public interface JobTitleService {
	public List<JobTitle> getAll();
	public void save(JobTitle jobTitle);
	
}
