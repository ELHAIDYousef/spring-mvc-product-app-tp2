package com.java.enset.springmvcproductapp.repository;

import com.java.enset.springmvcproductapp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ELHAID Yousef
 **/
public interface ProductRepository extends JpaRepository<Product, Long> {


}
