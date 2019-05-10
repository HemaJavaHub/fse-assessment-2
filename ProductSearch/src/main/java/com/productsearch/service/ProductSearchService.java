package com.productsearch.service;

import com.productsearch.model.ProductSearchModel;
import com.productsearch.repository.ProductSearchRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductSearchService {


    private static ProductSearchModel productSearchModel;

    private  static ProductSearchRepository productSearchRepository

    @Autowired
    public ProductSearchService(ProductSearchRepository productSearchRepository){
        this.productSearchRepository = productSearchRepository;
    }


    public static ProductSearchModel getProductByColor(String color) {

        return productSearchModel;
    }

    public static  List<ProductSearchModel> getProductByPrice(Integer price) {
        return productSearchRepository.findAll();
    }
}
