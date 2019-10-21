package cn.itsource.ibuy.service;

import cn.itsource.ibuy.domain.Product;
import cn.itsource.ibuy.domain.Specification;
import cn.itsource.ibuy.query.ProductQuery;
import cn.itsource.ibuy.util.PageList;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

public interface IProductService extends IService<Product> {

    PageList<Product> queryPage(ProductQuery query);
    /**
     * 根据商品ID查询商品的显示属性
     * @param productId
     * @return
     */
    List<Specification> getViewProperties(Long productId);
    /**
     * 保存显示属性
     * @param productId 商品编号
     * @param specifications 显示属性
     * @return
     */
    void saveViewProperties(Long productId, List<Specification> specifications);
    /**
     * 根据商品ID查询商品的Sku属性
     * @param productId
     * @return
     */
    List<Specification> getSkuProperties(Long productId);

    /**
     * 保存sku属性
     * @param productId
     * @param skuProperties
     * @param skus
     */
    void saveSkuProperties(Long productId, List<Specification> skuProperties, List<Map<String, String>> skus);

    /**
     * 批量上架
     * @param idList
     */
    void onSale(List<Long> idList);

    /**
     * 批量下架
     * @param idList
     */
    void offSale(List<Long> idList);
}
