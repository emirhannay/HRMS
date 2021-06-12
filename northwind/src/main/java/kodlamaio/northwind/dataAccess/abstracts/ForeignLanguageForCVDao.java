package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entity.concretes.ForeignLanguageForCV;

public interface ForeignLanguageForCVDao extends JpaRepository<ForeignLanguageForCV, Integer> {
	ForeignLanguageForCV getById(int id);
	List<ForeignLanguageForCV> getAllByJobSeeker_id(int id);

}
