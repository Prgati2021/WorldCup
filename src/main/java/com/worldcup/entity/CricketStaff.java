package com.worldcup.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CricketStaff {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int staffId;
	String staffName;
	String steffDept;
	int staffAge;
	int NoofyearstoBCCI;
	
	public CricketStaff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CricketStaff( String staffName, String steffDept, int staffAge, int noofyearstoBCCI) {
		super();
		
		this.staffName = staffName;
		this.steffDept = steffDept;
		this.staffAge = staffAge;
		NoofyearstoBCCI = noofyearstoBCCI;
	}
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getSteffDept() {
		return steffDept;
	}
	public void setSteffDept(String steffDept) {
		this.steffDept = steffDept;
	}
	public int getStaffAge() {
		return staffAge;
	}
	public void setStaffAge(int staffAge) {
		this.staffAge = staffAge;
	}
	public int getNoofyearstoBCCI() {
		return NoofyearstoBCCI;
	}
	public void setNoofyearstoBCCI(int noofyearstoBCCI) {
		NoofyearstoBCCI = noofyearstoBCCI;
	}
	
	

}
