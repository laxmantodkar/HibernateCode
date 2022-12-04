package OneToManyMapping;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import OneToOneMapping.Answer;
@Entity
public class Question_1 
{
	@Id
	@Column(name="Question_id",length=4)

	private int QuestionId;
	@Column(name="Question_Name",length=50)
    private String Question;
	
	@OneToMany
	@JoinColumn(name="Answer_id")//rename of join column only
	private List<Answer_1> Ans;

	public Question_1(int questionId, String question, List<Answer_1> ans) {
		super();
		QuestionId = questionId;
		Question = question;
		Ans = ans;
	}

	public Question_1() {
		super();
		
	}

	public int getQuestionId() {
		return QuestionId;
	}

	public void setQuestionId(int questionId) {
		this.QuestionId = questionId;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		this.Question = question;
	}

	public List<Answer_1> getAns() {
		return Ans;
	}

	public void setAns(List<Answer_1> ans) {
		this.Ans = ans;
	}

	
}
