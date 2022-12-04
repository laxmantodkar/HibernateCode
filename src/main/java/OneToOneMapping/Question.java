package OneToOneMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question 
{
	@Id
	@Column(name="Question_id",length=4)
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int QuestionId;
	@Column(name="Question_Name",length=50)
    private String Question;
	
	@OneToOne
	@JoinColumn(name="Answer_id")//rename of join column only
	private Answer Ans;
	public Question(int questionId, String question) 
	{
		this.QuestionId = questionId;
		this.Question = question;
	}
	public Question()
	{
		super();
		
	}
	public int getQuestionId(int Questionid) {
		return QuestionId;
	}
	public Answer getAns() {
		return Ans;
	}
	public void setAns(Answer ans) {
		this.Ans = ans;
	}
	public void setQuestionId(int questionId) {
		this.QuestionId = questionId;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion( String Question) {
		 this.Question = Question;
	
	}
}
