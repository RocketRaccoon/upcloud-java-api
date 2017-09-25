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
import com.upcloud.client.models.IpAddressListResponseIpAddresses;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IpAddressListResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-25T14:18:27.065+03:00")
public class IpAddressListResponse {
  @SerializedName("ip_addresses")
  private IpAddressListResponseIpAddresses ipAddresses = null;

  public IpAddressListResponse ipAddresses(IpAddressListResponseIpAddresses ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

   /**
   * Get ipAddresses
   * @return ipAddresses
  **/
  @ApiModelProperty(value = "")
  public IpAddressListResponseIpAddresses getIpAddresses() {
    return ipAddresses;
  }

  public void setIpAddresses(IpAddressListResponseIpAddresses ipAddresses) {
    this.ipAddresses = ipAddresses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpAddressListResponse ipAddressListResponse = (IpAddressListResponse) o;
    return Objects.equals(this.ipAddresses, ipAddressListResponse.ipAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddresses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpAddressListResponse {\n");
    
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
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

