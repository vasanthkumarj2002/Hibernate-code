package org.jsp.hibernateApp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class SaveEmployee {
  public static void main(String[] args) {
	Employee e=new Employee();
	e.setName("vasanth");
	e.setDesg("java full stack developer");
	e.setSalary(20000);
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory factory=cfg.buildSessionFactory();
	Session s=factory.openSession();
	int id =(Integer) s.save(e);
	Transaction t=s.beginTransaction();
	t.commit();
	System.out.println("The User id is Created "+id);
}
}
