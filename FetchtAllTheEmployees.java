package org.jsp.hibernateApp;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
public class FetchtAllTheEmployees {
public static void main(String[] args) {
	String hql="select e from Employee e";
	Session s=new Configuration().configure().buildSessionFactory().openSession();
	Query<Employee> emps=s.createQuery(hql);
	List<Employee> emp=emps.getResultList();
	for(Employee e:emp) {
		System.out.println(e);
		System.out.println("..............................******************...............................");
	}
}
}
