package quiz.validate.table;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="users_score")
public class Users_Score {
	
	@Id
	@Column(name="question_id")
	int question_id;
	
	
	@Column(name="msisdn")
	String msisdn;
	
	
	@Column(name="score")
	int score;
	@Column(name="cat")
	String cat;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="datetime",nullable=false,
	columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	Date datetime;
	
	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	

}
