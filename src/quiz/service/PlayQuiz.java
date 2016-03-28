package quiz.service;

import java.util.List;

import quiz.domain.Quiz;

public interface PlayQuiz {
	
	public Quiz getQuestionAndOption(String msisdn,String cat,String question_id);
    //public Quiz getOptions(String  msisdn,String question_id,String cat);
    
	
}
