package OneToOneMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Answer 
{
	@Id
	@Column(name="Answer_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int Answerid;
	@Column(name="Answer_name")
	
	private String Answer;
	
	@OneToOne
	private Question questionId;

	public Answer(int answerid, String answer, Question question) 
	{
		super();
		Answerid = answerid;
		Answer = answer;
		this.questionId = question;
	}

	public int getAnswerid() 
	{
		return Answerid;
	}

	public void setAnswerid(int answerid) {
		Answerid = answerid;
	}

	public String getAnswer() {
		return Answer;
	}

	public void setAnswer(String answer) {
		Answer = answer;
	}

	public Question getQuestion() {
		return questionId;
	}

	public void setQuestion(Question question) {
		this.questionId = question;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
      
	
}
