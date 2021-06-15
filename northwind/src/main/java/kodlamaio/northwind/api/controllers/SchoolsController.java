package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.SchoolForCVService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;

import kodlamaio.northwind.entity.concretes.SchoolForCV;

@RestController
@RequestMapping(path = "api/schools")
public class SchoolsController {

	private SchoolForCVService schoolForCVService;
	

	@Autowired
	public SchoolsController(SchoolForCVService schoolForCVService) {
		super();
		this.schoolForCVService = schoolForCVService;
	}
	
	@PostMapping(path = "/add")
	Result add(@RequestBody SchoolForCV schoolForCV) {
		return schoolForCVService.add(schoolForCV);
	}
	
	@PostMapping(path = "/update")
	Result update(@RequestBody SchoolForCV schoolForCV) {
		return schoolForCVService.update(schoolForCV);
	}
	
	@PostMapping(path = "/delete")
	Result delete(@RequestParam int id) {
		return schoolForCVService.delete(id);
	}
	
	@GetMapping(path = "/getById")
	DataResult<SchoolForCV> getById(@RequestParam int id) {
		return schoolForCVService.getById(id);
	}
	
	@GetMapping(path = "/getAll")
	DataResult<List<SchoolForCV>> getAll() {
		return schoolForCVService.getAll();
	}

	@GetMapping(path = "/getAllByJobSeekerId")
	DataResult<List<SchoolForCV>> getAllByJobSeekerId(@RequestParam int id) {
		return schoolForCVService.getAllByJobSeekerId(id);
	}
	
	@GetMapping(path = "/getAllByJobSeekerIdOrderByEndAtDesc")
	DataResult<List<SchoolForCV>> getAllByJobSeekerIdOrderByEndAtDesc(@RequestParam int id){
		return schoolForCVService.getAllByJobSeekerIdOrderByEndAtDesc(id);
	}
}
