/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.shopkeepergateway.client.product.api;

import com.diviso.graeshoppe.shopkeepergateway.client.product.model.ComboLineItem;
import com.diviso.graeshoppe.shopkeepergateway.client.product.model.ComboLineItemDTO;
import java.util.List;
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

@Api(value = "ComboLineItemResource", description = "the ComboLineItemResource API")
public interface ComboLineItemResourceApi {

    @ApiOperation(value = "createComboLineItem", nickname = "createComboLineItemUsingPOST", notes = "", response = ComboLineItemDTO.class, tags={ "combo-line-item-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ComboLineItemDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/combo-line-items",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<ComboLineItemDTO> createComboLineItemUsingPOST(@ApiParam(value = "comboLineItemDTO" ,required=true )  @Valid @RequestBody ComboLineItemDTO comboLineItemDTO);


    @ApiOperation(value = "deleteComboLineItem", nickname = "deleteComboLineItemUsingDELETE", notes = "", tags={ "combo-line-item-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/combo-line-items/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteComboLineItemUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllComboLineItems", nickname = "getAllComboLineItemsUsingGET", notes = "", response = ComboLineItemDTO.class, responseContainer = "List", tags={ "combo-line-item-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ComboLineItemDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/combo-line-items",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<ComboLineItemDTO>> getAllComboLineItemsUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getComboLineItem", nickname = "getComboLineItemUsingGET", notes = "", response = ComboLineItemDTO.class, tags={ "combo-line-item-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ComboLineItemDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/combo-line-items/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<ComboLineItemDTO> getComboLineItemUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "listToDto", nickname = "listToDtoUsingPOST1", notes = "", response = ComboLineItemDTO.class, responseContainer = "List", tags={ "combo-line-item-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ComboLineItemDTO.class, responseContainer = "List"),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/combo-line-items/toDto",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<List<ComboLineItemDTO>> listToDtoUsingPOST1(@ApiParam(value = "comboLineItem" ,required=true )  @Valid @RequestBody List<ComboLineItem> comboLineItem);


    @ApiOperation(value = "searchComboLineItems", nickname = "searchComboLineItemsUsingGET", notes = "", response = ComboLineItemDTO.class, responseContainer = "List", tags={ "combo-line-item-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ComboLineItemDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/combo-line-items",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<ComboLineItemDTO>> searchComboLineItemsUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateComboLineItem", nickname = "updateComboLineItemUsingPUT", notes = "", response = ComboLineItemDTO.class, tags={ "combo-line-item-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ComboLineItemDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/combo-line-items",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<ComboLineItemDTO> updateComboLineItemUsingPUT(@ApiParam(value = "comboLineItemDTO" ,required=true )  @Valid @RequestBody ComboLineItemDTO comboLineItemDTO);

}
