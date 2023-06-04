package org.jsp.hibernateApp;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
public class FetchNameOfEmployees {
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Employees Name want fetch the Records:");
       String name=sc.next();
       String hql="select e from  Employee e where e.name=:ename";
       Session s=new Configuration().configure().buildSessionFactory().openSession();
       Query<Employee> emps=s.createQuery(hql);
       emps.setParameter("ename", name);
       List<Employee> emp=emps.getResultList();
       if(emp.size()>0) {
    	   for(Employee e:emp) {
    		   System.out.println(e);
    	   }
       }
       else {
    	   System.err.println("You Entered name "+name+" is invalid!!!");
       }
	}

}
