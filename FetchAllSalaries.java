package org.jsp.hibernateApp;
	import java.util.List;
	import org.hibernate.Session;
	import org.hibernate.cfg.Configuration;
	import org.hibernate.query.Query;
	public class FetchAllSalaries {
	public static void main(String[] args) {
		String hql="select e.salary from Employee e";
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Query<Double> q=s.createQuery(hql);
		List<Double> sal=q.getResultList();
		for(Double sale:sal) {
			System.out.println(sale);
		}
	}

}
