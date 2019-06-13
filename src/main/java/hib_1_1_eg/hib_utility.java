package hib_1_1_eg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class hib_utility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Software s=new Software();
		s.setSid(101);
		s.setSname("MS WORD");
		
		
		Company c=new Company();
		c.setCid(1);
		c.setCname("Microsoft");
		c.setCaddr("Banglore");
		c.setSoftware(s);
		s.setCompany(c);

		
		
		
		
		
    	
    	Configuration con=new Configuration().configure().addAnnotatedClass(Software.class).addAnnotatedClass(Company.class);
    	
    	SessionFactory sf=con.buildSessionFactory();
    	Session session=sf.openSession();
    	session.beginTransaction();
    	
    	session.save(c);
    	session.save(s);
  
    	session.getTransaction().commit();
    	
	}

}
