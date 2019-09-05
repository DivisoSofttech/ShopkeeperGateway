/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.order.api;

import com.diviso.graeshoppe.client.order.model.AddressDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-05T10:57:27.574354+05:30[Asia/Kolkata]")

@Api(value = "AddressResource", description = "the AddressResource API")
public interface AddressResourceApi {

    @ApiOperation(value = "createAddress", nickname = "createAddressUsingPOST", notes = "", response = AddressDTO.class, tags={ "address-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AddressDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/addresses",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<AddressDTO> createAddressUsingPOST(@ApiParam(value = "addressDTO" ,required=true )  @Valid @RequestBody AddressDTO addressDTO);


    @ApiOperation(value = "deleteAddress", nickname = "deleteAddressUsingDELETE", notes = "", tags={ "address-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/addresses/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteAddressUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAddress", nickname = "getAddressUsingGET", notes = "", response = AddressDTO.class, tags={ "address-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AddressDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/addresses/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<AddressDTO> getAddressUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllAddresses", nickname = "getAllAddressesUsingGET", notes = "", response = AddressDTO.class, responseContainer = "List", tags={ "address-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AddressDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/addresses",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<AddressDTO>> getAllAddressesUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "searchAddresses", nickname = "searchAddressesUsingGET", notes = "", response = AddressDTO.class, responseContainer = "List", tags={ "address-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AddressDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/addresses",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<AddressDTO>> searchAddressesUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateAddress", nickname = "updateAddressUsingPUT", notes = "", response = AddressDTO.class, tags={ "address-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AddressDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/addresses",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<AddressDTO> updateAddressUsingPUT(@ApiParam(value = "addressDTO" ,required=true )  @Valid @RequestBody AddressDTO addressDTO);

}
