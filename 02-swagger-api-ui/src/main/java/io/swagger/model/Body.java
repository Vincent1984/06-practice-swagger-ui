package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * Body
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-12T08:55:16.176Z")

public class Body   {
  @JsonProperty("seller_id")
  private Long sellerId = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("group_id")
  private Long groupId = null;

  @JsonProperty("file_name")
  private String fileName = null;

  @JsonProperty("page_num")
  private Long pageNum = null;

  @JsonProperty("page_size")
  private Long pageSize = null;

  public Body sellerId(Long sellerId) {
    this.sellerId = sellerId;
    return this;
  }

   /**
   * 商户ID
   * @return sellerId
  **/
  @ApiModelProperty(value = "商户ID")
  public Long getSellerId() {
    return sellerId;
  }

  public void setSellerId(Long sellerId) {
    this.sellerId = sellerId;
  }

  public Body type(String type) {
    this.type = type;
    return this;
  }

   /**
   * 素材类型
   * @return type
  **/
  @ApiModelProperty(value = "素材类型")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Body groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * 素材分组ID
   * @return groupId
  **/
  @ApiModelProperty(value = "素材分组ID")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public Body fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * 素材名称
   * @return fileName
  **/
  @ApiModelProperty(value = "素材名称")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public Body pageNum(Long pageNum) {
    this.pageNum = pageNum;
    return this;
  }

   /**
   * 页码
   * @return pageNum
  **/
  @ApiModelProperty(value = "页码")
  public Long getPageNum() {
    return pageNum;
  }

  public void setPageNum(Long pageNum) {
    this.pageNum = pageNum;
  }

  public Body pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 每页的数据
   * @return pageSize
  **/
  @ApiModelProperty(value = "每页的数据")
  public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body body = (Body) o;
    return Objects.equals(this.sellerId, body.sellerId) &&
        Objects.equals(this.type, body.type) &&
        Objects.equals(this.groupId, body.groupId) &&
        Objects.equals(this.fileName, body.fileName) &&
        Objects.equals(this.pageNum, body.pageNum) &&
        Objects.equals(this.pageSize, body.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerId, type, groupId, fileName, pageNum, pageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body {\n");
    
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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

