package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InlineResponse2005ReturnData;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * ContentMaterialGroupUploadResp
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-12T08:55:16.176Z")

public class ContentMaterialGroupUploadResp   {
  @JsonProperty("result")
  private String result = null;

  @JsonProperty("error_code")
  private String errorCode = null;

  @JsonProperty("return_msg")
  private String returnMsg = null;

  @JsonProperty("return_data")
  private List<InlineResponse2005ReturnData> returnData = new ArrayList<InlineResponse2005ReturnData>();

  public ContentMaterialGroupUploadResp result(String result) {
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

  public ContentMaterialGroupUploadResp errorCode(String errorCode) {
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

  public ContentMaterialGroupUploadResp returnMsg(String returnMsg) {
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

  public ContentMaterialGroupUploadResp returnData(List<InlineResponse2005ReturnData> returnData) {
    this.returnData = returnData;
    return this;
  }

  public ContentMaterialGroupUploadResp addReturnDataItem(InlineResponse2005ReturnData returnDataItem) {
    this.returnData.add(returnDataItem);
    return this;
  }

   /**
   * Get returnData
   * @return returnData
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2005ReturnData> getReturnData() {
    return returnData;
  }

  public void setReturnData(List<InlineResponse2005ReturnData> returnData) {
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
    ContentMaterialGroupUploadResp contentMaterialGroupUploadResp = (ContentMaterialGroupUploadResp) o;
    return Objects.equals(this.result, contentMaterialGroupUploadResp.result) &&
        Objects.equals(this.errorCode, contentMaterialGroupUploadResp.errorCode) &&
        Objects.equals(this.returnMsg, contentMaterialGroupUploadResp.returnMsg) &&
        Objects.equals(this.returnData, contentMaterialGroupUploadResp.returnData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, errorCode, returnMsg, returnData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentMaterialGroupUploadResp {\n");
    
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

