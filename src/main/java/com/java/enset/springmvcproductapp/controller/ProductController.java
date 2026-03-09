package com.java.enset.springmvcproductapp.controller;

import com.java.enset.springmvcproductapp.entity.Product;
import com.java.enset.springmvcproductapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author ELHAID Yousef
 **/

@Controller
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/index")
    public String index(Model model) {
        List<Product> products = productRepository.findAll();
        model.addAttribute("products",products);
        return "index";
    }
    @GetMapping("/delete")
    public String deleteProduct(@RequestParam Long id) {
        productRepository.deleteById(id);
        return "redirect:/index";
    }


}
