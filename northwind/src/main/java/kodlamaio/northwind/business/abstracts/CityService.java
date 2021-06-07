package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utulities.results.DataResult;
import kodlamaio.northwind.core.utulities.results.Result;
import kodlamaio.northwind.entity.concretes.City;

public interface CityService {
	public Result add(City city);
	
	public Result delete(int id);
	
	public DataResult<List<City>> getAll();
}
