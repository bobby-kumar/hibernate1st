package Com.ibernate.Project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Connection.StudentDetails;


public class App 
{
    public static void main( String[] args )
    {
    	//configure
    	Configuration cfg=new Configuration();
   	     cfg.configure("hibernate.cfg.xml");
   	    //sessionFactory
   	    SessionFactory sessionFactory =cfg.buildSessionFactory();
   	     //session
   	    Session session=sessionFactory.openSession();
   	    //Traction
   	   Transaction tr=session.beginTransaction();
   	   
   	   
   	   //create database of student.
   	StudentDetails std=new StudentDetails();
	 std.setContact("9653669785");
	 std.setStd_name("robin");
	 //save in database
	 session.save(std);
	 //commit
	 tr.commit();
	 System.out.println( "Sussefully created" );
	 //close
	 session.close();
    }
}
