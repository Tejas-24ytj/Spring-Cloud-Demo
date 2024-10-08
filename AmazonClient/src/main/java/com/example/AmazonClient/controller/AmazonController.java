package com.example.AmazonClient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AmazonController {
    
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/amazon-payment/{price}")
    public String invokePaymentService(@PathVariable int price){
       String url="http://PAYMENTSERVICE/payment/getPrice/" +price;
       return restTemplate.getForObject(url,String.class);
    }
    
}
