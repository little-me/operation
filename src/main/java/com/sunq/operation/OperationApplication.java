package com.sunq.operation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Repository;

@SpringBootApplication
@EntityScan(basePackages = "com.sunq.operation.model")
@MapperScan(basePackages = "com.sunq.operation", annotationClass = Repository.class)
public class OperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(OperationApplication.class, args);
	}

}
