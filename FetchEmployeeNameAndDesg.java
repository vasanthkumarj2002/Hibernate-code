package org.jsp.hibernateApp;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
public class FetchEmployeeNameAndDesg {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name and desg from Employee:");
	String name=sc.nextLine();
	String desg=sc.nextLine();
	String hql="select e from Employee e where name=?1 and desg=?2";
	Session s=new Configuration().configure().buildSessionFactory().openSession();
	Query<Employee> q=s.createQuery(hql);
	q.setParameter(1, name);
	q.setParameter(2, desg);
	List<Employee> emp=q.getResultList();
	if(emp.size()>0) {
		for(Employee e:emp) {
			System.out.println(e);
		}
		
	}
	else {
		System.err.println("Enter data is invalid!!!");
	}
}
}
