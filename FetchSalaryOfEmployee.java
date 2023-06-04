package org.jsp.hibernateApp;
	import java.util.List;
	import java.util.Scanner;
	import org.hibernate.Session;
	import org.hibernate.cfg.Configuration;
	import org.hibernate.query.Query;
	public class FetchSalaryOfEmployee {
		public static void main(String[] args) {
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the Employee to fetch the Employees:");
	       double sal =sc.nextDouble();
	       String hql="select e from Employee e where e.salary=:esal";
	       Session s=new Configuration().configure().buildSessionFactory().openSession();
	       Query<Employee> emps=s.createQuery(hql);
	       emps.setParameter("esal", sal);
	       List<Employee> emp=emps.getResultList();
	       if(emp.size()>0) {
	    	   for(Employee e:emp) {
	    		   System.out.println(e);
	    	   }
	    	   
	       }
	       else {
	    	   System.err.println("The salary> "+sal+ "is Not in your Table!!!!");
	       }
		}

	}


