package quiz.validate;

import java.util.ArrayList;
import java.util.List;

import quiz.utility.HibernateOperations;

public class ValidationImp{
	HibernateOperations hibernateOperations;
	
	
	public ValidationImp(HibernateOperations hibernateOperations){
		this.hibernateOperations  =hibernateOperations;
	}
	
	
	public int checkMaxid(String msisdn, String cat) {
		// TODO Auto-generated method stub
		return 0;
	}


	public boolean isRightAnswer(String msisdn, String question_id,
			String users_answer) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean isquestionLimitcrossed(String msisdn, String cat,
			String question_id) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public int getQuestionid(String msisdn, String cat) {
		List<Object> ls =  new ArrayList<Object>();
		String  query = "select max(question_id) from Users_Score where msisdn like '"+msisdn+"' and cat  like '"+cat+"'";
		 ls = hibernateOperations.getListForSingleColumn(query);
		 int id=0;
		 
		 if(ls.isEmpty()){
			 System.out.println("ls is empty ");
			 id= getQuestionIdCoordingTocat(cat);
			 return id;
		 }
		 else{
			 System.out.println("ls not empty ");
		 }
		 Object o = ls.get(0);
		 if(o == null){
			 System.out.println("null object ");
			 id= getQuestionIdCoordingTocat(cat);
			 return id;
		 }
		id = (int)o;
		System.out.println("---id----is "+id);
		
	
		return id;
	}
	
	
	public int getQuestionIdCoordingTocat(String cat){
		int question_id=0;
		if(cat.equalsIgnoreCase("cat1")){
		question_id =100001;
		}
		if(cat.equalsIgnoreCase("cat2")){
			question_id =200001;
		}
		if(cat.equalsIgnoreCase("cat3")){
			question_id =300001;
		}
		if(cat.equalsIgnoreCase("cat4")){
			question_id =400001;
		}
		return question_id;
		
	}

}
