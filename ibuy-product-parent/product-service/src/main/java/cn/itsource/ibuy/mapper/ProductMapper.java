package cn.itsource.ibuy.mapper;

import cn.itsource.ibuy.domain.Product;
import cn.itsource.ibuy.query.ProductQuery;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper extends BaseMapper<Product> {

    /**
     * @param page
     * @param query
     * @return
     */
    IPage queryPage(Page page, @Param("query") ProductQuery query);

}
