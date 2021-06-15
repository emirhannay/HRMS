package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.JobSeekerService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entity.concretes.JobSeeker;

@RestController
@RequestMapping(path = "api/job-seekers")
public class JobSeekersController {
	private JobSeekerService jobSeekerService;
	
	@Autowired
	public JobSeekersController(JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}
	@GetMapping("/getAll")
	public 		DataResult<List<JobSeeker>> getAll(){
		return jobSeekerService.getAll();
	};
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeeker jobSeeker) {
		return jobSeekerService.add(jobSeeker);
	};
	
	
	
	
	

}
