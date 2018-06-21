package com.beans;

public class UserBean {
	
	private String userName;
	private String passWord;
	private String type;
	private String email;
	private long mobileNumber;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "UserBean [userName=" + userName + ", passWord=" + passWord
				+ ", type=" + type + ", email=" + email + ", mobileNumber="
				+ mobileNumber + "]";
	}
	
	
	
	

}
