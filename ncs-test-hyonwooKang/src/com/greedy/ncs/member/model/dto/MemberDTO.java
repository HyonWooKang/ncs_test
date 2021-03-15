package com.greedy.ncs.member.model.dto;

import java.util.Date;

public class MemberDTO {
	
	private int memberNum;
	private String id;
	private String pw;
	private String name;
	private String date;
	private double height;
	private double weight;
	private boolean isActivated;
	
	public MemberDTO() {}
	
	public int getMemberNum() {
		
		return memberNum;
	}
	
	public void setMemberNum(int memberNum) {
		
		this.memberNum = memberNum;
		
	}

	public String getId() {
		
		return id;
		
	}

	public void setId(String id) {
		
		this.id = id;
		
	}

	public String getPw() {
		
		return pw;
		
	}

	public void setPw(String pw) {
		
		this.pw = pw;
		
	}

	public String getName() {
		
		return name;
		
	}

	public void setName(String name) {
		
		this.name = name;
		
	}

	public String getDate() {
		
		return date;
		
	}

	public void setDate(String date) {
		this.date = date;
		
	}

	public double getHeight() {
		
		return height;
		
	}

	public void setHeight(double height) {
		
		this.height = height;
		
	}

	public double getWeight() {
		
		return weight;
	
	}
	

	public void setWeight(double weight) {
		
		this.weight = weight;
	}
	

	public boolean isActivated() {
		
		return isActivated;
		
	}

	public void setActivated(boolean isActivated) {
		
		this.isActivated = isActivated;
		
	}

	
}
