package com.dao;

import java.util.List;

import com.beans.Employee;
import com.beans.UserBean;

public interface IAdministrator 
{
	

	 public int addEmployee(Employee emp );
	 List<UserBean> viewEmployees();
	
	
	int editEmployee(UserBean bean);
	int deleteEmployee(UserBean bean);
	

}
