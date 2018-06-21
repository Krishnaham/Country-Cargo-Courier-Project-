package com.daoImpl;

 

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.beans.Courier;
import com.beans.EstimationCost;
import com.dao.ISupervisor;
 import com.db.DBConnection;

public  class Supervisor implements ISupervisor {

	 public int addCourier(Courier courier) {
	       

	       
         
         int i=0;
         Connection con=DBConnection.getConnection();
         try {
             PreparedStatement ps=con.prepareStatement("insert into Courier values(Courierseq.nextval,?,?,?,?,?,?,?,?,?,?)");
             ps.setString(1,courier.getReceiverName());
             ps.setString(2,courier.getReceiverAddress());
             ps.setLong(3,courier.getReceiverMobileNumber());
             ps.setString(4,courier.getReceiverEmailId());
             ps.setString(5,courier.getSenderName());
             ps.setString(6,courier.getSenderAddress());
             ps.setLong(7,courier.getSenderMobileNumber());
             ps.setString(8,courier.getSenderEmailId());
             ps.setInt(9,courier.getCourierWeight());
             ps.setString(10, courier.getStatus());
             i=ps.executeUpdate();
             //System.out.println(i);
         } catch (SQLException e) {
            
             e.printStackTrace();
         }
        
        
         return i;
     }

	@Override
	public List<Courier> viewCourier() {
		
	
		 List<Courier> ul=new ArrayList<>();
	        Connection con=DBConnection.getConnection();
	        try{
	       
	        PreparedStatement ps=con.prepareStatement("select * from Courier");
	       
	        ResultSet rs=ps.executeQuery();
	        while(rs.next())
	       
	        {
	            Courier courier=new Courier();
	            courier.setCourierId(rs.getInt(1));
	            courier.setReceiverName(rs.getString(2));
	            courier.setReceiverAddress(rs.getString(3));
	            courier.setReceiverMobileNumber(rs.getLong(4));
	            courier.setReceiverEmailId(rs.getString(5));
	            courier.setSenderName(rs.getString(6));
	            courier.setSenderAddress(rs.getString(7));
	            courier.setSenderMobileNumber(rs.getLong(8));
	            courier.setSenderEmailId(rs.getString(9));
	            courier.setCourierWeight(rs.getInt(10));
	            courier.setStatus(rs.getString(11));
	           
	           
	            ul.add(courier);
	           
	       
	        }
	       
	        }catch(SQLException e)
	        {
	            e.printStackTrace();
	        }
	       
	        return ul;
	   
	    

		
		
		
		
		
		
		
		

		
	
	}

	
		
		
		
		
		
		public int deleteCourier(int courierId) {
		       
	           
            int i=0;
           
            Connection con=DBConnection.getConnection();
            try {
                PreparedStatement ps=con.prepareStatement("delete from Courier where courierId=?");
                ps.setInt(1,courierId);
                i=ps.executeUpdate();
                System.out.println(i);
               
               
            } catch (SQLException e) {
               
                e.printStackTrace();
            }
           
           
            return i;
           
        }

		

	
		
		
		
		public List<EstimationCost> estimationCost() {
		

		
		
		 List<EstimationCost> ul=new ArrayList<EstimationCost>();
	        Connection con=DBConnection.getConnection();
	        try{
	       
	        PreparedStatement ps=con.prepareStatement("select * from couriercost");
	       
	        ResultSet rs=ps.executeQuery();
	        while(rs.next())
	       
	        {
	            EstimationCost cost=new EstimationCost();
	            cost.setLowerLimit(rs.getInt(1));
	            cost.setHigherLimit(rs.getInt(2));
	            cost.setCost(rs.getInt(3));
	            ul.add(cost);
	           
	           
	       
	        }
	       
	        }catch(SQLException e)
	        {
	            e.printStackTrace();
	        }
	       
	        return ul;
	   
	    
		
		
		
		
		
		
		
		
		
		
	
	}
		
