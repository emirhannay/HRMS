package kodlamaio.northwind.entity.concretes;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import kodlamaio.northwind.entity.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employees")
@PrimaryKeyJoinColumn(name = "user_id")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee extends User {
	@Column(name = "firs_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	
}
