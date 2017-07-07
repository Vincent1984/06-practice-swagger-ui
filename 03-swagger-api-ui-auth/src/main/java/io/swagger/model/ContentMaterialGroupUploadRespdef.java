package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * ContentMaterialGroupUploadRespdef
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-12T08:55:16.176Z")

public class ContentMaterialGroupUploadRespdef   {
  @JsonProperty("url")
  private String url = null;

  @JsonProperty("file_name")
  private String fileName = null;

  public ContentMaterialGroupUploadRespdef url(String url) {
    this.url = url;
    return this;
  }

   /**
   *  素材链接
   * @return url
  **/
  @ApiModelProperty(value = " 素材链接")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ContentMaterialGroupUploadRespdef fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   *  名称
   * @return fileName
  **/
  @ApiModelProperty(value = " 名称")
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
    ContentMaterialGroupUploadRespdef contentMaterialGroupUploadRespdef = (ContentMaterialGroupUploadRespdef) o;
    return Objects.equals(this.url, contentMaterialGroupUploadRespdef.url) &&
        Objects.equals(this.fileName, contentMaterialGroupUploadRespdef.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, fileName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentMaterialGroupUploadRespdef {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

