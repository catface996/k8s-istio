package com.catface996.provider.api.order;

import com.catface996.common.model.JsonResult;
import com.catface996.provider.api.order.request.CreateOrderRequest;
import com.catface996.provider.api.order.vo.OrderVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author by 大猫
 * @date 2022/5/6 13:24 catface996 出品
 */
@FeignClient(name = "helloApi", url = "${rpc.provider.service}", fallbackFactory = OrderApiFallback.class)
public interface OrderApi {

    /**
     * 创建订单
     *
     * @param request 买家购买单种商品
     * @return 订单 ID
     */
    @PostMapping(value = "/v2/order/create")
    JsonResult<OrderVO> create(CreateOrderRequest request);
}
