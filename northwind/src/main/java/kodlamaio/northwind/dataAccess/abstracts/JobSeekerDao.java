package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import kodlamaio.northwind.entity.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer> {
	JobSeeker findByEmail (String title);
	JobSeeker findByNationalId(String identificationNo);
	JobSeeker getById(int id);
}
