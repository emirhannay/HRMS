package kodlamaio.northwind.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ExperienceForCVService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entity.concretes.ExperienceForCV;

@RestController
@RequestMapping(path = "api/experiences")
public class ExperiencesController {
	ExperienceForCVService experienceForCVService;
	
	@Autowired
	public ExperiencesController(ExperienceForCVService experienceForCVService) {
		super();
		this.experienceForCVService = experienceForCVService;
	}
	
	@PostMapping(path = "/add")
	public Result add(@RequestBody ExperienceForCV experienceForCV) {
		return experienceForCVService.add(experienceForCV);
		
	}
	
	@PostMapping(path = "/update")
	public Result update(@RequestBody ExperienceForCV experienceForCV) {
		return experienceForCVService.update(experienceForCV);
	}
	
	@PostMapping(path = "/delete")
	public Result delete(@RequestParam int id) {
		return experienceForCVService.delete(id);
	}
	
	@GetMapping(path = "/getById")
	public DataResult<ExperienceForCV> getById(@RequestParam int id){
		return experienceForCVService.getById(id);
	}
	
	
}
