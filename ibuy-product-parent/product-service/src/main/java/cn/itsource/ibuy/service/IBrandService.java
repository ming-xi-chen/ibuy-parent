package cn.itsource.ibuy.service;

import cn.itsource.ibuy.domain.Brand;
import cn.itsource.ibuy.query.BrandQuery;
import cn.itsource.ibuy.util.PageList;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 品牌信息 服务类
 * </p>
 *
 * @author solargen
 * @since 2019-10-12
 */
public interface IBrandService extends IService<Brand> {

    /**
     * 分页高级查询
     * @param query
     * @return
     */
    PageList<Brand> queryPage(BrandQuery query);
}
