package org.jsp.hibernateApp;
	import java.util.List;
	import org.hibernate.Session;
	import org.hibernate.cfg.Configuration;
	import org.hibernate.query.Query;
	public class FetchAllDesg {
	public static void main(String[] args) {
		String hql="select e.desg from Employee e";
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Query<String> q=s.createQuery(hql);
		List<String> desg=q.getResultList();
		for(String desgs:desg) {
			System.out.println(desgs);
		}
	}

}

