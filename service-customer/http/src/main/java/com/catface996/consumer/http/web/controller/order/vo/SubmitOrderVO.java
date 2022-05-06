package com.catface996.consumer.http.web.controller.order.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author by 大猫
 * @date 2022/5/6 16:39 catface996 出品
 */
@Data
public class SubmitOrderVO {

    @ApiModelProperty(value = "traceId")
    private String traceId;

    @ApiModelProperty(value = "provider返回的订单备注")
    private String memo;
}
