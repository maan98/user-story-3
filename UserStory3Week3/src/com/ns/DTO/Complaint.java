package com.ns.DTO;

public class Complaint {
	
	public int cid;
	public String title;
	public String description;
	public int status;
	public int customerid;
	public Complaint() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Complaint(int cid, String title, String description, int status, int customerid) {
		super();
		this.cid = cid;
		this.title = title;
		this.description = description;
		this.status = status;
		this.customerid = customerid;
	}
	public String toString() {
		return "cid=" + cid + ", title=" + title + ", description=" + description + ", status=" + status
				+ ", customerid=" + customerid;
	}
	
	

}
