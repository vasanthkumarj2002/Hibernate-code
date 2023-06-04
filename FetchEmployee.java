package org.jsp.hibernateApp;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
public class FetchEmployee {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter user ID to fetch the record: ");
	int id=sc.nextInt();
    Session s=new  Configuration().configure().buildSessionFactory().openSession();
     Employee e=s.get(Employee.class, id);
     if(e!=null) {
     System.out.println("ID: "+ e.getId());
     System.out.println("NAME: "+ e.getName());
     System.out.println("DESG: "+ e.getDesg());
     System.out.println("SALARY: "+ e.getSalary());
     }
     else {
    	 System.err.println("YOU enter ID in INVALIDE!!!!");
     }
}
}
