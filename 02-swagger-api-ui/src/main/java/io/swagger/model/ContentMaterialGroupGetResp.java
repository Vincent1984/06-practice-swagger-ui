package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InlineResponse2004ReturnData;
import javax.validation.constraints.*;
/**
 * ContentMaterialGroupGetResp
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-12T08:55:16.176Z")

public class ContentMaterialGroupGetResp   {
  @JsonProperty("result")
  private String result = null;

  @JsonProperty("error_code")
  private String errorCode = null;

  @JsonProperty("return_msg")
  private String returnMsg = null;

  @JsonProperty("return_data")
  private InlineResponse2004ReturnData returnData = null;

  public ContentMaterialGroupGetResp result(String result) {
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

  public ContentMaterialGroupGetResp errorCode(String errorCode) {
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

  public ContentMaterialGroupGetResp returnMsg(String returnMsg) {
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

  public ContentMaterialGroupGetResp returnData(InlineResponse2004ReturnData returnData) {
    this.returnData = returnData;
    return this;
  }

   /**
   * Get returnData
   * @return returnData
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2004ReturnData getReturnData() {
    return returnData;
  }

  public void setReturnData(InlineResponse2004ReturnData returnData) {
    this.returnData = returnData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentMaterialGroupGetResp contentMaterialGroupGetResp = (ContentMaterialGroupGetResp) o;
    return Objects.equals(this.result, contentMaterialGroupGetResp.result) &&
        Objects.equals(this.errorCode, contentMaterialGroupGetResp.errorCode) &&
        Objects.equals(this.returnMsg, contentMaterialGroupGetResp.returnMsg) &&
        Objects.equals(this.returnData, contentMaterialGroupGetResp.returnData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, errorCode, returnMsg, returnData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentMaterialGroupGetResp {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    returnMsg: ").append(toIndentedString(returnMsg)).append("\n");
    sb.append("    returnData: ").append(toIndentedString(returnData)).append("\n");
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

