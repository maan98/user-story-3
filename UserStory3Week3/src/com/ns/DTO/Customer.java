package com.ns.DTO;

import java.util.List;

public interface Customer {
	
	public abstract List<Customer> viewAllCustomer();
	public abstract List<Complaint> viewComplaintsById(int id);
	public abstract Complaint viewComplaintStatus(int id);
	public abstract boolean launchComplaintWithNewUser(Person p);
	public abstract boolean launchComplaintWithOldUser(Person p);

}
