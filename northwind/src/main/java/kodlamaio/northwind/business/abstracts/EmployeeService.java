package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.entity.concretes.Employee;

public interface EmployeeService {

	DataResult<List<Employee>> getAll();
}
