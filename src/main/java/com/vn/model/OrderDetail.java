package com.vn.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail {
	private int orderDetailId;
	private int orderId;
	private int productId;
	private int quantity;
	private double unitPrice;
}
