package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * ContentMaterialUpdateReq
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-12T08:55:16.176Z")

public class ContentMaterialUpdateReq   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("seller_id")
  private Long sellerId = null;

  @JsonProperty("file_name")
  private String fileName = null;

  public ContentMaterialUpdateReq id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * 素材ID 
   * @return id
  **/
  @ApiModelProperty(value = "素材ID ")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ContentMaterialUpdateReq sellerId(Long sellerId) {
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

  public ContentMaterialUpdateReq fileName(String fileName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentMaterialUpdateReq contentMaterialUpdateReq = (ContentMaterialUpdateReq) o;
    return Objects.equals(this.id, contentMaterialUpdateReq.id) &&
        Objects.equals(this.sellerId, contentMaterialUpdateReq.sellerId) &&
        Objects.equals(this.fileName, contentMaterialUpdateReq.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sellerId, fileName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentMaterialUpdateReq {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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

