package com.catface996.consumer.http.web.controller.order.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author by 大猫
 * @date 2022/5/6 13:50 catface996 出品
 */
@ApiModel(description = "提交订单请求")
@Data
public class SubmitOrderRequest {

    @ApiModelProperty(value = "商品 ID",required = true,example = "123232323")
    @NotNull(message = "商品 ID 不能为空")
    private Long productId;

    @ApiModelProperty(value = "买家 ID",required = true,example = "909090")
    @NotNull(message = "买家 ID 不能为空")
    private Long buyerId;

    @ApiModelProperty(value = "购买数量",required = true,example = "3")
    @NotNull(message = "商品数量不能为空")
    @Min(value = 1,message = "至少购买1 件")
    private Integer nums;
}
