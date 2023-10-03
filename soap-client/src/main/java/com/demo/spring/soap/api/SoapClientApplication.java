package com.demo.spring.soap.api;

import com.demo.spring.soap.api.client.SoapClient;
import com.demo.spring.soap.api.loaneligibility.Acknowledgement;
import com.demo.spring.soap.api.loaneligibility.CustomerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SoapClientApplication {

	@Autowired
	private SoapClient clinet;

	@PostMapping("/getLoanStatus")
	public Acknowledgement invokeSoapClientToGetLoanStatus(@RequestBody CustomerRequest request) {
		return clinet.getLoanStatus(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(SoapClientApplication.class, args);
	}
}
