package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * ContentMaterialGroupListItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-12T08:55:16.176Z")

public class ContentMaterialGroupListItem   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("count")
  private Long count = null;

  public ContentMaterialGroupListItem id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * 分组ID 
   * @return id
  **/
  @ApiModelProperty(value = "分组ID ")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ContentMaterialGroupListItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 分组名称 
   * @return name
  **/
  @ApiModelProperty(value = "分组名称 ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ContentMaterialGroupListItem count(Long count) {
    this.count = count;
    return this;
  }

   /**
   * 分组内素材数量 
   * @return count
  **/
  @ApiModelProperty(value = "分组内素材数量 ")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentMaterialGroupListItem contentMaterialGroupListItem = (ContentMaterialGroupListItem) o;
    return Objects.equals(this.id, contentMaterialGroupListItem.id) &&
        Objects.equals(this.name, contentMaterialGroupListItem.name) &&
        Objects.equals(this.count, contentMaterialGroupListItem.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentMaterialGroupListItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

