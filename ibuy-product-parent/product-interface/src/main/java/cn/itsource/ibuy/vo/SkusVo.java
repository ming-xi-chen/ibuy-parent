package cn.itsource.ibuy.vo;

import cn.itsource.ibuy.domain.Specification;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class SkusVo {

    private List<Specification> skuProperties;

    private List<Map<String,String>> skus;

}
