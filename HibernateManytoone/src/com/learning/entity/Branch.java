package com.learning.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Branch {
	
	@Id
	private String bid;
	
	private String branchname;
	
	private String blocation;
	
	

	public String getBid() {
		return bid;
	}



	public void setBid(String bid) {
		this.bid = bid;
	}



	public String getBranchname() {
		return branchname;
	}



	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}



	public String getBlocation() {
		return blocation;
	}



	public void setBlocation(String blocation) {
		this.blocation = blocation;
	}



	@Override
	public String toString() {
		return "Branch [bid=" + bid + ", branchname=" + branchname + ", blocation=" + blocation + "]";
	}
	
	
	
	
	
	

}
