/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.customer.api;

import com.diviso.graeshoppe.client.customer.model.NoteDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-19T21:21:08.464+05:30[Asia/Kolkata]")

@Api(value = "NoteResource", description = "the NoteResource API")
public interface NoteResourceApi {

    @ApiOperation(value = "createNote", nickname = "createNoteUsingPOST", notes = "", response = NoteDTO.class, tags={ "note-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = NoteDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/notes",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<NoteDTO> createNoteUsingPOST(@ApiParam(value = "noteDTO" ,required=true )  @Valid @RequestBody NoteDTO noteDTO);


    @ApiOperation(value = "deleteNote", nickname = "deleteNoteUsingDELETE", notes = "", tags={ "note-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/notes/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteNoteUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllNotes", nickname = "getAllNotesUsingGET", notes = "", response = NoteDTO.class, responseContainer = "List", tags={ "note-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = NoteDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/notes",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<NoteDTO>> getAllNotesUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getNote", nickname = "getNoteUsingGET", notes = "", response = NoteDTO.class, tags={ "note-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = NoteDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/notes/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<NoteDTO> getNoteUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchNotes", nickname = "searchNotesUsingGET", notes = "", response = NoteDTO.class, responseContainer = "List", tags={ "note-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = NoteDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/notes",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<NoteDTO>> searchNotesUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateNote", nickname = "updateNoteUsingPUT", notes = "", response = NoteDTO.class, tags={ "note-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = NoteDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/notes",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<NoteDTO> updateNoteUsingPUT(@ApiParam(value = "noteDTO" ,required=true )  @Valid @RequestBody NoteDTO noteDTO);

}
