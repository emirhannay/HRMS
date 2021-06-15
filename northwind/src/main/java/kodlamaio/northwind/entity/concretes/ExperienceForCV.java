package kodlamaio.northwind.entity.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "cv_experiences")
@NoArgsConstructor
@AllArgsConstructor
public class ExperienceForCV extends Base {

	@Column(name = "working_place")
	private String workingPlace;
	
	@Column(name = "position")
	private String position;
	
	@Column(name = "start_at")
	private LocalDate startAt;
	
	@Column(name = "end_at", nullable = true)
	private LocalDate endAt;
	
	@ManyToOne()
	@JoinColumn(name = "jobSeeker_id")
	@JsonIgnore
	private JobSeeker jobSeeker;
	
	
}



