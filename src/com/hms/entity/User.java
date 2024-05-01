package com.hms.entity;

public class User {

	private int uid;
	private String uname;
	private String phone;

//	private String email;
//	private String ucount;
//	private String uadhar;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int uid, String uname, String phone) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.phone = phone;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", phone=" + phone + "]";
	}

}
