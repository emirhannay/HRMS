package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.EmployeeService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.dataAccess.abstracts.EmployeeDao;
import kodlamaio.northwind.entity.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService{

	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public DataResult<List<Employee>> getAll() {
		
		return new SuccessDataResult<List<Employee>>(employeeDao.findAll());
	}

}
