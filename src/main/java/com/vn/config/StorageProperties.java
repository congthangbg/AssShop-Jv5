package com.vn.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

//storage ánh xạ vs storage trong application.properties
@ConfigurationProperties("storage")
@Data
public class StorageProperties {
	//khai báo location sẽ ánh xạ với location trong application.properties
	private String location;
	
	//khi thực hiện sẽ nạp dữ liệu uploads/images
	//vào trong giá trị của trg location
}
