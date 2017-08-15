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
import java.util.UUID;

/**
 * StorageServers
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-15T17:10:04.248+03:00")
public class StorageServers {
  @SerializedName("server")
  private List<UUID> server = null;

  public StorageServers server(List<UUID> server) {
    this.server = server;
    return this;
  }

  public StorageServers addServerItem(UUID serverItem) {
    if (this.server == null) {
      this.server = new ArrayList<UUID>();
    }
    this.server.add(serverItem);
    return this;
  }

   /**
   * Get server
   * @return server
  **/
  @ApiModelProperty(value = "")
  public List<UUID> getServer() {
    return server;
  }

  public void setServer(List<UUID> server) {
    this.server = server;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageServers storageServers = (StorageServers) o;
    return Objects.equals(this.server, storageServers.server);
  }

  @Override
  public int hashCode() {
    return Objects.hash(server);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageServers {\n");
    
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
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

