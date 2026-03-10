package com.java.enset.springmvcproductapp.repository;

import com.java.enset.springmvcproductapp.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author ELHAID Yousef
 **/
public interface ProductRepository extends JpaRepository<Product, Long> {

    //List<Product> findByNameContainingIgnoreCase(String keyword);

    Page<Product> findByNameContainingIgnoreCase(String keyword, Pageable pageable);}
