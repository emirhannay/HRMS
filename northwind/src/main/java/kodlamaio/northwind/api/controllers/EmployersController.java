package kodlamaio.northwind.api.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.EmployerService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entity.concretes.Employer;

@RestController
@RequestMapping(path = "api/employer")
public class EmployersController {
	private EmployerService employerService;

	@Autowired
	public EmployersController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@GetMapping(path = "getAll")
	public DataResult<List<Employer>> getAll() {
		return this.employerService.getAll();
	}
	
	@GetMapping(path = "save")
	public Result add(@RequestBody Employer employer) {
		return this.employerService.add(employer);
	}
}
