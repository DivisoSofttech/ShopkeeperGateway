/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.shopkeepergateway.client.product.api;

import com.diviso.graeshoppe.shopkeepergateway.client.product.model.DiscountDTO;
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

@Api(value = "DiscountResource", description = "the DiscountResource API")
public interface DiscountResourceApi {

    @ApiOperation(value = "createDiscount", nickname = "createDiscountUsingPOST", notes = "", response = DiscountDTO.class, tags={ "discount-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DiscountDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/discounts",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<DiscountDTO> createDiscountUsingPOST(@ApiParam(value = "discountDTO" ,required=true )  @Valid @RequestBody DiscountDTO discountDTO);


    @ApiOperation(value = "deleteDiscount", nickname = "deleteDiscountUsingDELETE", notes = "", tags={ "discount-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/discounts/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteDiscountUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllDiscounts", nickname = "getAllDiscountsUsingGET", notes = "", response = DiscountDTO.class, responseContainer = "List", tags={ "discount-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DiscountDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/discounts",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<DiscountDTO>> getAllDiscountsUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getDiscount", nickname = "getDiscountUsingGET", notes = "", response = DiscountDTO.class, tags={ "discount-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DiscountDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/discounts/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<DiscountDTO> getDiscountUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchDiscounts", nickname = "searchDiscountsUsingGET", notes = "", response = DiscountDTO.class, responseContainer = "List", tags={ "discount-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DiscountDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/discounts",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<DiscountDTO>> searchDiscountsUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateDiscount", nickname = "updateDiscountUsingPUT", notes = "", response = DiscountDTO.class, tags={ "discount-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DiscountDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/discounts",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<DiscountDTO> updateDiscountUsingPUT(@ApiParam(value = "discountDTO" ,required=true )  @Valid @RequestBody DiscountDTO discountDTO);

}
