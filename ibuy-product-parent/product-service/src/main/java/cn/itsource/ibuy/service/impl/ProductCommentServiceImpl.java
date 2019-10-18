package cn.itsource.ibuy.service.impl;

import cn.itsource.ibuy.domain.ProductComment;
import cn.itsource.ibuy.mapper.ProductCommentMapper;
import cn.itsource.ibuy.service.IProductCommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价 服务实现类
 * </p>
 *
 * @author mingxi
 * @since 2019-10-17
 */
@Service
public class ProductCommentServiceImpl extends ServiceImpl<ProductCommentMapper, ProductComment> implements IProductCommentService {

}
