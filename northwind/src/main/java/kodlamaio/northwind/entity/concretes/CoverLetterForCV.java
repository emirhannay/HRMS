package kodlamaio.northwind.entity.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "cv_cover_letters")
@NoArgsConstructor
public class CoverLetterForCV extends Base{

	public CoverLetterForCV(String content, int jobSeekerId) {
		super();
		this.content = content;
		this.jobSeeker.setId(jobSeekerId);
	}
	
	@Column(name ="content")
	private String content;
	
	@ManyToOne()
	@JoinColumn(name = "jobSeeker_id")
	@JsonIgnore
	private JobSeeker jobSeeker;
}  
