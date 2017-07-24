package com.cap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cap.pojo.Cart;
import com.cap.pojo.Items;
import com.cap.service.CustomerCartServiceImpl;

@RestController
public class CustomerCartControllerImpl {
	
	@Autowired
	CustomerCartServiceImpl cartServiceImpl;
	
	@RequestMapping(value = "/saveCart",method = RequestMethod.POST)
	public Cart saveCart(@RequestBody Cart cart){
		return cartServiceImpl.save(cart);
	}
	
	@RequestMapping(value = "/getCart/{id}")
	public Cart saveCart(@PathVariable int id){
		return cartServiceImpl.findOne(id);
	}
	@RequestMapping(value = "/getCart",method=RequestMethod.PUT)
	public Cart updateCart(@RequestBody Cart cart){
		return cartServiceImpl.save(cart);
	}
}
