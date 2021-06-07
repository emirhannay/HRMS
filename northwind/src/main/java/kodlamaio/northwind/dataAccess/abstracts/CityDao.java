package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entity.concretes.City;

public interface CityDao extends JpaRepository<City, Integer>{

	
	
}
