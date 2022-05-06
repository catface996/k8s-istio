package com.catface996.provider.api.order.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author by 大猫
 * @date 2022/5/6 13:27 catface996 出品
 */
@Data
@ApiModel(description = "订单返回模型")
public class OrderVO {

    @ApiModelProperty(value = "订单 ID", example = "1234567890")
    private Long orderId;

    private String memo;
}
