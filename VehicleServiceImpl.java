package com.cg.vehicle.vehi.vehicle1;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.cg.vehicle.vehi.Customer;
import com.cg.vehicle.vehi.dao.IVehicleDaoImpl;
import com.cg.vehicle.vehi.exception.VehicleException;





public class VehicleServiceImpl implements VehicleService {
	private IVehicleDaoImpl vehidao;
	private IVehicleDaoImpl vehidao1;
	public List retrieveAllCars() throws VehicleException, ClassNotFoundException, SQLException, IOException {
		vehidao= new IVehicleDaoImpl();
		List<Customer> carList = null;
		carList = vehidao.ViewCar();
		return carList;
	}
	public List retrieveAllBikes() throws ClassNotFoundException, SQLException, IOException
	{
		vehidao1 = new IVehicleDaoImpl();
		List<Customer> bikeList = null;
		bikeList = vehidao.ViewBike();
		return bikeList;
		
		
	}
}
		
		
		
		
