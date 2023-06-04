package org.jsp.hibernateApp;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class UpdateEmployee {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the User Id to Update record: ");
	 int eid=sc.nextInt();
	 System.out.println("Enter the name,desg and salary: ");
	 String name=sc.next();
	 String desg=sc.next();
	 double salary=sc.nextDouble();
	Employee e=new Employee();
	  e.setId(eid);
	  e.setName(name);
	  e.setDesg(desg);
	  e.setSalary(salary);
	  Session session=new Configuration().configure().buildSessionFactory().openSession();
	  session.update(e);
	  Transaction t=session.beginTransaction();
	  t.commit();
}
}
