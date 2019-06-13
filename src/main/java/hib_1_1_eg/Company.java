package hib_1_1_eg;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Company {
	
	
	@Id
	private int cid;
	
	private String cname;
	
	private String caddr;
	
	@OneToOne
	private Software software;

	
	public Company() {
		
		super();
	}
	






	public Company(int cid, String cname, String caddr, Software software) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.caddr = caddr;
		this.software = software;
	}







	public Software getSoftware() {
		return software;
	}

	public void setSoftware(Software software) {
		this.software = software;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCaddr() {
		return caddr;
	}

	public void setCaddr(String caddr) {
		this.caddr = caddr;
	}

	@Override
	public String toString() {
		return "Company [cid=" + cid + ", cname=" + cname + ", caddr=" + caddr + ", software=" + software + "]";
	}
	
	
	

}
