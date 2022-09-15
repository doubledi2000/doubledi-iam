package com.doubledi.iam;

import com.doubledi.common.util.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DoublediIamApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoublediIamApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(){
		return StringUtils.HELLO;
	}


}
