package kodlamaio.northwind.entity.concretes;



import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


import kodlamaio.northwind.entity.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "jobseekers")
@PrimaryKeyJoinColumn(name = "user_id")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class JobSeeker extends User {

	
    public JobSeeker(String firstName, String lastName, String identificationNo, LocalDate birthDate, String email, String password)
    {
        super(email,password);
        this.firstName=firstName;
        this.lastName=lastName;
        this.identificationNo=identificationNo;
        this.birthDate=birthDate;
    }
	
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "national_id")
	private String identificationNo;
	@Column(name = "date_of_birth")
	private LocalDate birthDate;
	@Column(name ="is_verified")
	private boolean isVerified;
	

	

	
}
	