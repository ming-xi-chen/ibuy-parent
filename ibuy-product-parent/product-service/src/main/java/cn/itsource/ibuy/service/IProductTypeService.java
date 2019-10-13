package cn.itsource.ibuy.service;

import cn.itsource.ibuy.domain.ProductType;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;


public interface IProductTypeService extends IService<ProductType> {

    /**
     * 加载类型树
     * @return
     */
    List<ProductType> loadTypeTree();
}
