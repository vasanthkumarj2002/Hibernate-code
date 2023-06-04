package org.jsp.hibernateApp;
	import java.util.List;
	import java.util.Scanner;
	import org.hibernate.Session;
	import org.hibernate.cfg.Configuration;
	import org.hibernate.query.Query;
	public class FetchNameWhereDesg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id To Fetch Employee Salary");
		String desg=sc.next();
		String hql="select e.name from Employee e where e.desg=?1";
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Query<String> q=s.createQuery(hql);
		q.setParameter(1,desg);
		List<String> l=q.getResultList();
		for(String d:l) {
			System.out.println(d);
		}
	}
	}
