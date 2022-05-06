package com.catface996.provider.common.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.catface996.common.enums.BaseEnum;

/**
 * @author by catface
 * @date 2020/12/19 1:28 下午
 */
public enum TradeRoleEnum implements BaseEnum {

    /**
     * 交易参与的角色枚举值
     */
    PAYER("PAYER", "付款人"),

    RECEIVER("RECEIVER", "收款人"),
    ;

    @EnumValue
    private final String code;

    private final String desc;

    TradeRoleEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

  /**
   * 获取枚举值描述
   *
   * @return 枚举值描述
   */
  @Override
  public String getDesc() {
      return desc;
  }

    /**
     * 获取枚举值编码
     *
     * @return 枚举值编码
     */
    @Override
    public String getCode() {
        return code;
  }
}
