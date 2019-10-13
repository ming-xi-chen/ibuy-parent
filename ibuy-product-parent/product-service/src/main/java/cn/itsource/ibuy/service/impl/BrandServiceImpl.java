package cn.itsource.ibuy.service.impl;

import cn.itsource.ibuy.domain.Brand;
import cn.itsource.ibuy.mapper.BrandMapper;
import cn.itsource.ibuy.query.BrandQuery;
import cn.itsource.ibuy.service.IBrandService;
import cn.itsource.ibuy.util.PageList;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

    /**
     * 分页高级查询
     * @param query
     * @return
     */
    @Override
    public PageList<Brand> queryPage(BrandQuery query) {
        IPage<Brand> brandIPage =
                baseMapper.queryPage(new Page(query.getPage(), query.getRows()), query);
        PageList<Brand> pageList = new PageList<>(brandIPage.getTotal(),brandIPage.getRecords());
        return pageList;
    }
}
