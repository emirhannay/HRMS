package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entity.concretes.ImageForCV;

public interface ImageForCVDao extends JpaRepository<ImageForCV, Integer>{
	ImageForCV getById(int id);
	
	ImageForCV getByJobSeeker_id(int id);
}
