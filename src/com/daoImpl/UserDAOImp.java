package com.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.beans.UserBean;
import com.dao.UserDAO;
import com.db.DBConnection;

public class UserDAOImp implements UserDAO {

	@Override
	public String verify(UserBean u) {
		String type=null;
		Connection con=null;
		PreparedStatement ps= null;
		try
		{
			 con = DBConnection.getConnection();
			
			 ps = con.prepareStatement("select type from userdetails where username=? and password=?");
			ps.setString(1, u.getUserName());
			ps.setString(2, u.getPassWord());
			
			ResultSet rs = ps.executeQuery();
			
			
		   while(rs.next())
		    {
			   
			type=rs.getString(1);
				
		    }
				
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			try {
				con.close();
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return type;
	}
	
	
	
	
	
	
	
	
	
	
public String getPassword(UserBean u) {
		
		String passWord=null;
		try
		{
			
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("select password from userdetails where username=? and email=?");
			ps.setString(1, u.getUserName());
			ps.setString(2, u.getEmail());
			
			ResultSet rs = ps.executeQuery();
			
			
		   while(rs.next())
		    {
			   
		passWord=rs.getString(1);
				
		    }
				
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		return passWord;
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}

