package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.CoverLetterForCVService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entity.concretes.CoverLetterForCV;

@RestController
@RequestMapping(path = "api/coverLetters")
public class CoverLettersController {
	CoverLetterForCVService coverLetterForCVService;
	
	@Autowired
	public CoverLettersController(CoverLetterForCVService coverLetterForCVService) {
		super();
		this.coverLetterForCVService = coverLetterForCVService;
	}
	
	@PostMapping(path = "/add")
	public Result add(@RequestBody CoverLetterForCV coverLetterForCV) {
		
		return this.coverLetterForCVService.add(coverLetterForCV);
	}
	
	@PostMapping(path = "/update")
	public Result update(@RequestBody CoverLetterForCV coverLetterForCV) {
		return this.coverLetterForCVService.update(coverLetterForCV);
	}
	
	@PostMapping(path = "/delete")
	public Result delete(@RequestParam int id) {
		return this.coverLetterForCVService.delete(id);
	}
	
	@GetMapping(path = "/getById")
	public DataResult<CoverLetterForCV> getById(@RequestParam(name = "id") int id) {
		return this.coverLetterForCVService.getById(id);
	}
	
	@GetMapping(path = "/getAll")
	public DataResult<List<CoverLetterForCV>> getAll(){
		return this.coverLetterForCVService.getAll();
	}
}
