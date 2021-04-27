package com.minhaempresa.commerce.ControllerTests;

import com.minhaempresa.commerce.Model.Category;
import org.aspectj.weaver.ast.Var;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

public class CategoryControllerTests {


    @Test
    public void DadoUmNovoCadastroDeCategoria(){
        RestTemplate restTemplate = new RestTemplate();
        Category category = new Category();
        category.setName("Brinquedos");
        category.setCode(2);
        category.setWeb(true);
        String responseToReturn= restTemplate.postForObject("http://localhost:8089/category", category, String.class);
        Assert.assertNotNull(responseToReturn);
        Assert.assertEquals("Sucess",responseToReturn);
    }

}
