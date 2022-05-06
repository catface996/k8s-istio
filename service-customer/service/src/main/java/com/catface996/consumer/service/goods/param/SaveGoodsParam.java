package com.catface996.consumer.service.goods.param;

import java.math.BigDecimal;

import lombok.Data;

/**
 * @author by 大猫
 * @date 2022/4/15 3:15 PM catface996 出品
 */
@Data
public class SaveGoodsParam {

    /**
     * 商品持有人ID
     */
    private Long goodsOwnerId;

    /**
     * 商品名称
     */
    private String goodsName;

    private String goodsBrand;

    private BigDecimal goodsPrice;

}
