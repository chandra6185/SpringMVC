package com.cap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.pojo.Cart;
import com.cap.pojo.Items;
import com.cap.repository.CustomerCartRepository;
import com.cap.repository.CustomerItemsRepository;

@Service
public class CustomerCartServiceImpl {

	@Autowired
	CustomerCartRepository  cartRepository;
	@Autowired
	CustomerItemsRepository  itemsRepository;
	
	public Cart save(Cart cart) {
		return cartRepository.save(cart);
	}

	public Cart findOne(int id) {
		return cartRepository.findOne(id);
	}

}
