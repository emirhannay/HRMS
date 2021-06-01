package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entity.concretes.Employer;
import kodlamaio.northwind.entity.concretes.JobSeeker;

public interface EmployerDao extends JpaRepository<Employer, Integer>{
	Employer findByEmail(String email);
}