		public int editCourier(Courier courier) {
	        int i=0;
	        Connection con=DBConnection.getConnection();
	   
	        try {
	            PreparedStatement ps=con.prepareStatement("Update Courier set ReceiverName=?,ReceiverAddress=?,ReceiverMobileNo=?,ReceiverEmailId=?,SenderName=?,SenderAddress=?,SenderMobileNo=?,SenderEmailId=?,CourierWeight=?,Status=? where CourierId=? ");
	            ps.setString(1,courier.getReceiverName());
	           
	           
	            ps.setString(2,courier.getReceiverAddress());
	            
	            ps.setLong(3,courier.getReceiverMobileNumber());
	            
	            ps.setString(4,courier.getReceiverEmailId());
	           
	            ps.setString(5,courier.getSenderName());
	            
	            ps.setString(6,courier.getSenderAddress());
	            ps.setLong(7,courier.getSenderMobileNumber());
	            ps.setString(8,courier.getSenderEmailId());
	            ps.setInt(9,courier.getCourierWeight());
	            ps.setString(10,courier.getStatus());
	            
	            ps.setInt(11, courier.getCourierId());
	            i=ps.executeUpdate();
	            con.commit();
	            //System.out.println(i);
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	       
	       
	       
	       
	        return i;
	    }

		/*public List<Courier> searchCourier(Courier courier2) {
			

			System.out.println("method");
			 List<Courier> ul=new ArrayList<>();
		        Connection con=DBConnection.getConnection();
		        Courier courier=new Courier();
		        try{

		            PreparedStatement ps=con.prepareStatement("select * from courier where courierId=?");

		            ResultSet resultSet=ps.executeQuery();
		            ps.setInt(1, courier.getCourierId());
		            System.out.println("In mEthod");
		            System.out.println(courier.getCourierId());
		            while(resultSet.next())

		            {
		           
		           
		                courier.setCourierId(resultSet.getInt(1));
		            courier.setReceiverName(resultSet.getString(2));
		          
		            courier.setReceiverAddress(resultSet.getString(3));
		          
		            courier.setReceiverMobileNumber(resultSet.getLong(4));
		            courier.setReceiverEmailId(resultSet.getString(5));
		            courier.setSenderName(resultSet.getString(6));
		            courier.setSenderAddress(resultSet.getString(7));
		            courier.setSenderMobileNumber(resultSet.getLong(8));
		            courier.setSenderEmailId(resultSet.getString(9));
		            courier.setCourierWeight(resultSet.getInt(10));
		            courier.setStatus(resultSet.getString(11));

		           
		            ul.add(courier);
		            System.out.println(resultSet.getInt(1));
		            System.out.println(ul);

		            }

		        }catch(SQLException e)
		        {
		            e.printStackTrace();
		        }

		        return ul;

		    
			
			
			
			
			
		}*/

		@Override
		public List<Courier> searchCourier(Courier courier) {
			
			System.out.println("method");
			 List<Courier> ul=new ArrayList<>();
		        Connection con=DBConnection.getConnection();
		        /*Courier courier=new Courier();*/
		        try{

		            PreparedStatement ps=con.prepareStatement("select * from courier where courierId=?");
		            ps.setInt(1, courier.getCourierId());

		            ResultSet resultSet=ps.executeQuery();
		           
		            System.out.println("In mEthod");
		            System.out.println(courier.getCourierId());
		            while(resultSet.next())

		            {
		           
		           
		                courier.setCourierId(resultSet.getInt(1));
		            courier.setReceiverName(resultSet.getString(2));
		          
		            courier.setReceiverAddress(resultSet.getString(3));
		          
		            courier.setReceiverMobileNumber(resultSet.getLong(4));
		            courier.setReceiverEmailId(resultSet.getString(5));
		            courier.setSenderName(resultSet.getString(6));
		            courier.setSenderAddress(resultSet.getString(7));
		            courier.setSenderMobileNumber(resultSet.getLong(8));
		            courier.setSenderEmailId(resultSet.getString(9));
		            courier.setCourierWeight(resultSet.getInt(10));
		            courier.setStatus(resultSet.getString(11));

		           
		            ul.add(courier);
		            
		            

		            }

		        }catch(SQLException e)
		        {
		            e.printStackTrace();
		        }

		        return ul;

		    
			
			

	   


	}}

		

