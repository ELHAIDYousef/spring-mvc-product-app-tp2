package com.java.enset.springmvcproductapp.controller;

import com.java.enset.springmvcproductapp.entity.Product;
import com.java.enset.springmvcproductapp.repository.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author ELHAID Yousef
 **/

@Controller
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    public String index(Model model,
                        @RequestParam(name = "keyword", required = false) String keyword) {

        List<Product> products;

        if (keyword != null && !keyword.isEmpty()) {
            products = productRepository.findByNameContainingIgnoreCase(keyword);
        } else {
            products = productRepository.findAll();
        }

        model.addAttribute("products", products);
        model.addAttribute("keyword", keyword); // To keep the search box filled
        return "index";
    }
    @GetMapping("/delete")
    public String deleteProduct(@RequestParam Long id) {
        productRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/formProducts")
    public String formProducts(Model model){
        model.addAttribute("product", new Product());
        return "formProducts";
    }

    @PostMapping("/save")
    public String save(@Valid Product product, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "formProducts";
        }
        productRepository.save(product);
        return "redirect:/formProducts";
    }

    @GetMapping("/edit")
    public String editProduct(@RequestParam Long id, Model model) {
        Product product = productRepository.findById(id).orElse(null);
        model.addAttribute("product", product);
        return "formProducts";
    }





}
