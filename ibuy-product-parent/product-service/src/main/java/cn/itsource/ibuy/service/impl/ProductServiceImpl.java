package cn.itsource.ibuy.service.impl;

import cn.itsource.ibuy.domain.Product;
import cn.itsource.ibuy.mapper.ProductMapper;
import cn.itsource.ibuy.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品 服务实现类
 * </p>
 *
 * @author solargen
 * @since 2019-10-12
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
