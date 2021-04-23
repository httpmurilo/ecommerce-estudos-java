package com.minhaempresa.commerce.ControllerTests;

import com.minhaempresa.commerce.Model.Category;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

public class CategoryControllerTests {

    @Test(timeout = 3000)
    public void testGetRide() {
        RestTemplate restTemplate = new RestTemplate();
        Category category = restTemplate.getForObject("http://localhost:8080/category/1", Category.class);
        System.out.println("category name:" + category.getName());
    }

}
