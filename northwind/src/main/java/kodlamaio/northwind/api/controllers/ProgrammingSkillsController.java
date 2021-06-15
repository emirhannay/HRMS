package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProgrammingSkillForCVService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entity.concretes.ProgrammingSkillForCV;

@RestController
@RequestMapping(path = "api/programmingSkills")
public class ProgrammingSkillsController {
	private ProgrammingSkillForCVService programmingSkillForCVService;

	@Autowired
	public ProgrammingSkillsController(ProgrammingSkillForCVService programmingSkillForCVService) {
		super();
		this.programmingSkillForCVService = programmingSkillForCVService;
	}
	
	@PostMapping(path = "/add")
	Result add(@RequestBody ProgrammingSkillForCV programmingSkillForCV) {
		return programmingSkillForCVService.add(programmingSkillForCV);
	}
	
	@PostMapping(path = "/update")
	Result update(@RequestBody ProgrammingSkillForCV programmingSkillForCV) {
		return programmingSkillForCVService.update(programmingSkillForCV);
	}
	
	@PostMapping(path = "/delete")
	Result delete(@RequestParam int id) {
		return programmingSkillForCVService.delete(id);
	}
	
	@GetMapping(path = "/getById")
	DataResult<ProgrammingSkillForCV> getById(@RequestParam int id) {
		return programmingSkillForCVService.getById(id);
	}
	
	@GetMapping(path = "/getAll")
	DataResult<List<ProgrammingSkillForCV>> getAll() {
		return programmingSkillForCVService.getAll();
	}

	@GetMapping(path = "/getAllByJobSeekerId")
	DataResult<List<ProgrammingSkillForCV>> getAllByJobSeekerId(@RequestParam int id) {
		return programmingSkillForCVService.getAllByJobSeekerId(id);
	}
}
