package com.jobs.application;

import com.jobs.domain.AbsStaffMember;

public class StaffMemberDTO {

	protected String name;
	protected String address;
	protected String phone;
	protected double totalpaid;
	
	
	public StaffMemberDTO(AbsStaffMember staffMember) throws Exception{
		if (staffMember == null)
			throw new Exception();

		this.name = staffMember.getName();
		this.address = staffMember.getAddress();
		this.phone = staffMember.getPhone();
		this.totalpaid = staffMember.getTotalPaid();
	}


	public String getName() {
		return name;
	}


	public String getAddress() {
		return address;
	}


	public String getPhone() {
		return phone;
	}


	public double getTotalpaid() {
		return totalpaid;
	}
	
	
}
