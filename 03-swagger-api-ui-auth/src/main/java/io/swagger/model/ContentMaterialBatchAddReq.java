package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ContentmaterialBatchAddMaterialids;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * ContentMaterialBatchAddReq
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-12T08:55:16.176Z")

public class ContentMaterialBatchAddReq   {
  @JsonProperty("materialids")
  private List<ContentmaterialBatchAddMaterialids> materialids = new ArrayList<ContentmaterialBatchAddMaterialids>();

  public ContentMaterialBatchAddReq materialids(List<ContentmaterialBatchAddMaterialids> materialids) {
    this.materialids = materialids;
    return this;
  }

  public ContentMaterialBatchAddReq addMaterialidsItem(ContentmaterialBatchAddMaterialids materialidsItem) {
    this.materialids.add(materialidsItem);
    return this;
  }

   /**
   * Get materialids
   * @return materialids
  **/
  @ApiModelProperty(value = "")
  public List<ContentmaterialBatchAddMaterialids> getMaterialids() {
    return materialids;
  }

  public void setMaterialids(List<ContentmaterialBatchAddMaterialids> materialids) {
    this.materialids = materialids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentMaterialBatchAddReq contentMaterialBatchAddReq = (ContentMaterialBatchAddReq) o;
    return Objects.equals(this.materialids, contentMaterialBatchAddReq.materialids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(materialids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentMaterialBatchAddReq {\n");
    
    sb.append("    materialids: ").append(toIndentedString(materialids)).append("\n");
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

