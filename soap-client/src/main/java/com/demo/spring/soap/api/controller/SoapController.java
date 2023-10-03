//package com.controller;
//
//
//import com.client.SoapClient;
//import com.demo.spring.soap.api.loaneligibility.Acknowledgement;
//import com.demo.spring.soap.api.loaneligibility.CustomerRequest;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("v1")
//public class SoapController {
//    @Autowired
//    private SoapClient client;
//
//    @PostMapping("/getLoanStatus")
//    public Acknowledgement invokeSoapClientToGetLoanStatus(@RequestBody CustomerRequest request) {
//        System.out.println(request);
//        return client.getLoanStatus(request);
//    }
//
//}
