package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import javax.validation.constraints.*;
/**
 * MaterialGroup
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-12T08:55:16.176Z")

public class MaterialGroup   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("seller_id")
  private Long sellerId = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("create_time")
  private DateTime createTime = null;

  @JsonProperty("update_time")
  private DateTime updateTime = null;

  public MaterialGroup id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public MaterialGroup sellerId(Long sellerId) {
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

  public MaterialGroup type(String type) {
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

  public MaterialGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MaterialGroup createTime(DateTime createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @ApiModelProperty(value = "")
  public DateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(DateTime createTime) {
    this.createTime = createTime;
  }

  public MaterialGroup updateTime(DateTime updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * 
   * @return updateTime
  **/
  @ApiModelProperty(value = "")
  public DateTime getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(DateTime updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaterialGroup materialGroup = (MaterialGroup) o;
    return Objects.equals(this.id, materialGroup.id) &&
        Objects.equals(this.sellerId, materialGroup.sellerId) &&
        Objects.equals(this.type, materialGroup.type) &&
        Objects.equals(this.name, materialGroup.name) &&
        Objects.equals(this.createTime, materialGroup.createTime) &&
        Objects.equals(this.updateTime, materialGroup.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sellerId, type, name, createTime, updateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaterialGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

