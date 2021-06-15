package kodlamaio.northwind.api.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.JobPositionService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entity.concretes.JobPosition;


@RestController
@RequestMapping(path = "api/job-positions")
public class JobPositionsController {
	private JobPositionService jobPositionService;

	@Autowired
	public JobPositionsController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
		
	}
	@GetMapping(path = "getall")
	public DataResult<List<JobPosition>> getAll(){
        return jobPositionService.getAll();
    }
	
	@PostMapping(path = "save")
	public Result add(@RequestBody JobPosition jobPosition) {
		return this.jobPositionService.add(jobPosition);
	}
	
}
