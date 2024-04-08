package com.example.productservicesst.services;

import com.example.productservicesst.models.Product;

import java.util.List;

public interface ProductService {
   Product getAllProductById(long id);
   List<Product> getAllProducts();

}
