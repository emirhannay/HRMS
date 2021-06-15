package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Component;

import kodlamaio.northwind.entity.concretes.JobPosition;

@Component
public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {
	JobPosition findByJobTitle(String title);
	JobPosition getById(int id);
}
	