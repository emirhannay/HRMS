package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.northwind.business.abstracts.JobTitleService;
import kodlamaio.northwind.entity.concretes.JobTitle;

@RestController
@RequestMapping(path = "api/job-titles")
public class JobTitlesController {
	private final JobTitleService jobTitleService;

	public JobTitlesController(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
		
	}
	@GetMapping(path = "getall")
	public List<JobTitle> getAll(){
        return this.jobTitleService.getAll();
    }
	
	@GetMapping(path = "save")
	public void save(JobTitle jobTitle) {
		this.jobTitleService.save(jobTitle);
	}
	
}
