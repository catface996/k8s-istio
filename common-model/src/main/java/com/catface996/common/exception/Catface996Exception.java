package com.catface996.common.exception;

import lombok.Data;

/**
 * @author catface
 * @date 2019-01-23
 */
@Data
public class Catface996Exception extends RuntimeException {

  private String errorCode;

  private String errorMessage;

  public Catface996Exception(BaseErrorEnum baseErrorEnum) {
    super(baseErrorEnum.getMessage());
    this.errorCode = baseErrorEnum.getCode();
    this.errorMessage = baseErrorEnum.getMessage();
  }

  public Catface996Exception(String errorCode, String errorMessage) {
    super(errorMessage);
    this.errorCode = errorCode;
    this.errorMessage = errorMessage;
  }

  public Catface996Exception(BaseErrorEnum baseErrorEnum, Throwable cause) {
    super(cause);
    this.errorCode = baseErrorEnum.getCode();
    this.errorMessage = baseErrorEnum.getMessage();
  }

  public String getErrorCode() {
    return errorCode;
  }

  public String getErrorMessage() {
    return errorMessage;
  }
}
