package com.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.beans.UserBean;
import com.dao.Signupdao;
import com.db.DBConnection;

public class signupdaoimp implements Signupdao {

	@Override
	public int insertIntoDataBase(UserBean u) {

		int a = 0;

		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con
					.prepareStatement("insert into userdetails values(?,?,?,?,?)");
			ps.setString(1, u.getUserName());
			ps.setString(2, u.getPassWord());
			ps.setString(3, u.getType());
			ps.setString(4, u.getEmail());
			ps.setLong(5, u.getMobileNumber());
			a = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return a;
	}
	
	

}
