package com.vn.model;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
	private Long productId;
	private String name;
	private int quantity;
	private double unitPrice;

	private String image;
	//cho phép tiếp nhận các dữ liệu được gửi tới
	//lưu file vào trong ổ đĩa sau đó lưu tên file hình vào trong image
	private MultipartFile imageFile;
	
	private String des;
	private double discount;
	private Date enteredDate;
	private short status;
	
	private Long categoryId;
	
	private Boolean isEdit;
}
