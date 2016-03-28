package quiz.Dao;

import java.util.List;

public interface QuizRepository {
	
	public String  getQuestion(String msisdn,String id,String cat);
	public List<Object[]>  getOption(String question_id,String cat,String msisdn);
	public String  getAnswer(String msisdn,String id);
	public int     getScore(String msisdn,String cat);
	public void InsertUsersQuizDetails(String msisdn,String answer,String question_id,String cat);
    public void updateScoreAndQuestion_id(String msisdn,String cat,String question_id,int score);


}
