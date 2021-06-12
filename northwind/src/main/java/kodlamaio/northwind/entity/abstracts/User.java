package kodlamaio.northwind.entity.abstracts;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import kodlamaio.northwind.entity.concretes.Base;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class User extends Base {

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

}
