package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * BasicResp
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-12T08:55:16.176Z")

public class BasicResp   {
  @JsonProperty("result")
  private String result = null;

  @JsonProperty("error_code")
  private String errorCode = null;

  @JsonProperty("return_msg")
  private String returnMsg = null;

  public BasicResp result(String result) {
    this.result = result;
    return this;
  }

   /**
   * SUCCESS|FAIL|NOTFOUND|INVALID
   * @return result
  **/
  @ApiModelProperty(value = "SUCCESS|FAIL|NOTFOUND|INVALID")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public BasicResp errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * 错误码
   * @return errorCode
  **/
  @ApiModelProperty(value = "错误码")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public BasicResp returnMsg(String returnMsg) {
    this.returnMsg = returnMsg;
    return this;
  }

   /**
   * 返回信息，如非空，为错误原因
   * @return returnMsg
  **/
  @ApiModelProperty(example = "参数格式校验错误", value = "返回信息，如非空，为错误原因")
  public String getReturnMsg() {
    return returnMsg;
  }

  public void setReturnMsg(String returnMsg) {
    this.returnMsg = returnMsg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicResp basicResp = (BasicResp) o;
    return Objects.equals(this.result, basicResp.result) &&
        Objects.equals(this.errorCode, basicResp.errorCode) &&
        Objects.equals(this.returnMsg, basicResp.returnMsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, errorCode, returnMsg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicResp {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    returnMsg: ").append(toIndentedString(returnMsg)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

