package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entity.concretes.ExperienceForCV;

public interface ExperienceForCVService {
		Result add(ExperienceForCV experienceForCV);
		Result update(ExperienceForCV experienceForCV);
		Result delete(int id);
		DataResult<ExperienceForCV> getById(int id);
		DataResult<List<ExperienceForCV>> getAll();
		DataResult<List<ExperienceForCV>> getAllByJobSeekerIdOrderByEndAtDesc(int id);
		DataResult<List<ExperienceForCV>> getAllByJobSeekerId(int id);
}	
