package kodlamaio.northwind.entity.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "cv_programming_skills")
@NoArgsConstructor
@AllArgsConstructor
public class ProgrammingSkillForCV extends Base {
	@Column(name = "skill_name")
	private String skillName;
	
	
	@ManyToOne()
	@JoinColumn(name = "jobSeeker_id")
	private JobSeeker jobSeeker;
}
