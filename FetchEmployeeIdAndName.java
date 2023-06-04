package org.jsp.hibernateApp;
	import java.util.List;
	import java.util.Scanner;
	import org.hibernate.Session;
	import org.hibernate.cfg.Configuration;
	import org.hibernate.query.Query;
	public class FetchEmployeeIdAndName {
	   public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Id and name from Employee:");
		int id=sc.nextInt();
		String name=sc.next();
		String hql="select e from Employee e where id=?1 and name=?2";
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Query<Employee> q=s.createQuery(hql);
		q.setParameter(1, id);
		q.setParameter(2, name);
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

