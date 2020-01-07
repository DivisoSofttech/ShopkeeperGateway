/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.shopkeepergateway.client.customer.api;

import com.diviso.graeshoppe.shopkeepergateway.client.customer.model.FavouriteProductDTO;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-02T10:52:40.897+05:30[Asia/Kolkata]")

@Api(value = "FavouriteProductResource", description = "the FavouriteProductResource API")
public interface FavouriteProductResourceApi {

    @ApiOperation(value = "createFavouriteProduct", nickname = "createFavouriteProductUsingPOST", notes = "", response = FavouriteProductDTO.class, tags={ "favourite-product-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FavouriteProductDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/favourite-products",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<FavouriteProductDTO> createFavouriteProductUsingPOST(@ApiParam(value = "favouriteProductDTO" ,required=true )  @Valid @RequestBody FavouriteProductDTO favouriteProductDTO);


    @ApiOperation(value = "deleteFavouriteProduct", nickname = "deleteFavouriteProductUsingDELETE", notes = "", tags={ "favourite-product-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/favourite-products/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteFavouriteProductUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllFavouriteProducts", nickname = "getAllFavouriteProductsUsingGET", notes = "", response = FavouriteProductDTO.class, responseContainer = "List", tags={ "favourite-product-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FavouriteProductDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/favourite-products",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<FavouriteProductDTO>> getAllFavouriteProductsUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getFavouriteProduct", nickname = "getFavouriteProductUsingGET", notes = "", response = FavouriteProductDTO.class, tags={ "favourite-product-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FavouriteProductDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/favourite-products/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<FavouriteProductDTO> getFavouriteProductUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchFavouriteProducts", nickname = "searchFavouriteProductsUsingGET", notes = "", response = FavouriteProductDTO.class, responseContainer = "List", tags={ "favourite-product-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FavouriteProductDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/favourite-products",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<FavouriteProductDTO>> searchFavouriteProductsUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateFavouriteProduct", nickname = "updateFavouriteProductUsingPUT", notes = "", response = FavouriteProductDTO.class, tags={ "favourite-product-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FavouriteProductDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/favourite-products",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<FavouriteProductDTO> updateFavouriteProductUsingPUT(@ApiParam(value = "favouriteProductDTO" ,required=true )  @Valid @RequestBody FavouriteProductDTO favouriteProductDTO);

}