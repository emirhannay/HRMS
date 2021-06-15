package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entity.concretes.LinkForCV;

public interface LinkForCVDao extends JpaRepository<LinkForCV, Integer>{
	LinkForCV getById(int id);
	List<LinkForCV> getAllByJobSeeker_id(int id);
}
