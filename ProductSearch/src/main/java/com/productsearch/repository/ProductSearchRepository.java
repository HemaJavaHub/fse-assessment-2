package com.productsearch.repository;

import com.productsearch.model.ProductSearchModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductSearchRepository extends JpaRepository<ProductSearchModel,Integer> {
}
