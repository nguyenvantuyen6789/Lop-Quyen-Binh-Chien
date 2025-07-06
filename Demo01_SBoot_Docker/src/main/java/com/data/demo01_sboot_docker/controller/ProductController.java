package com.data.demo01_sboot_docker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("product")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok("Hu tieu");
    }
}
