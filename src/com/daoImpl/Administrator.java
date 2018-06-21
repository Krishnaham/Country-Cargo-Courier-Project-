package com.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.User;

import com.beans.Employee;
import com.beans.UserBean;
import com.dao.IAdministrator;
import com.db.DBConnection;

public class Administrator implements IAdministrator {

	

	@Override
	public int addEmployee(Employee emp) {
	
		return 0;
	}

	@Override
	public List<UserBean> viewEmployees() {
		List<UserBean> arr=new ArrayList<>();
		
		Connection con=DBConnection.getConnection();
		
	
			try {
				PreparedStatement ps=con.prepareStatement("select * from userdetails");
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					UserBean ub=new UserBean();
					ub.setUserName(rs.getString(1));
					ub.setPassWord(rs.getString(2));
					ub.setType(rs.getString(3));
					ub.setEmail(rs.getString(4));
					ub.setMobileNumber(rs.getLong(5));
					arr.add(ub);
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			return  arr;
	
			
		
				
				
	}	

				
			
			
			
			
			
			
		
		
		
		
		
		
		
		

		
		
		
		
		
		
	

	@Override
	public int editEmployee(UserBean bean) {
		
		int i=0;
		
		
        try {
			Connection con=DBConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("update userdetails set username=?,password=?,type=?,email=?,mobilenumber=? where username='"+bean.getUserName()+"'");
			ps.setString(1, bean.getUserName());
			ps.setString(2, bean.getPassWord());
			ps.setString(3, bean.getType());
			ps.setString(4, bean.getEmail());
			ps.setLong(5, bean.getMobileNumber());
			 i=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		return i;
	}

	@Override
	public int deleteEmployee(UserBean bean) {
		

int i=0;
		
		
       
			try {
				Connection con=DBConnection.getConnection();
				PreparedStatement ps=con.prepareStatement("delete from userdetails where username=? and type=?");
				ps.setString(1, bean.getUserName());
				
				ps.setString(2, bean.getType());
				i=ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
		
		
		
		
		
		return i;
	}

}
