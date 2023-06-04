package org.jsp.hibernateApp;
import java.util.List;
import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
public class FetchIdFromEmployees {
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Employee to fetch the Employees:");
       int id =sc.nextInt();
       String hql="select e from Employee e where e.id=:eid";
       Session s=new Configuration().configure().buildSessionFactory().openSession();
       Query<Employee> emps=s.createQuery(hql);
       emps.setParameter("eid", id);
       try {
       Employee e=emps.getSingleResult();
       System.out.println(e);
       }
       catch(NoResultException e) {
    	   System.err.println("Employee is Invalid");
       }
	}
}


