package com.productsearch.controller;

//As a customer, I can filter search results by brand.
//        As a customer, I can filter search results by color.
//        As a customer, I can filter search results by price range.
//        As a customer, I can combine multiple filters.


import com.productsearch.model.ProductSearchModel;
import com.productsearch.service.ProductSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductSearchController {

    private ProductSearchService productSearchService;

    @Autowired
    public ProductSearchController( ProductSearchService productSearchService) {
        this.productSearchService = productSearchService;
    }

    @GetMapping("/productsearch-color/{color}")
    public ProductSearchModel searchProductByColor(@PathVariable String color){
        return productSearchService.getProductByColor(color);
    }

    @GetMapping("/productsearch-price/{price}")
    private ProductSearchModel searchProductByPrice(@PathVariable Integer price){
        return productSearchService.getProductByPrice(price);
    }





}
