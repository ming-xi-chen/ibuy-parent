package cn.itsource.ibuy.service;

import cn.itsource.ibuy.domain.Product;
import cn.itsource.ibuy.query.ProductQuery;
import cn.itsource.ibuy.util.PageList;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 商品 服务类
 * </p>
 *
 * @author solargen
 * @since 2019-10-12
 */
public interface IProductService extends IService<Product> {

    PageList<Product> queryPage(ProductQuery query);
}
