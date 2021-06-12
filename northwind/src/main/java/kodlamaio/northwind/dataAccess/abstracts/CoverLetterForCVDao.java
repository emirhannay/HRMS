package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entity.concretes.CoverLetterForCV;

public interface CoverLetterForCVDao extends JpaRepository<CoverLetterForCV, Integer> {

	CoverLetterForCV getById(int id);
}
