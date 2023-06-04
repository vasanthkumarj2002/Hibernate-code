package org.jsp.hibernateApp;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
public class FetchAllNameAlongWithId {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Id To Fetch Employee Salary");
	int id=sc.nextInt();
	String hql="select e.salary from Employee e where e.id=?1";
	Session s=new Configuration().configure().buildSessionFactory().openSession();
	Query<Double> q=s.createQuery(hql);
	q.setParameter(1,id);
	List<Double> l=q.getResultList();
	for(Double d:l) {
		System.out.println(d);
	}
}
}
