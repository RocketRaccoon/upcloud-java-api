/*
 * Upcloud api
 * The UpCloud API consists of operations used to control resources on UpCloud. The API is a web service interface. HTTPS is used to connect to the API. The API follows the principles of a RESTful web service wherever possible. The base URL for all API operations is  https://api.upcloud.com/. All API operations require authentication.
 *
 * OpenAPI spec version: 1.2.0
 * 
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.BackupRule;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Storage1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-04T13:00:16.191+03:00")
public class Storage1 {
  @SerializedName("backup_rule")
  private BackupRule backupRule = null;

  @SerializedName("size")
  private BigDecimal size = null;

  @SerializedName("title")
  private String title = null;

  public Storage1 backupRule(BackupRule backupRule) {
    this.backupRule = backupRule;
    return this;
  }

   /**
   * Get backupRule
   * @return backupRule
  **/
  @ApiModelProperty(value = "")
  public BackupRule getBackupRule() {
    return backupRule;
  }

  public void setBackupRule(BackupRule backupRule) {
    this.backupRule = backupRule;
  }

  public Storage1 size(BigDecimal size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * minimum: 10
   * maximum: 1024
   * @return size
  **/
  @ApiModelProperty(example = "10.0", value = "")
  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }

  public Storage1 title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "A larger storage", value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Storage1 storage1 = (Storage1) o;
    return Objects.equals(this.backupRule, storage1.backupRule) &&
        Objects.equals(this.size, storage1.size) &&
        Objects.equals(this.title, storage1.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupRule, size, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Storage1 {\n");
    
    sb.append("    backupRule: ").append(toIndentedString(backupRule)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

