package kodlamaio.northwind.entity.concretes;


import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdverts"})
public class Employer extends User{
	@Column(name = "company_name")
	private String companyName;
	@Column(name = "website")
	private String website;
	@Column(name= "phone_number")
	private String phoneNumber;
	@Column(name = "is_verified", columnDefinition = "boolean default false")
	private boolean isVerified = false;
	
	@OneToMany(mappedBy = "employer")
	private List<JobAdvert> jobAdverts;
}
