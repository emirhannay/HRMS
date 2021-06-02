package kodlamaio.northwind.entity.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "job_positions")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobPosition {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "title")
	private String title;
}