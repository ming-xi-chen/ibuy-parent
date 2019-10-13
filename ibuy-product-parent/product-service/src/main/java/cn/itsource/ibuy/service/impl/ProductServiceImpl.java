package cn.itsource.ibuy.service.impl;

import cn.itsource.ibuy.domain.Product;
import cn.itsource.ibuy.mapper.ProductMapper;
import cn.itsource.ibuy.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
