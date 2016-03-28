package quiz.Dao;

import java.util.ArrayList;
import java.util.List;

import quiz.utility.HibernateOperations;
import quiz.validate.ValidationImp;

public class QuizRepositoryImp implements QuizRepository{
	HibernateOperations hibernateOperations = new HibernateOperations();
	
	
	@Override
	public String getQuestion(String msisdn, String question_id,String cat) {
		int q_id=0;
		//getting question id if question id is null
		if(question_id==null){
			ValidationImp vi =  new ValidationImp(hibernateOperations);
			System.out.println("question_id is null getting question id ");
			int id  = vi.getQuestionid(msisdn, cat);
			question_id = Integer.toString(id);
			System.out.println("questio id is "+question_id);
		}else{
			//if question_id is not null than increment the question id to display next  question to the user
			/*question_id =question_id+1;*/
			q_id = Integer.parseInt(question_id); 
			q_id = q_id+1;
			question_id = q_id+"";
		}
		
		
		String query = "select question from Questions where question_id like '"+question_id+"' and cat like '"+cat+"'";
		List<Object> ls  = new ArrayList<Object>();
		ls = hibernateOperations.getListForSingleColumn(query);
		String question = (String)ls.get(0);
		return question;
	}

	@Override
	public List<Object[]> getOption(String question_id, String cat,String msisdn) {
		int q_id=0;
		//getting question id if question id is null
				if(question_id==null){
					ValidationImp vi =  new ValidationImp(hibernateOperations);
					System.out.println("question_id is null getting question id ");
					int id  = vi.getQuestionid(msisdn, cat);
					question_id = Integer.toString(id);
					System.out.println("questio id is "+question_id);
				}else{
					
					q_id = Integer.parseInt(question_id); 
					q_id = q_id+1;
					question_id = q_id+"";
					}
		
		
		String query	= "select optionA,optionB,optionC,optionD from Options "
				+ "where question_id  like '"+question_id+"' and cat like '"+cat+"'";
		List<Object[]> ls_ob = new ArrayList<Object[]>();
		ls_ob = hibernateOperations.getResultList(query);
		
		return ls_ob;
	}

	@Override
	public String getAnswer(String msisdn, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getScore(String msisdn, String cat) {
		
		
		String query = "select score from Users_Score where msisdn like '"+msisdn+"' and cat like '"+cat+"'";
		List<Object> ls_ob = new ArrayList<Object>();
		ls_ob = hibernateOperations.getListForSingleColumn(query);
		if(ls_ob.isEmpty()){
			return 0;
		}
		/*String score = ls_ob.get(0);*/
		Object o = ls_ob.get(0);
		int score = (int)o;
		System.out.println("score i "+score);
		// TODO Auto-generated method stub
		return score;
	}

	@Override
	public void updateScoreAndQuestion_id(String msisdn, String cat,
			String question_id, int score) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void InsertUsersQuizDetails(String msisdn, String answer,
			String question_id, String cat) {
		// TODO Auto-generated method stub
		
	}

}
