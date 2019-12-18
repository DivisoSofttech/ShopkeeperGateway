/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.customer.api;

import com.diviso.graeshoppe.client.customer.model.UniqueCustomerIDDTO;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-02T14:03:38.434+05:30[Asia/Calcutta]")

@Api(value = "UniqueCustomerIdResource", description = "the UniqueCustomerIdResource API")
public interface UniqueCustomerIdResourceApi {

    @ApiOperation(value = "createUniqueCustomerID", nickname = "createUniqueCustomerIDUsingPOST", notes = "", response = UniqueCustomerIDDTO.class, tags={ "unique-customer-id-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UniqueCustomerIDDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/unique-customer-ids",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<UniqueCustomerIDDTO> createUniqueCustomerIDUsingPOST(@ApiParam(value = "uniqueCustomerIDDTO" ,required=true )  @Valid @RequestBody UniqueCustomerIDDTO uniqueCustomerIDDTO);


    @ApiOperation(value = "deleteUniqueCustomerID", nickname = "deleteUniqueCustomerIDUsingDELETE", notes = "", tags={ "unique-customer-id-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/unique-customer-ids/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteUniqueCustomerIDUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllUniqueCustomerIDS", nickname = "getAllUniqueCustomerIDSUsingGET", notes = "", response = UniqueCustomerIDDTO.class, responseContainer = "List", tags={ "unique-customer-id-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UniqueCustomerIDDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/unique-customer-ids",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<UniqueCustomerIDDTO>> getAllUniqueCustomerIDSUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getUniqueCustomerID", nickname = "getUniqueCustomerIDUsingGET", notes = "", response = UniqueCustomerIDDTO.class, tags={ "unique-customer-id-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UniqueCustomerIDDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/unique-customer-ids/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<UniqueCustomerIDDTO> getUniqueCustomerIDUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchUniqueCustomerIDS", nickname = "searchUniqueCustomerIDSUsingGET", notes = "", response = UniqueCustomerIDDTO.class, responseContainer = "List", tags={ "unique-customer-id-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UniqueCustomerIDDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/unique-customer-ids",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<UniqueCustomerIDDTO>> searchUniqueCustomerIDSUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateUniqueCustomerID", nickname = "updateUniqueCustomerIDUsingPUT", notes = "", response = UniqueCustomerIDDTO.class, tags={ "unique-customer-id-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UniqueCustomerIDDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/unique-customer-ids",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<UniqueCustomerIDDTO> updateUniqueCustomerIDUsingPUT(@ApiParam(value = "uniqueCustomerIDDTO" ,required=true )  @Valid @RequestBody UniqueCustomerIDDTO uniqueCustomerIDDTO);

}
