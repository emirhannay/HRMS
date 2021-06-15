package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.LinkForCVService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entity.concretes.LinkForCV;

@RestController
@RequestMapping(path = "api/links")
public class LinksController {
	private LinkForCVService linkForCVService;

	@Autowired
	public LinksController(LinkForCVService linkForCVService) {
		super();
		this.linkForCVService = linkForCVService;
	}
	
	@PostMapping(path = "/add" )
	Result add(@RequestBody LinkForCV linkForCV) {
		return linkForCVService.add(linkForCV);
	}
	
	@PostMapping(path = "/update")
	Result update(@RequestBody LinkForCV linkForCV) {
		return linkForCVService.update(linkForCV);
	}
	
	@PostMapping(path = "/delete")
	Result delete(@RequestParam int id) {
		return linkForCVService.delete(id);
	}
	
	@GetMapping(path = "/getById")
	DataResult<LinkForCV> getById(@RequestParam int id) {
		return linkForCVService.getById(id);
	}
	
	@GetMapping(path = "/getAll")
	DataResult<List<LinkForCV>> getAll() {
		return linkForCVService.getAll();
	}
	
	@GetMapping(path = "/getAllByJobSeekerId")
	DataResult<List<LinkForCV>> getAllByJobSeekerId(@RequestParam int id) {
		return linkForCVService.getAllByJobSeekerId(id);
	}
}
