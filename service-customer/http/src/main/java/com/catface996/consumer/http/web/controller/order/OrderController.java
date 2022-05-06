package com.catface996.consumer.http.web.controller.order;

import javax.validation.Valid;

import com.catface996.common.model.JsonResult;
import com.catface996.consumer.http.web.controller.order.request.SubmitOrderRequest;
import com.catface996.consumer.integration.provider.ProviderOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by 大猫
 * @date 2022/5/6 13:48 catface996 出品
 */
@Slf4j
@Api(tags = {"V2版本的订单 API"})
@RestController
public class OrderController {

    private final ProviderOrderService providerOrderService;

    public OrderController(ProviderOrderService providerOrderService) {
        this.providerOrderService = providerOrderService;
    }

    @ApiOperation(value = "提交订单")
    @PostMapping(value = "/submitOrder")
    public JsonResult<Long> submitOrder(@RequestBody @Valid SubmitOrderRequest request) {
        log.info("submitOrder request:{}", request);
        Long orderId = providerOrderService.createOrder(request.getBuyerId(), request.getProductId(),
            request.getNums());
        return JsonResult.success(orderId);
    }
}
