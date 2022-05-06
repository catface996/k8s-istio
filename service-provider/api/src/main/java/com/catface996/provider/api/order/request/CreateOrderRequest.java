package com.catface996.provider.api.order.request;


import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author by 大猫
 * @date 2022/5/6 13:29 catface996 出品
 */
@Data
@ApiModel(description = "创建订单请求")
public class CreateOrderRequest {

    @ApiModelProperty(value = "买家 ID",required = true,example = "909090")
    @NotNull(message = "买家 ID 不能为空")
    private Long buyerId;

    @NotEmpty(message = "购买的商品种类不能为空")
    private List<ProductRequest> products;

}
