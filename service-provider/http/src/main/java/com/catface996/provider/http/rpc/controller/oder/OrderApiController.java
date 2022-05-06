package com.catface996.provider.http.rpc.controller.oder;

import javax.validation.Valid;

import com.catface996.common.model.JsonResult;
import com.catface996.provider.api.order.OrderApi;
import com.catface996.provider.api.order.request.CreateOrderRequest;
import com.catface996.provider.api.order.vo.OrderVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by 大猫
 * @date 2022/5/6 13:35 catface996 出品
 */
@Slf4j
@RestController
public class OrderApiController implements OrderApi {
    /**
     * 创建订单
     *
     * @param request 买家购买单种商品
     * @return 订单 ID
     */
    @Override
    public JsonResult<OrderVO> create(@RequestBody @Valid CreateOrderRequest request) {
        log.info("create order request:{}", request);
        OrderVO vo = new OrderVO();
        vo.setOrderId(1234567890L);
        vo.setMemo("V2开业第一单，普天同庆");
        return JsonResult.success(vo);
    }
}
