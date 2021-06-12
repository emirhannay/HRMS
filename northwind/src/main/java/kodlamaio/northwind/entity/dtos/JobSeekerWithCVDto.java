package kodlamaio.northwind.entity.dtos;

import java.util.List;

import kodlamaio.northwind.entity.concretes.ExperienceForCV;
import kodlamaio.northwind.entity.concretes.ForeignLanguageForCV;
import kodlamaio.northwind.entity.concretes.ImageForCV;
import kodlamaio.northwind.entity.concretes.JobSeeker;
import kodlamaio.northwind.entity.concretes.LinkForCV;
import kodlamaio.northwind.entity.concretes.ProgrammingSkillForCV;
import kodlamaio.northwind.entity.concretes.SchoolForCV;

public class JobSeekerWithCVDto {

	public JobSeeker JobSeeker;
	
	public List<SchoolForCV> schools;
	
	public List<ProgrammingSkillForCV> programingSkills;
	
	public List<LinkForCV> links;
	
	public List<ForeignLanguageForCV> languages;
	
	public List<ExperienceForCV> experiences;
	
	public ImageForCV image;
	
}
