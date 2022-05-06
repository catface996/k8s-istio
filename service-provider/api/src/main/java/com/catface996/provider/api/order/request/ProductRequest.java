package com.catface996.provider.api.order.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author by 大猫
 * @date 2022/5/6 14:47 catface996 出品
 */
@ApiModel(description = "购买商品请求")
@Data
public class ProductRequest {

    @ApiModelProperty(value = "商品 ID",required = true,example = "123232323")
    @NotNull(message = "商品 ID 不能为空")
    private Long productId;


    @ApiModelProperty(value = "购买数量",required = true,example = "3")
    @NotNull(message = "商品数量不能为空")
    @Min(value = 1,message = "至少购买1 件")
    private Integer nums;
}
