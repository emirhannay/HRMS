package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entity.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
