package OneToManyMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Answer_1
{
	@Id
	@Column(name="Answer_id")
	
	private int Answerid;
	@Column(name="Answer_name")
	private String Answer;
	
	@ManyToOne
	@JoinColumn(name="Question_id")
	private Question_1 question
	;

	public Answer_1(int answerid, String answer, Question_1 question) {
		super();
		Answerid = answerid;
		Answer = answer;
		this.question = question;
	}

	public Answer_1() {
		super();
		
	}

	public int getAnswerid() {
		return Answerid;
	}

	public void setAnswerid(int answerid) {
		this.Answerid = answerid;
	}

	public String getAnswer() {
		return Answer;
	}

	public void setAnswer(String answer) {
		this.Answer = answer;
	}

	public Question_1 getQuestion() {
		return question;
	}

	public void setQuestion(Question_1 question) {
		this.question = question;
	}
	
	
	
	
	

}
