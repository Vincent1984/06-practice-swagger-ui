package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * GenerateQrcodeRespData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-12T08:55:16.176Z")

public class GenerateQrcodeRespData   {
  @JsonProperty("url_200")
  private String url200 = null;

  @JsonProperty("url_400")
  private String url400 = null;

  @JsonProperty("url_600")
  private String url600 = null;

  @JsonProperty("url_800")
  private String url800 = null;

  public GenerateQrcodeRespData url200(String url200) {
    this.url200 = url200;
    return this;
  }

   /**
   * 二维码URL200*200
   * @return url200
  **/
  @ApiModelProperty(value = "二维码URL200*200")
  public String getUrl200() {
    return url200;
  }

  public void setUrl200(String url200) {
    this.url200 = url200;
  }

  public GenerateQrcodeRespData url400(String url400) {
    this.url400 = url400;
    return this;
  }

   /**
   * 二维码URL400*400
   * @return url400
  **/
  @ApiModelProperty(value = "二维码URL400*400")
  public String getUrl400() {
    return url400;
  }

  public void setUrl400(String url400) {
    this.url400 = url400;
  }

  public GenerateQrcodeRespData url600(String url600) {
    this.url600 = url600;
    return this;
  }

   /**
   * 二维码URL600*600
   * @return url600
  **/
  @ApiModelProperty(value = "二维码URL600*600")
  public String getUrl600() {
    return url600;
  }

  public void setUrl600(String url600) {
    this.url600 = url600;
  }

  public GenerateQrcodeRespData url800(String url800) {
    this.url800 = url800;
    return this;
  }

   /**
   * 二维码URL800*800
   * @return url800
  **/
  @ApiModelProperty(value = "二维码URL800*800")
  public String getUrl800() {
    return url800;
  }

  public void setUrl800(String url800) {
    this.url800 = url800;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateQrcodeRespData generateQrcodeRespData = (GenerateQrcodeRespData) o;
    return Objects.equals(this.url200, generateQrcodeRespData.url200) &&
        Objects.equals(this.url400, generateQrcodeRespData.url400) &&
        Objects.equals(this.url600, generateQrcodeRespData.url600) &&
        Objects.equals(this.url800, generateQrcodeRespData.url800);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url200, url400, url600, url800);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateQrcodeRespData {\n");
    
    sb.append("    url200: ").append(toIndentedString(url200)).append("\n");
    sb.append("    url400: ").append(toIndentedString(url400)).append("\n");
    sb.append("    url600: ").append(toIndentedString(url600)).append("\n");
    sb.append("    url800: ").append(toIndentedString(url800)).append("\n");
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

