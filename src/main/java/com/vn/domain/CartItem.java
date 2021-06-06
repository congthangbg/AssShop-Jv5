package com.vn.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItem implements Serializable{
	private Integer productId;
	private String name;
	private Integer quantity;
	private Double unitPrice;
}
