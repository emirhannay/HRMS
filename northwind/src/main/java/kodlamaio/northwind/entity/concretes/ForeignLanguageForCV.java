package kodlamaio.northwind.entity.concretes;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "cv_foreign_languages")
@NoArgsConstructor
@AllArgsConstructor
public class ForeignLanguageForCV extends Base{
	
	@Column(name = "language")
	private String language;
	
	@Min(value = 1)
	@Max(value = 5)
	@Column(name = "level")
	private int level;
	
	@ManyToOne()
	@JoinColumn(name = "jobSeeker_id")
	@JsonIgnore
	private JobSeeker jobSeeker;
}
