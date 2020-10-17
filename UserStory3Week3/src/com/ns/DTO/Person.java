package com.ns.DTO;

import java.util.List;

import com.ns.DAO.UserDAO;

public class Person implements Customer{
	
	public int id;
	public String name;
	public Complaint c;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	UserDAO udao=new UserDAO();


	public Person(int id, String name, Complaint c) {
		super();
		this.id = id;
		this.name = name;
		this.c = c;
	}
	public List<Customer> viewAllCustomer(){
		List<Customer> list= udao.viewAllCustomer();
	  return list;
	}
	public List<Complaint> viewComplaintsById(int id){
		System.out.println("here");
		List<Complaint> list=udao.viewComplaintsById(id);
		return list;
	}
	public Complaint viewComplaintStatus(int id) {
		Complaint comp=udao.viewComplaintStatus(id);
		return comp;
	}


	public boolean launchComplaintWithNewUser(Person p) {
		// TODO Auto-generated method stub
		boolean b=udao.registerNewComplaint(p);
		return b;
	}
	public boolean launchComplaintWithOldUser(Person p) {
		// TODO Auto-generated method stub
		boolean b=udao.registerComplaintWithOldUser(p);
		return b;
	}


	public String toString() {
		return "id=" + id + ", name=" + name + ", c=" + c;
	}
	

}
