/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.customer.api;

import com.diviso.graeshoppe.client.customer.model.Customer;
import com.diviso.graeshoppe.client.customer.model.CustomerDTO;
import com.diviso.graeshoppe.client.customer.model.OTPChallenge;
import com.diviso.graeshoppe.client.customer.model.OTPResponse;
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

@Api(value = "CustomerResource", description = "the CustomerResource API")
public interface CustomerResourceApi {

    @ApiOperation(value = "checkUserExists", nickname = "checkUserExistsUsingGET", notes = "", response = Boolean.class, tags={ "customer-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Boolean.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/checkUserExists/{reference}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<Boolean> checkUserExistsUsingGET(@ApiParam(value = "reference",required=true) @PathVariable("reference") String reference);


    @ApiOperation(value = "createCustomer", nickname = "createCustomerUsingPOST", notes = "", response = CustomerDTO.class, tags={ "customer-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CustomerDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/customers",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<CustomerDTO> createCustomerUsingPOST(@ApiParam(value = "customerDTO" ,required=true )  @Valid @RequestBody CustomerDTO customerDTO);


    @ApiOperation(value = "deleteCustomer", nickname = "deleteCustomerUsingDELETE", notes = "", tags={ "customer-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/customers/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteCustomerUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "findByMobileNumber", nickname = "findByMobileNumberUsingGET", notes = "", response = CustomerDTO.class, tags={ "customer-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CustomerDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/findByMobileNumber/{mobileNumber}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<CustomerDTO> findByMobileNumberUsingGET(@ApiParam(value = "mobileNumber",required=true) @PathVariable("mobileNumber") Long mobileNumber);


    @ApiOperation(value = "findByReference", nickname = "findByReferenceUsingGET", notes = "", response = Customer.class, tags={ "customer-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Customer.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/findByReference/{reference}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<Customer> findByReferenceUsingGET(@ApiParam(value = "reference",required=true) @PathVariable("reference") String reference);


    @ApiOperation(value = "getAllCustomers", nickname = "getAllCustomersUsingGET", notes = "", response = CustomerDTO.class, responseContainer = "List", tags={ "customer-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CustomerDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/customers",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<CustomerDTO>> getAllCustomersUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getCustomer", nickname = "getCustomerUsingGET", notes = "", response = CustomerDTO.class, tags={ "customer-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CustomerDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/customers/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<CustomerDTO> getCustomerUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getPdfAllCustomers", nickname = "getPdfAllCustomersUsingGET", notes = "", response = byte[].class, tags={ "customer-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = byte[].class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/pdf/customerReport",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<byte[]> getPdfAllCustomersUsingGET();


    @ApiOperation(value = "modelToDto", nickname = "modelToDtoUsingPOST", notes = "", response = CustomerDTO.class, tags={ "customer-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CustomerDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/customer/modelToDto",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<CustomerDTO> modelToDtoUsingPOST(@ApiParam(value = "customer" ,required=true )  @Valid @RequestBody Customer customer);


    @ApiOperation(value = "searchCustomers", nickname = "searchCustomersUsingGET", notes = "", response = CustomerDTO.class, responseContainer = "List", tags={ "customer-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CustomerDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/customers",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<CustomerDTO>> searchCustomersUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "sendSMS", nickname = "sendSMSUsingPOST", notes = "", response = OTPResponse.class, tags={ "customer-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OTPResponse.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/customer/otp_send",
        produces = "*/*", 
        method = RequestMethod.POST)
    ResponseEntity<OTPResponse> sendSMSUsingPOST(@NotNull @ApiParam(value = "numbers", required = true) @Valid @RequestParam(value = "numbers", required = true) Long numbers);


    @ApiOperation(value = "sendSMS", nickname = "sendSMSUsingPOST1", notes = "", response = CustomerDTO.class, tags={ "customer-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CustomerDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/customer/sendSMS",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<CustomerDTO> sendSMSUsingPOST1(@ApiParam(value = "customer" ,required=true )  @Valid @RequestBody Customer customer);


    @ApiOperation(value = "updateCustomer", nickname = "updateCustomerUsingPUT", notes = "", response = CustomerDTO.class, tags={ "customer-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CustomerDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/customers",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<CustomerDTO> updateCustomerUsingPUT(@ApiParam(value = "customerDTO" ,required=true )  @Valid @RequestBody CustomerDTO customerDTO);


    @ApiOperation(value = "verifyOTP", nickname = "verifyOTPUsingPOST", notes = "", response = OTPChallenge.class, tags={ "customer-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OTPChallenge.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/customer/otp_challenge",
        produces = "*/*", 
        method = RequestMethod.POST)
    ResponseEntity<OTPChallenge> verifyOTPUsingPOST(@NotNull @ApiParam(value = "code", required = true) @Valid @RequestParam(value = "code", required = true) String code,@NotNull @ApiParam(value = "numbers", required = true) @Valid @RequestParam(value = "numbers", required = true) Long numbers);

}
