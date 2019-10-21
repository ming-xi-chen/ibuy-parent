package cn.itsource.ibuy.mapper;

import cn.itsource.ibuy.domain.Product;
import cn.itsource.ibuy.query.ProductQuery;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper extends BaseMapper<Product> {

    /**
     * mybatisplus中规定的
     * 如果对自定义的sql做分页
     * mapper接口返回类型为IPage
     * mapper接口的第一个参数必须为Page
     * @param page
     * @param query
     * @return
     */
    IPage queryPage(Page page, @Param("query") ProductQuery query);

    /**
     * 修改显示属性
     * mapper接口中如果有多个参数需要在sql中获取作为参数
     * 需要参数绑定，使用@Param注解
     * @param productId
     * @param viewProperties
     */
    void updateViewProperties(@Param("productId") Long productId, @Param("viewProperties") String viewProperties);

    /**
     * 修改商品的sku属性
     * @param productId
     * @param skuPropertiesJSON
     */
    void updateSkuProperties(@Param("productId") Long productId, @Param("skuProperties") String skuPropertiesJSON);
}
