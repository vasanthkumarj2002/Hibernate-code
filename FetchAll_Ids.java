package org.jsp.hibernateApp;
	import java.util.List;
	import org.hibernate.Session;
	import org.hibernate.cfg.Configuration;
	import org.hibernate.query.Query;
	public class FetchAll_Ids {
	public static void main(String[] args) {
		String hql="select e.id from Employee e";
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Query<Integer> q=s.createQuery(hql);
		List<Integer> id=q.getResultList();
		for(Integer ids:id) {
			System.out.println(ids);
		}
	}

}
