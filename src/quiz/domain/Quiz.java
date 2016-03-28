package quiz.domain;

import org.hibernate.Session;
import org.hibernate.Transaction;

import quiz.utility.HibernateUtil;

public class Quiz {
	private String question;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	private String cat;
	private String msisdn;
	private String question_id;
	private int score;
	
	/**
	 * @return the optionB
	 */
	public String getOptionB() {
		return optionB;
	}
	/**
	 * @param optionB the optionB to set
	 */
	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}
	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}
	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}
	/**
	 * @return the optionA
	 */
	public String getOptionA() {
		return optionA;
	}
	/**
	 * @param optionA the optionA to set
	 */
	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}
	/**
	 * @return the optionC
	 */
	public String getOptionC() {
		return optionC;
	}
	/**
	 * @param optionC the optionC to set
	 */
	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}
	/**
	 * @return the optionD
	 */
	public String getOptionD() {
		return optionD;
	}
	/**
	 * @param optionD the optionD to set
	 */
	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}

	
	public static void main(String[] args) {
		
		
		Session s  = HibernateUtil.getSessionFactory().openSession();
		
		Transaction Tx = s.beginTransaction();
	  	   HibernateUtil.getSessionFactory().close();
	  	 Tx.commit();
		   s.close();

		
		
	}
	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	/**
	 * @return the cat
	 */
	public String getCat() {
		return cat;
	}
	/**
	 * @param cat the cat to set
	 */
	public void setCat(String cat) {
		this.cat = cat;
	}
	/**
	 * @return the msisdn
	 */
	public String getMsisdn() {
		return msisdn;
	}
	/**
	 * @param msisdn the msisdn to set
	 */
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	/**
	 * @return the question_id
	 */
	public String getQuestion_id() {
		return question_id;
	}
	/**
	 * @param question_id the question_id to set
	 */
	public void setQuestion_id(String question_id) {
		this.question_id = question_id;
	}
	
	
}
