/*
 * Upcloud api
 * The UpCloud API consists of operations used to control resources on UpCloud. The API is a web service interface. HTTPS is used to connect to the API. The API follows the principles of a RESTful web service wherever possible. The base URL for all API operations is  https://api.upcloud.com/. All API operations require authentication.
 *
 * OpenAPI spec version: 1.2.0
 * 
 */


package com.upcloud.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.upcloud.client.models.Storage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SuccessStoragesResponseStorages
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-01T08:08:14.171+03:00")
public class SuccessStoragesResponseStorages {
  @SerializedName("storage")
  private List<Storage> storage = null;

  public SuccessStoragesResponseStorages storage(List<Storage> storage) {
    this.storage = storage;
    return this;
  }

  public SuccessStoragesResponseStorages addStorageItem(Storage storageItem) {
    if (this.storage == null) {
      this.storage = new ArrayList<Storage>();
    }
    this.storage.add(storageItem);
    return this;
  }

   /**
   * Get storage
   * @return storage
  **/
  @ApiModelProperty(value = "")
  public List<Storage> getStorage() {
    return storage;
  }

  public void setStorage(List<Storage> storage) {
    this.storage = storage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessStoragesResponseStorages successStoragesResponseStorages = (SuccessStoragesResponseStorages) o;
    return Objects.equals(this.storage, successStoragesResponseStorages.storage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessStoragesResponseStorages {\n");
    
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
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

