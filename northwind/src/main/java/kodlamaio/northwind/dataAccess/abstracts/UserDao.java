package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entity.abstracts.User;

public interface UserDao extends JpaRepository<User, Integer>{
	User findUserByEmail(String email);
}