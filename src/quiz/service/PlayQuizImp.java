package quiz.service;

import java.util.ArrayList;
import java.util.List;

import quiz.Dao.QuizRepositoryImp;
import quiz.domain.Quiz;
import quiz.utility.HibernateOperations;
import quiz.validate.ValidationImp;

public class PlayQuizImp implements PlayQuiz {

	@Override
	public Quiz getQuestionAndOption(String msisdn, String cat,
			String question_id) {
		Quiz quiz = new Quiz();
		
		quiz.setCat(cat);
		quiz.setMsisdn(msisdn);
		
		QuizRepositoryImp qr = new QuizRepositoryImp();
		quiz.setQuestion(qr.getQuestion(msisdn, question_id, cat));
		
		List<Object[]> ls_ob = new ArrayList<Object[]>();

		
		
		
		
		ls_ob = qr.getOption(question_id, cat,msisdn);

		for (Object[] ob : ls_ob) {
			quiz.setOptionA((String) ob[0]);
			quiz.setOptionB((String) ob[1]);
			quiz.setOptionC((String) ob[2]);
			quiz.setOptionD((String) ob[3]);
		}
		
		
		HibernateOperations hibernateOperations = new HibernateOperations();
		if(question_id==null || question_id.equalsIgnoreCase("")){
			ValidationImp vi =  new ValidationImp(hibernateOperations);
			System.out.println("question_id is null getting question id ");
			int id  = vi.getQuestionid(msisdn, cat);
			question_id = Integer.toString(id);
			System.out.println("questio id is "+question_id);
			quiz.setQuestion_id(question_id);
		}else{
			
			int q_id = 0;
			q_id = Integer.parseInt(question_id); 
			q_id = q_id+1;
			question_id = q_id+"";
			quiz.setQuestion_id(question_id);
			
		}
		
		
		int score = qr.getScore(msisdn, cat);
		quiz.setScore(score);

		// TODO Auto-generated method stub
		return quiz;
	}

}
