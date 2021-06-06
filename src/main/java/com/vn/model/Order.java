package com.vn.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

	private int orderId;
	private Date orderDate;
	private int customerId;
	private double amount;
	private short status;
}
