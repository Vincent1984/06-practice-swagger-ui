package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * Body10
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-12T08:55:16.176Z")

public class Body10   {
  @JsonProperty("base64ImgStr")
  private String base64ImgStr = null;

  public Body10 base64ImgStr(String base64ImgStr) {
    this.base64ImgStr = base64ImgStr;
    return this;
  }

   /**
   * base64图片字符串
   * @return base64ImgStr
  **/
  @ApiModelProperty(value = "base64图片字符串")
  public String getBase64ImgStr() {
    return base64ImgStr;
  }

  public void setBase64ImgStr(String base64ImgStr) {
    this.base64ImgStr = base64ImgStr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body10 body10 = (Body10) o;
    return Objects.equals(this.base64ImgStr, body10.base64ImgStr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base64ImgStr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body10 {\n");
    
    sb.append("    base64ImgStr: ").append(toIndentedString(base64ImgStr)).append("\n");
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

