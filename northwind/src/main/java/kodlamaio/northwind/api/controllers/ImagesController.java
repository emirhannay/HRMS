package kodlamaio.northwind.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.northwind.business.abstracts.ImageForCVService;
import kodlamaio.northwind.business.abstracts.JobSeekerService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entity.concretes.ImageForCV;
import kodlamaio.northwind.entity.concretes.JobSeeker;

@RestController
@RequestMapping(path = "api/images")
public class ImagesController {
	private ImageForCVService imageForCVService;
	private JobSeekerService jobSeekerService;
	
	@Autowired
	public ImagesController(ImageForCVService imageForCVService, JobSeekerService jobSeekerService) {
		super();
		this.imageForCVService = imageForCVService;
		this.jobSeekerService = jobSeekerService;
	}
	
	@PostMapping(path = "/add")
	public Result add(@RequestParam(value = "id") int id, @RequestParam(value = "imageFile") MultipartFile imageFile) {
		JobSeeker jobSeeker = this.jobSeekerService.getById(id).getData();
		ImageForCV imageForCV = new ImageForCV();
		imageForCV.setJobSeeker(jobSeeker);
		return this.imageForCVService.add(imageForCV, imageFile);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody ImageForCV imageForCV){
		return this.imageForCVService.update(imageForCV);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.imageForCVService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<ImageForCV> getById(@RequestParam("id") int id){
		return this.imageForCVService.getById(id);
	}
	
	@GetMapping("/getByJobseekerId")
	public DataResult<ImageForCV> getByJobseekerId(@RequestParam int id){
		return this.imageForCVService.getByJobseekerId(id);
	}
	
}
