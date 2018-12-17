package com.cg.vehicle.vehi.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.cg.donar.bean.DonorBean;
import com.cg.vehicle.vehi.Customer;
import com.cg.vehicle.vehi.util.DBConnection;

public class IVehicleDaoImpl implements IVehicleDao {

	@Override
	public String addCustomer(Customer cust) throws ClassNotFoundException, SQLException, IOException {
		Connection con = DBConnection.getConnection();
		Statement st = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		String custId = null;
		// int queryResult = 0;

		try {

			pst = con.prepareStatement(QueryMapper.INSERT_CUSTOMER);
			pst.setString(1, cust.getName());
			pst.setString(2, cust.getAddress());
			pst.setString(3, cust.getPhoneNumber());

			pst.executeUpdate();
			st = con.createStatement();
			rs = st.executeQuery(QueryMapper.SELECT_CUST);
			while (rs.next()) {
				custId = rs.getString(1);
				System.out.println("Hi" + cust.getName());
				/*
				 * rs.getString(2); rs.getString(3); rs.getString(3);
				 */

			}

		} catch (Exception sqle) {
			sqle.printStackTrace();
		}
		con.close();
		st.close();
		pst.close();
		return custId;

	}

	@Override
	public List<Customer> ViewCar() throws ClassNotFoundException, SQLException, IOException {
		Connection con = DBConnection.getConnection();
		 
		Statement st = null;
		//PreparedStatement pst = null;
		ResultSet rs = null;
		st = con.createStatement();

		rs = st.executeQuery("SELECT * FROM car");

		return (List<Customer>) rs;
	}

	@Override
	public List<Customer> ViewBike() throws ClassNotFoundException, SQLException, IOException {
		Connection con = DBConnection.getConnection();
		
		ResultSet resultSet = null;
		Statement st = null;
	//	PreparedStatement pst = null;
		st = con.createStatement();
		resultSet = st.executeQuery("select * from bikes");

		return (List<Customer>) resultSet;
	}

}
