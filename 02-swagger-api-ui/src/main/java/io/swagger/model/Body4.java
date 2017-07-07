package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ContentmaterialBatchDeleteMaterialids;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * Body4
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-12T08:55:16.176Z")

public class Body4   {
  @JsonProperty("materialids")
  private List<ContentmaterialBatchDeleteMaterialids> materialids = new ArrayList<ContentmaterialBatchDeleteMaterialids>();

  public Body4 materialids(List<ContentmaterialBatchDeleteMaterialids> materialids) {
    this.materialids = materialids;
    return this;
  }

  public Body4 addMaterialidsItem(ContentmaterialBatchDeleteMaterialids materialidsItem) {
    this.materialids.add(materialidsItem);
    return this;
  }

   /**
   * Get materialids
   * @return materialids
  **/
  @ApiModelProperty(value = "")
  public List<ContentmaterialBatchDeleteMaterialids> getMaterialids() {
    return materialids;
  }

  public void setMaterialids(List<ContentmaterialBatchDeleteMaterialids> materialids) {
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
    Body4 body4 = (Body4) o;
    return Objects.equals(this.materialids, body4.materialids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(materialids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body4 {\n");
    
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

