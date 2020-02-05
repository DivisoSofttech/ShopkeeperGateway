/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.shopkeepergateway.client.product.api;

import com.diviso.graeshoppe.shopkeepergateway.client.product.model.UOMDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-05T11:48:18.646+05:30[Asia/Kolkata]")

@Api(value = "UomResource", description = "the UomResource API")
public interface UomResourceApi {

    @ApiOperation(value = "createUOM", nickname = "createUOMUsingPOST", notes = "", response = UOMDTO.class, tags={ "uom-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UOMDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/uoms",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<UOMDTO> createUOMUsingPOST(@ApiParam(value = "uOMDTO" ,required=true )  @Valid @RequestBody UOMDTO UOMDTO);


    @ApiOperation(value = "deleteUOM", nickname = "deleteUOMUsingDELETE", notes = "", tags={ "uom-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/uoms/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteUOMUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllUOMS", nickname = "getAllUOMSUsingGET", notes = "", response = UOMDTO.class, responseContainer = "List", tags={ "uom-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UOMDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/uoms",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<UOMDTO>> getAllUOMSUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getUOM", nickname = "getUOMUsingGET", notes = "", response = UOMDTO.class, tags={ "uom-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UOMDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/uoms/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<UOMDTO> getUOMUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchUOMS", nickname = "searchUOMSUsingGET", notes = "", response = UOMDTO.class, responseContainer = "List", tags={ "uom-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UOMDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/uoms",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<UOMDTO>> searchUOMSUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateUOM", nickname = "updateUOMUsingPUT", notes = "", response = UOMDTO.class, tags={ "uom-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UOMDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/uoms",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<UOMDTO> updateUOMUsingPUT(@ApiParam(value = "uOMDTO" ,required=true )  @Valid @RequestBody UOMDTO UOMDTO);

}
