package cn.itsource.ibuy.client;

import cn.itsource.ibuy.client.domain.ProductDoc;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("IBUY-COMMON")
public interface ProductESClient {
    /**
     * 批量保存
     * @param productDocList
     */
    @PostMapping("/es/saveBath")
    void saveBatch(@RequestBody List<ProductDoc> productDocList);
    /**
     * 批量删除
     * @param ids
     */
    @PostMapping("/es/deleteBath")
    void deleteBatch(@RequestBody List<Long> ids);
}
