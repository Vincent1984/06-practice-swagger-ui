package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * ContentmaterialBatchDeleteMaterialids
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-12T08:55:16.176Z")

public class ContentmaterialBatchDeleteMaterialids   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("seller_id")
  private Long sellerId = null;

  public ContentmaterialBatchDeleteMaterialids id(Long id) {
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

  public ContentmaterialBatchDeleteMaterialids sellerId(Long sellerId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentmaterialBatchDeleteMaterialids contentmaterialBatchDeleteMaterialids = (ContentmaterialBatchDeleteMaterialids) o;
    return Objects.equals(this.id, contentmaterialBatchDeleteMaterialids.id) &&
        Objects.equals(this.sellerId, contentmaterialBatchDeleteMaterialids.sellerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sellerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentmaterialBatchDeleteMaterialids {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
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

