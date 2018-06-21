package com.dao;

import com.beans.UserBean;

public interface UserDAO {

	public String verify(UserBean u);
	public String getPassword(UserBean u) ;
}
	
