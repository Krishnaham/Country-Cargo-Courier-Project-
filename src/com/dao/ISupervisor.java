package com.dao;

import java.util.List;

import com.beans.Courier;

public interface ISupervisor {
	
	public  int addCourier(Courier courier);
	public int editCourier(Courier courier) ;
	 public  int deleteCourier(int courierId);
	List<Courier> viewCourier();
	
	List<Courier> searchCourier(Courier courier);
	 
}
