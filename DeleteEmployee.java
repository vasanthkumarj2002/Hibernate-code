package org.jsp.hibernateApp;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class DeleteEmployee {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the ID you want to delete the record.. ");
	int eid=sc.nextInt();
	Session session=new Configuration().configure().buildSessionFactory().openSession();
	Employee e=session.get(Employee.class, eid);
	if(e!=null) {
		session.delete(e);
		System.out.println("Data is Deleted Successfully..");
	}
	else {
		System.err.println("Your entered ID is invalid!!!!"); 
	}
	Transaction t=session.beginTransaction();
	t.commit();
}
}
