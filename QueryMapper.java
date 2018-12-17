package com.cg.vehicle.vehi.dao;

public interface QueryMapper {
 public static final String INSERT_CUSTOMER="insert into customer values(custId_sequence.nextval,?,?,?,SYSDATE)";
 public static final String SELECT_CUST = "SELECT * FROM customer";
 public static final String SELECT_CAR =
}
