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
@Table(name = "employers")
@PrimaryKeyJoinColumn(name = "user_id")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employer extends User{
	@Column(name = "company_name")
	private String companyName;
	@Column(name = "website")
	private String website;
	@Column(name= "phone_number")
	private String phoneNumber;
	@Column(name = "is_verified", columnDefinition = "boolean default false")
	private boolean isVerified = false;
}
