package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.CityService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.CityDao;
import kodlamaio.northwind.entity.concretes.City;

@Service
public class CityManager implements CityService {
	
	CityDao cityDao;
	
	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public Result add(City city) {
		this.cityDao.save(city);
		return new SuccessResult("City has been added.");
	}

	@Override
	public Result delete(int id) {
		this.cityDao.deleteById(id);
		return new SuccessResult("City has been deleted.");
	}

	@Override
	public DataResult<List<City>> getAll() {
		
		return new SuccessDataResult<List<City>>(cityDao.findAll());
	}

}
