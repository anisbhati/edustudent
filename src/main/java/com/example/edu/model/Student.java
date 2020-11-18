package com.example.edu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String sname;
	private String smail;
	private String saddress;
	private long smob;
	private String sadhaar;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSmail() {
		return smail;
	}
	public void setSmail(String smail) {
		this.smail = smail;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public long getSmob() {
		return smob;
	}
	public void setSmob(long smob) {
		this.smob = smob;
	}
	public String getSadhaar() {
		return sadhaar;
	}
	public void setSadhaar(String sadhaar) {
		this.sadhaar = sadhaar;
	}
	
	
	

}
