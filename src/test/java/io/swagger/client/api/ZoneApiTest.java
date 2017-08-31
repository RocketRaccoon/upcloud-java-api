/*
 * Upcloud api
 * The UpCloud API consists of operations used to control resources on UpCloud. The API is a web service interface. HTTPS is used to connect to the API. The API follows the principles of a RESTful web service wherever possible. The base URL for all API operations is  https://api.upcloud.com/. All API operations require authentication.
 *
 * OpenAPI spec version: 1.2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.InlineResponse2001;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ZoneApi
 */
@Ignore
public class ZoneApiTest {

    private final ZoneApi api = new ZoneApi();

    
    /**
     * List available zones
     *
     * Returns a list of available zones.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void zoneGetTest() throws ApiException {
        InlineResponse2001 response = api.zoneGet();

        // TODO: test validations
    }
    
}