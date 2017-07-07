package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InlineResponse200ReturnData;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * ContentMaterialListAllResp
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-12T08:55:16.176Z")

public class ContentMaterialListAllResp   {
  @JsonProperty("result")
  private String result = null;

  @JsonProperty("error_code")
  private String errorCode = null;

  @JsonProperty("return_msg")
  private String returnMsg = null;

  @JsonProperty("total_results")
  private Long totalResults = null;

  @JsonProperty("return_data")
  private List<InlineResponse200ReturnData> returnData = new ArrayList<InlineResponse200ReturnData>();

  public ContentMaterialListAllResp result(String result) {
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

  public ContentMaterialListAllResp errorCode(String errorCode) {
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

  public ContentMaterialListAllResp returnMsg(String returnMsg) {
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

  public ContentMaterialListAllResp totalResults(Long totalResults) {
    this.totalResults = totalResults;
    return this;
  }

   /**
   * 总记录数
   * @return totalResults
  **/
  @ApiModelProperty(value = "总记录数")
  public Long getTotalResults() {
    return totalResults;
  }

  public void setTotalResults(Long totalResults) {
    this.totalResults = totalResults;
  }

  public ContentMaterialListAllResp returnData(List<InlineResponse200ReturnData> returnData) {
    this.returnData = returnData;
    return this;
  }

  public ContentMaterialListAllResp addReturnDataItem(InlineResponse200ReturnData returnDataItem) {
    this.returnData.add(returnDataItem);
    return this;
  }

   /**
   * Get returnData
   * @return returnData
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse200ReturnData> getReturnData() {
    return returnData;
  }

  public void setReturnData(List<InlineResponse200ReturnData> returnData) {
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
    ContentMaterialListAllResp contentMaterialListAllResp = (ContentMaterialListAllResp) o;
    return Objects.equals(this.result, contentMaterialListAllResp.result) &&
        Objects.equals(this.errorCode, contentMaterialListAllResp.errorCode) &&
        Objects.equals(this.returnMsg, contentMaterialListAllResp.returnMsg) &&
        Objects.equals(this.totalResults, contentMaterialListAllResp.totalResults) &&
        Objects.equals(this.returnData, contentMaterialListAllResp.returnData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, errorCode, returnMsg, totalResults, returnData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentMaterialListAllResp {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    returnMsg: ").append(toIndentedString(returnMsg)).append("\n");
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
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

