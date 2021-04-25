package com.minhaempresa.commerce.ControllerTests;

import com.minhaempresa.commerce.Controller.CategoryController;
import com.minhaempresa.commerce.Model.Category;
import com.minhaempresa.commerce.Repository.Interfaces.ICategoryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(CategoryController.class)
public class CategoryControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ICategoryRepository _repository;

    @Test
    public void DadoUmNovoCadastroDeCategoria(){
    }

}
