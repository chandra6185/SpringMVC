package com.cap.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cap.pojo.Cart;

@Repository
@Transactional
public interface CustomerCartRepository extends CrudRepository<Cart, Number>{

}
