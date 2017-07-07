package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * Body5
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-12T08:55:16.176Z")

public class Body5   {
  @JsonProperty("seller_id")
  private Long sellerId = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("name")
  private String name = null;

  public Body5 sellerId(Long sellerId) {
    this.sellerId = sellerId;
    return this;
  }

   /**
   *  商户ID
   * @return sellerId
  **/
  @ApiModelProperty(value = " 商户ID")
  public Long getSellerId() {
    return sellerId;
  }

  public void setSellerId(Long sellerId) {
    this.sellerId = sellerId;
  }

  public Body5 type(String type) {
    this.type = type;
    return this;
  }

   /**
   * PICTURE: 图片 MUSIC:音频 VIDEO:视频 TEXT:文本 
   * @return type
  **/
  @ApiModelProperty(value = "PICTURE: 图片 MUSIC:音频 VIDEO:视频 TEXT:文本 ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Body5 name(String name) {
    this.name = name;
    return this;
  }

   /**
   *  分组名称
   * @return name
  **/
  @ApiModelProperty(value = " 分组名称")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body5 body5 = (Body5) o;
    return Objects.equals(this.sellerId, body5.sellerId) &&
        Objects.equals(this.type, body5.type) &&
        Objects.equals(this.name, body5.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerId, type, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body5 {\n");
    
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

