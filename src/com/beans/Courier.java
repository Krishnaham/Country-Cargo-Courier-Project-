package com.beans;

public class Courier {
	
	private int courierId;
	private String receiverName;
    private String receiverAddress ;
    private long receiverMobileNumber;
    private   String receiverEmailId;
    private String senderName;
    private String senderAddress ;
    private long senderMobileNumber;
    private   String senderEmailId;
    private  int employeeId;
    private String status;
    private int courierWeight;
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getReceiverAddress() {
		return receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	public long getReceiverMobileNumber() {
		return receiverMobileNumber;
	}
	public void setReceiverMobileNumber(long receiverMobileNumber) {
		this.receiverMobileNumber = receiverMobileNumber;
	}
	public String getReceiverEmailId() {
		return receiverEmailId;
	}
	public void setReceiverEmailId(String receiverEmailId) {
		this.receiverEmailId = receiverEmailId;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getSenderAddress() {
		return senderAddress;
	}
	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}
	public long getSenderMobileNumber() {
		return senderMobileNumber;
	}
	public void setSenderMobileNumber(long senderMobileNumber) {
		this.senderMobileNumber = senderMobileNumber;
	}
	public String getSenderEmailId() {
		return senderEmailId;
	}
	public void setSenderEmailId(String senderEmailId) {
		this.senderEmailId = senderEmailId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCourierWeight() {
		return courierWeight;
	}
	public void setCourierWeight(int courierWeight) {
		this.courierWeight = courierWeight;
	}
	@Override
	public String toString() {
		return "Courier [courierId=" + courierId + ", receiverName="
				+ receiverName + ", receiverAddress=" + receiverAddress
				+ ", receiverMobileNumber=" + receiverMobileNumber
				+ ", receiverEmailId=" + receiverEmailId + ", senderName="
				+ senderName + ", senderAddress=" + senderAddress
				+ ", senderMobileNumber=" + senderMobileNumber
				+ ", senderEmailId=" + senderEmailId + ", employeeId="
				+ employeeId + ", status=" + status + ", courierWeight="
				+ courierWeight + "]";
	}
	public int getCourierId() {
		return courierId;
	}
	public void setCourierId(int courierId) {
		this.courierId = courierId;
	}
    

}
