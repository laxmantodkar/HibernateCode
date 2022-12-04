package OneToOneMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Course 
{
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int courceId;
	@Column(name="Cource_Name")
	private String cource;
	@Column(name="Cource_Duration")
	private int duration;
	@Column(name="Cource_Free")
	private int free;
	@OneToOne
	private Student std;
	
	public Course(int courceId, String cource, int duration, int free,Student std) {
	
		this.courceId = courceId;
		this.cource = cource;
		this.duration = duration;
		this.free = free;
		this.std=std;
	}
	public Student getStd() {
		return std;
	}
	public void setStd(Student std) {
		this.std = std;
	}
	public Course() {
		super();
		
	}
	public int getCourceId() {
		return courceId;
	}
	public void setCourceId(int courceId) {
		this.courceId = courceId;
	}
	public String getCource() {
		return cource;
	}
	public void setCource(String cource) {
		this.cource = cource;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getFree() {
		return free;
	}
	public void setFree(int free) {
		this.free = free;
	}
	
		
	}
	
	
