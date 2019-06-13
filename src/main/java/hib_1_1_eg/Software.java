package hib_1_1_eg;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Software {

	
	@Id
	private int sid;
	
	private String sname;
	
	@OneToOne(mappedBy="software")
	@JoinColumn
	private Company company;
	
	
	
	public Software() {}

	public Software(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Software [sid=" + sid + ", sname=" + sname + ", company=" + company + "]";
	}
	
	
	
}
