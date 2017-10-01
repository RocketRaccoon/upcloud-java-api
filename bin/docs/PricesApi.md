# PricesApi

All URIs are relative to *http://api.upcloud.com/1.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listPrices**](PricesApi.md#listPrices) | **GET** /price | List prices


<a name="listPrices"></a>
# **listPrices**
> PriceListResponse listPrices()

List prices

Returns a list resource prices.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiException;
//import com.upcloud.client.api.PricesApi;


PricesApi apiInstance = new PricesApi();
try {
    PriceListResponse result = apiInstance.listPrices();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PricesApi#listPrices");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PriceListResponse**](PriceListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
