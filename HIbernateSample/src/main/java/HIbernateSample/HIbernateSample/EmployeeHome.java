package HIbernateSample.HIbernateSample;

// Generated May 10, 2017 2:52:38 PM by Hibernate Tools 3.4.0.CR1

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Home object for domain model class Employee.
 * @see HIbernateSample.HIbernateSample.Employee
 * @author Hibernate Tools
 */
public class EmployeeHome {

	public static void main(String[] args) throws Exception{
		Employee emp=new Employee();
		emp.setUsername("srunjith");
		emp.setStreet("Dunwoody");
		emp.setCity("Atlanta");
		emp.setCountry("USA");
		SessionFactory sf =new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx= session.beginTransaction();
		if (!tx.isActive()) {
		    tx.begin();
		} 
		session.save(emp);
		System.out.println("successfully saved...");
		tx.commit();
		session.close();
	}
}
