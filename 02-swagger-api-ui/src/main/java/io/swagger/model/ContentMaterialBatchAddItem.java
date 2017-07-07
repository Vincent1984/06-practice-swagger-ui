package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * ContentMaterialBatchAddItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-12T08:55:16.176Z")

public class ContentMaterialBatchAddItem   {
  @JsonProperty("seller_id")
  private Long sellerId = null;

  @JsonProperty("material_group_id")
  private Long materialGroupId = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("file_name")
  private String fileName = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("text_content")
  private String textContent = null;

  @JsonProperty("description")
  private String description = null;

  public ContentMaterialBatchAddItem sellerId(Long sellerId) {
    this.sellerId = sellerId;
    return this;
  }

   /**
   * 商户ID 
   * @return sellerId
  **/
  @ApiModelProperty(value = "商户ID ")
  public Long getSellerId() {
    return sellerId;
  }

  public void setSellerId(Long sellerId) {
    this.sellerId = sellerId;
  }

  public ContentMaterialBatchAddItem materialGroupId(Long materialGroupId) {
    this.materialGroupId = materialGroupId;
    return this;
  }

   /**
   * 分组ID 
   * @return materialGroupId
  **/
  @ApiModelProperty(value = "分组ID ")
  public Long getMaterialGroupId() {
    return materialGroupId;
  }

  public void setMaterialGroupId(Long materialGroupId) {
    this.materialGroupId = materialGroupId;
  }

  public ContentMaterialBatchAddItem url(String url) {
    this.url = url;
    return this;
  }

   /**
   * 资源地址 
   * @return url
  **/
  @ApiModelProperty(value = "资源地址 ")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ContentMaterialBatchAddItem fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * 文件名 
   * @return fileName
  **/
  @ApiModelProperty(value = "文件名 ")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public ContentMaterialBatchAddItem type(String type) {
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

  public ContentMaterialBatchAddItem textContent(String textContent) {
    this.textContent = textContent;
    return this;
  }

   /**
   * 文本内容 
   * @return textContent
  **/
  @ApiModelProperty(value = "文本内容 ")
  public String getTextContent() {
    return textContent;
  }

  public void setTextContent(String textContent) {
    this.textContent = textContent;
  }

  public ContentMaterialBatchAddItem description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 描述应用场景 
   * @return description
  **/
  @ApiModelProperty(value = "描述应用场景 ")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentMaterialBatchAddItem contentMaterialBatchAddItem = (ContentMaterialBatchAddItem) o;
    return Objects.equals(this.sellerId, contentMaterialBatchAddItem.sellerId) &&
        Objects.equals(this.materialGroupId, contentMaterialBatchAddItem.materialGroupId) &&
        Objects.equals(this.url, contentMaterialBatchAddItem.url) &&
        Objects.equals(this.fileName, contentMaterialBatchAddItem.fileName) &&
        Objects.equals(this.type, contentMaterialBatchAddItem.type) &&
        Objects.equals(this.textContent, contentMaterialBatchAddItem.textContent) &&
        Objects.equals(this.description, contentMaterialBatchAddItem.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerId, materialGroupId, url, fileName, type, textContent, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentMaterialBatchAddItem {\n");
    
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
    sb.append("    materialGroupId: ").append(toIndentedString(materialGroupId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    textContent: ").append(toIndentedString(textContent)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

