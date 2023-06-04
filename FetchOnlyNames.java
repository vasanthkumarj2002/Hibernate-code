package org.jsp.hibernateApp;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
public class FetchOnlyNames {
public static void main(String[] args) {
	String hql="select e.name from Employee e";
	Session s=new Configuration().configure().buildSessionFactory().openSession();
	Query<String> q=s.createQuery(hql);
	List<String> name=q.getResultList();
	for(String names:name) {
		System.out.println(names);
	}
}
}
