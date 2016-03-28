package quiz.utility;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateOperations {
	
	Session session;
	
public List<Object[]> getResultList(String query){
		
		session = HibernateUtil.getSessionFactory().getCurrentSession();
	    List<Object[]> ls_ob = new ArrayList<Object[]>();
		
		Transaction tx = null;
	
		try {
			tx = session.beginTransaction();

		Query q = session.createQuery(query);
     
		ls_ob  = (List<Object[]>)q.list();

	}catch (HibernateException ex) {
		if (tx != null) {
			System.out.println("Exception in getList method " + ex);
			
			  tx.rollback(); 
			  ex.printStackTrace();
			 
		}
		System.out.println("Exception getList tx open" + ex);
	} finally {
		session.close();
	}
		
		return ls_ob;
	}
	
	
	
	
	
	
public List<Object> getListForSingleColumn(String query){
		
	session = HibernateUtil.getSessionFactory().getCurrentSession();
	/*	session = HibernateUtil.getSessionFactory().openSession();*/
		
		List<Object> ls_ob = new ArrayList<Object>();
		
		Transaction tx = null;
	
		try {
			tx = session.beginTransaction();

		Query q = session.createQuery(query);
         
		ls_ob  = q.list();

	}catch (HibernateException ex) {
		if (tx != null) {
			System.out.println("Exception in getList method " + ex);
			
			  tx.rollback(); 
			  ex.printStackTrace();
			 
		}
		System.out.println("Exception getList tx open" + ex);
	} finally {
		session.close();
	}
		
		return ls_ob;
	}

}
