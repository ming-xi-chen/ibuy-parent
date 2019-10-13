package cn.itsource.ibuy.service.impl;

import cn.itsource.ibuy.ProductApplicaiton;
import cn.itsource.ibuy.domain.ProductType;
import cn.itsource.ibuy.service.IProductTypeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProductApplicaiton.class)
public class ProductTypeServiceTest {

    @Autowired
    private IProductTypeService productTypeService;

    @Test
    public void loadTypeTree() {

        List<ProductType> productTypes = productTypeService.loadTypeTree();

    }
}