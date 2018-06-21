package com.dao;

public interface Queries {
 String addEmployee = "insert into  Employee20 values(seqEmployeeid.nextVal,?,?)";
	 String viewEmployee="select * from employee20";
	 String deleteEmployee="delete from Employee20 where Employeeid=?";
	 String editEmployee="Update Employee20 set name =?,Salary=? where employeeId=?";
	 String addCourier="insert into  Courier values(seqCourierid.nextVal,?,?,?,?,?,?,?,?,?,?,?)";
     String viewCourier="select * from Courier";
     String deleteCourier="delete from Courier where courierid=?";
     String trackCourier="select * from courier where courierid=?";
     String chargesEnquiry="select * from weight";
    String admin="select * from admin";
     String supervisor="select * from supervisor";

}  
