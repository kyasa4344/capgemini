package org.tutorials.course;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App{

	public static void main(String[] args) {
		System.out.println( "Project started" );
		//connection established to the hibernate
		Configuration cfg = new Configuration();
		cfg.configure("course.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		// creating a Employee object

		Course cg=new Course();
		cg.setCourseID(100);
		cg.setCourseName("React Full Stack");
		cg.setCoursePrice(200000);
		cg.setCourseDuration(2);
		System.out.println(cg);

		Session session= factory.openSession(); //Getting the data saved
		Transaction tx= session.beginTransaction();

		
		session.save(cg);
		tx.commit();; // Record saved to the database
		session.close();	
		System.out.println("Record saved succesfully itno the database!!!");
    }

}