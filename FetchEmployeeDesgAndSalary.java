package org.jsp.hibernateApp;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
public class FetchEmployeeDesgAndSalary {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Desg and salary to fetch the record from employees:");
     String desg=sc.nextLine();
     double salary=sc.nextDouble();
     String hql="select e from Employee e where desg=?1 and salary=?2";
     Session s=new Configuration().configure().buildSessionFactory().openSession();
     Query<Employee> q=s.createQuery(hql);
     q.setParameter(1, desg);
     q.setParameter(2, salary);
     List<Employee> emp=q.getResultList();
     if(emp.size()>0) {
     for(Employee e:emp){
    	 System.out.println(e);
     }
     }
     else {
    	 System.err.println("Enter data is invalid");
     }
	
}
}
