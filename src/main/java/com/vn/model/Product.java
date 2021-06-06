package com.vn.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	private int productId;
	private String name;
	private int quantity;
	private double unitPrice;
	private String image;
	private String des;
	private double discount;
	private Date enteredDate;
	private short status;
	private int categoryId;
}
