package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import javax.validation.constraints.*;
/**
 * Material
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-12T08:55:16.176Z")

public class Material   {
  @JsonProperty("id")
  private Long id = null;

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

  @JsonProperty("delete_flag")
  private Integer deleteFlag = null;

  @JsonProperty("create_time")
  private DateTime createTime = null;

  public Material id(Long id) {
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

  public Material sellerId(Long sellerId) {
    this.sellerId = sellerId;
    return this;
  }

   /**
   * 
   * @return sellerId
  **/
  @ApiModelProperty(value = "")
  public Long getSellerId() {
    return sellerId;
  }

  public void setSellerId(Long sellerId) {
    this.sellerId = sellerId;
  }

  public Material materialGroupId(Long materialGroupId) {
    this.materialGroupId = materialGroupId;
    return this;
  }

   /**
   * 
   * @return materialGroupId
  **/
  @ApiModelProperty(value = "")
  public Long getMaterialGroupId() {
    return materialGroupId;
  }

  public void setMaterialGroupId(Long materialGroupId) {
    this.materialGroupId = materialGroupId;
  }

  public Material url(String url) {
    this.url = url;
    return this;
  }

   /**
   * 
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Material fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * 文件名, 可以修改 
   * @return fileName
  **/
  @ApiModelProperty(value = "文件名, 可以修改 ")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public Material type(String type) {
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

  public Material textContent(String textContent) {
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

  public Material description(String description) {
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

  public Material deleteFlag(Integer deleteFlag) {
    this.deleteFlag = deleteFlag;
    return this;
  }

   /**
   *  0: 未删除 1:已删除
   * @return deleteFlag
  **/
  @ApiModelProperty(value = " 0: 未删除 1:已删除")
  public Integer getDeleteFlag() {
    return deleteFlag;
  }

  public void setDeleteFlag(Integer deleteFlag) {
    this.deleteFlag = deleteFlag;
  }

  public Material createTime(DateTime createTime) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Material material = (Material) o;
    return Objects.equals(this.id, material.id) &&
        Objects.equals(this.sellerId, material.sellerId) &&
        Objects.equals(this.materialGroupId, material.materialGroupId) &&
        Objects.equals(this.url, material.url) &&
        Objects.equals(this.fileName, material.fileName) &&
        Objects.equals(this.type, material.type) &&
        Objects.equals(this.textContent, material.textContent) &&
        Objects.equals(this.description, material.description) &&
        Objects.equals(this.deleteFlag, material.deleteFlag) &&
        Objects.equals(this.createTime, material.createTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sellerId, materialGroupId, url, fileName, type, textContent, description, deleteFlag, createTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Material {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
    sb.append("    materialGroupId: ").append(toIndentedString(materialGroupId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    textContent: ").append(toIndentedString(textContent)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deleteFlag: ").append(toIndentedString(deleteFlag)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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

