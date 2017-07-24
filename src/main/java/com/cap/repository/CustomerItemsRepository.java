package com.cap.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cap.pojo.Items;

@Repository
@Transactional
public interface CustomerItemsRepository extends CrudRepository<Items, Number>{

}
