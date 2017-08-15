/*
 * Upcloud api
 * Upcloud api specification
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * StorageBackups
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-15T17:10:04.248+03:00")
public class StorageBackups {
  @SerializedName("backup")
  private List<String> backup = null;

  public StorageBackups backup(List<String> backup) {
    this.backup = backup;
    return this;
  }

  public StorageBackups addBackupItem(String backupItem) {
    if (this.backup == null) {
      this.backup = new ArrayList<String>();
    }
    this.backup.add(backupItem);
    return this;
  }

   /**
   * Get backup
   * @return backup
  **/
  @ApiModelProperty(value = "")
  public List<String> getBackup() {
    return backup;
  }

  public void setBackup(List<String> backup) {
    this.backup = backup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageBackups storageBackups = (StorageBackups) o;
    return Objects.equals(this.backup, storageBackups.backup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageBackups {\n");
    
    sb.append("    backup: ").append(toIndentedString(backup)).append("\n");
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

