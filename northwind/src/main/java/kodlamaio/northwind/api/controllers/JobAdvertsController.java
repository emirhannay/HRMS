package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.JobAdvertService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entity.concretes.JobAdvert;

@RestController
@RequestMapping(path = "api/jobAdvert")
public class JobAdvertsController {

	private JobAdvertService jobAdvertService;

	@Autowired
	public JobAdvertsController(JobAdvertService jobAdvertService) {
		super();
		this.jobAdvertService = jobAdvertService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody JobAdvert jobAdvert) {
		return this.jobAdvertService.add(jobAdvert);
	}

	@PostMapping("/update")
	public Result update(JobAdvert jobAdvert) {
		return jobAdvertService.update(jobAdvert);

	}

	@PostMapping("/delete")
	public Result delete(int id) {
		return jobAdvertService.delete(id);

	}

	@GetMapping("/getById")
	public DataResult<JobAdvert> getById(int id) {
		return jobAdvertService.getById(id);
	}

	@GetMapping("/getAll")
	public DataResult<List<JobAdvert>> getAll() {
		return jobAdvertService.getAll();
	}
	@GetMapping("/getAllOpenJobAdvertList")
	public DataResult<List<JobAdvert>> getAllOpenJobAdvertList() {
		return jobAdvertService.getAllOpenJobAdvertList();
	}
	
	@GetMapping("/findAllByOrderByPublishedAt")
	public DataResult<List<JobAdvert>> findAllByOrderByPublishedAt() {
		return jobAdvertService.findAllByOrderByPublishedAt();
	}
	
	@GetMapping("/getAllOpenJobAdvertByEmployer")
	public DataResult<List<JobAdvert>> getAllOpenJobAdvertByEmployer(int id){
		return jobAdvertService.getAllOpenJobAdvertByEmployer(id);
	}

}
