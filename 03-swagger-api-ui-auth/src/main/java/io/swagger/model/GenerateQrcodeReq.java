package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * GenerateQrcodeReq
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-12T08:55:16.176Z")

public class GenerateQrcodeReq   {
  @JsonProperty("qrcodeString")
  private String qrcodeString = null;

  @JsonProperty("ossType")
  private String ossType = null;

  public GenerateQrcodeReq qrcodeString(String qrcodeString) {
    this.qrcodeString = qrcodeString;
    return this;
  }

   /**
   * 二维码参数字符串
   * @return qrcodeString
  **/
  @ApiModelProperty(value = "二维码参数字符串")
  public String getQrcodeString() {
    return qrcodeString;
  }

  public void setQrcodeString(String qrcodeString) {
    this.qrcodeString = qrcodeString;
  }

  public GenerateQrcodeReq ossType(String ossType) {
    this.ossType = ossType;
    return this;
  }

   /**
   * oss服务类型,图片服务可以提供图片的大小调整的服务. 根据类型返回 OSS: 代表普通的OSS链接, IMG: 代表图片服务的链接
   * @return ossType
  **/
  @ApiModelProperty(value = "oss服务类型,图片服务可以提供图片的大小调整的服务. 根据类型返回 OSS: 代表普通的OSS链接, IMG: 代表图片服务的链接")
  public String getOssType() {
    return ossType;
  }

  public void setOssType(String ossType) {
    this.ossType = ossType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateQrcodeReq generateQrcodeReq = (GenerateQrcodeReq) o;
    return Objects.equals(this.qrcodeString, generateQrcodeReq.qrcodeString) &&
        Objects.equals(this.ossType, generateQrcodeReq.ossType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qrcodeString, ossType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateQrcodeReq {\n");
    
    sb.append("    qrcodeString: ").append(toIndentedString(qrcodeString)).append("\n");
    sb.append("    ossType: ").append(toIndentedString(ossType)).append("\n");
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

