package com.catface996.provider.api.order;

import com.catface996.common.model.JsonResult;
import com.catface996.provider.api.order.request.CreateOrderRequest;
import com.catface996.provider.api.order.vo.OrderVO;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author by 大猫
 * @date 2022/5/6 13:25 catface996 出品
 */
@Slf4j
@Component
public class OrderApiFallback implements FallbackFactory<OrderApi> {

    @Override
    public OrderApi create(Throwable cause) {
        return new OrderApi() {
            @Override
            public JsonResult<OrderVO> create(CreateOrderRequest request) {
                log.error("rpc create order error，request：{}", request, cause);
                return JsonResult.rpcError("创建订单失败");
            }
        };
    }
}
