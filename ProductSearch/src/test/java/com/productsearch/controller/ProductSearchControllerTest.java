package com.productsearch.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.productsearch.model.ProductSearchModel;
import com.productsearch.service.ProductSearchService;
import com.productsearch.utils.TestProducts;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.List;


import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(ProductSearchController.class)

public class ProductSearchControllerTest {


    @Autowired
    private MockMvc mockMvc;


    @MockBean
    private ProductSearchService productSearchService;

    @Autowired
    ObjectMapper objectMapper;
    private ProductSearchService productSearchService;


    private ProductSearchModel productSearchModel;
    @Test
    public void findProductByColor() throws Exception {
        //arrange
        List<ProductSearchModel> productSearchModels = new ArrayList<>();
        productSearchModels.add(TestProducts.getProducts().get(0));

        when(ProductSearchService.getProductByColor("red")).thenReturn(productSearchModel);

        mockMvc.perform(MockMvcRequestBuilders.get("/songs/Africa"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].color", is("red")))
                .andExpect(jsonPath("$[1].color", is("red")));

        verify(productSearchService, times(1)).getProductByColor("red");
        verifyNoMoreInteractions(productSearchService);
    }

}