package com.productsearch.utils;

import com.productsearch.model.ProductSearchModel;

import java.util.ArrayList;
import java.util.List;


public class TestProducts {

    public static List<ProductSearchModel> getProducts(){
        List<ProductSearchModel> productSearchModels = new ArrayList<ProductSearchModel>();
        productSearchModels.add(new ProductSearchModel(1,"dresses","Gucci","yellow",2272.00));
        productSearchModels.add(new ProductSearchModel(2 ,"dresses","Gucci", "red", 1966.00));
        return productSearchModels;
    }
}