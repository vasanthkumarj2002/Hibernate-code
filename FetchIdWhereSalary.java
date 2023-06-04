package org.jsp.hibernateApp;
	import java.util.List;
	import java.util.Scanner;
	import org.hibernate.Session;
	import org.hibernate.cfg.Configuration;
	import org.hibernate.query.Query;
	public class FetchIdWhereSalary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter salary To Fetch Employee id");
		double sal=sc.nextDouble();
		String hql="select e.id from Employee e where e.salary=?1";
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Query<Integer> q=s.createQuery(hql);
		q.setParameter(1,sal);
		List<Integer> l=q.getResultList();
		for(Integer d:l) {
			System.out.println(d);
		}
	}

}
