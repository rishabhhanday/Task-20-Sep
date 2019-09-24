package com.ssi.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentEntity {
	@Id
	private int sid;
	private String sname;
	private String sbranch;
	private long scontact;
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
	public String getSbranch() {
		return sbranch;
	}
	public void setSbranch(String sbranch) {
		this.sbranch = sbranch;
	}
	public long getScontact() {
		return scontact;
	}
	public void setScontact(long scontact) {
		this.scontact = scontact;
	}
	public StudentEntity(int sid, String sname, String sbranch, long scontact) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sbranch = sbranch;
		this.scontact = scontact;
	}
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentEntity [sid=" + sid + ", sname=" + sname + ", sbranch="
				+ sbranch + ", scontact=" + scontact + "]";
	}
	
}
