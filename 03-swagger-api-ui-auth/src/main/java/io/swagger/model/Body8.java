package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * Body8
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-12T08:55:16.176Z")

public class Body8   {
  @JsonProperty("materialids")
  private List<Long> materialids = new ArrayList<Long>();

  @JsonProperty("target_group_id")
  private Long targetGroupId = null;

  @JsonProperty("seller_id")
  private Long sellerId = null;

  public Body8 materialids(List<Long> materialids) {
    this.materialids = materialids;
    return this;
  }

  public Body8 addMaterialidsItem(Long materialidsItem) {
    this.materialids.add(materialidsItem);
    return this;
  }

   /**
   * Get materialids
   * @return materialids
  **/
  @ApiModelProperty(value = "")
  public List<Long> getMaterialids() {
    return materialids;
  }

  public void setMaterialids(List<Long> materialids) {
    this.materialids = materialids;
  }

  public Body8 targetGroupId(Long targetGroupId) {
    this.targetGroupId = targetGroupId;
    return this;
  }

   /**
   * 分组ID 
   * @return targetGroupId
  **/
  @ApiModelProperty(value = "分组ID ")
  public Long getTargetGroupId() {
    return targetGroupId;
  }

  public void setTargetGroupId(Long targetGroupId) {
    this.targetGroupId = targetGroupId;
  }

  public Body8 sellerId(Long sellerId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body8 body8 = (Body8) o;
    return Objects.equals(this.materialids, body8.materialids) &&
        Objects.equals(this.targetGroupId, body8.targetGroupId) &&
        Objects.equals(this.sellerId, body8.sellerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(materialids, targetGroupId, sellerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body8 {\n");
    
    sb.append("    materialids: ").append(toIndentedString(materialids)).append("\n");
    sb.append("    targetGroupId: ").append(toIndentedString(targetGroupId)).append("\n");
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

