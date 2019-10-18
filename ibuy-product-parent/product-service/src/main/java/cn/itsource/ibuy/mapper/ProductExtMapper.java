package cn.itsource.ibuy.mapper;

import cn.itsource.ibuy.domain.ProductExt;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 商品扩展 Mapper 接口
 * </p>
 *
 * @author mingxi
 * @since 2019-10-17
 */

@Component
public interface ProductExtMapper extends BaseMapper<ProductExt> {

}
