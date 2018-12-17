package com.cg.vehicle.vehi.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.cg.vehicle.vehi.Customer;

public interface IVehicleDao {
	public String addCustomer(Customer db) throws ClassNotFoundException, SQLException, IOException;
	public List<Customer> ViewCar() throws ClassNotFoundException, SQLException, IOException;
	public List<Customer> ViewBike() throws ClassNotFoundException, SQLException, IOException;
	
}
