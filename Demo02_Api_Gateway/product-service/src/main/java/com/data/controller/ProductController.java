package com.data.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    @GetMapping
    public ResponseEntity<?> getAll() {
        List<String> products = Arrays.asList("Hat", "Shoes");

        return ResponseEntity.ok(products);
    }
}
