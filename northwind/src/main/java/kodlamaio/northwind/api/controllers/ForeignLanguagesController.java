package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ForeignLanguageForCVService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entity.concretes.ForeignLanguageForCV;

@RestController
@RequestMapping(path = "api/foreignLangugaes")
public class ForeignLanguagesController {
	ForeignLanguageForCVService foreignLanguageForCVService;

	@Autowired
	public ForeignLanguagesController(ForeignLanguageForCVService foreignLanguageForCVService) {
		super();
		this.foreignLanguageForCVService = foreignLanguageForCVService;
	}

	@PostMapping(path = "/add")
	Result add(@RequestBody ForeignLanguageForCV foreignLanguageForCV) {
		return foreignLanguageForCVService.add(foreignLanguageForCV);
	};

	@PostMapping(path = "/update")
	Result update(@RequestBody ForeignLanguageForCV foreignLanguageForCV) {
		return foreignLanguageForCVService.update(foreignLanguageForCV);
	};
	
	@PostMapping(path = "/delete")
	Result delete(@RequestParam(name = "id") int id) {
		return foreignLanguageForCVService.delete(id);
	};
	
	@GetMapping(path = "/getById")
	DataResult<ForeignLanguageForCV> getById(@RequestParam(name = "id" ) int id) {
		return foreignLanguageForCVService.getById(id);
	};
	
	@GetMapping(path = "/getAll")
	DataResult<List<ForeignLanguageForCV>> getAll() {
		return foreignLanguageForCVService.getAll();
	};
	
	@GetMapping(path = "/getAllByJobS")
	DataResult<List<ForeignLanguageForCV>> getAllByJobSeekerId(@RequestParam(name = "id")  int id) {
		return foreignLanguageForCVService.getAllByJobSeekerId(id);
	};

}
