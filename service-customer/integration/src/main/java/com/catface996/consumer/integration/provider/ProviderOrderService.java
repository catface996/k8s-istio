package com.catface996.consumer.integration.provider;

import java.util.Collections;

import com.catface996.common.model.JsonResult;
import com.catface996.provider.api.order.OrderApi;
import com.catface996.provider.api.order.request.CreateOrderRequest;
import com.catface996.provider.api.order.request.ProductRequest;
import com.catface996.provider.api.order.vo.OrderVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * @author by 大猫
 * @date 2022/5/6 13:39 catface996 出品
 */
@Slf4j
@Service
public class ProviderOrderService {

    private final OrderApi orderApi;

    public ProviderOrderService(OrderApi orderApi) {
        this.orderApi = orderApi;
    }

    /**
     * 创建交易订单
     *
     * @param buyerId   买家 ID
     * @param productId 商品 ID
     * @param nums      购买数量
     * @return 订单 ID
     */
    public String createOrder(Long buyerId, Long productId, Integer nums) {
        CreateOrderRequest request = new CreateOrderRequest();
        request.setBuyerId(buyerId);
        ProductRequest productRequest = new ProductRequest();
        productRequest.setProductId(productId);
        productRequest.setNums(nums);
        request.setProducts(Collections.singletonList(productRequest));
        JsonResult<OrderVO> jsonResult = orderApi.create(request);
        Assert.state(jsonResult.getSuccess(), jsonResult.getMessage());
        return jsonResult.getData().getMemo();
    }
}
