package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.ApplicationOutputDTO;
import ch.heigvd.gamification.api.dto.BadgeOutputDTO;
import ch.heigvd.gamification.api.dto.ApplicationInputDTO;
import ch.heigvd.gamification.api.dto.LocationApplication;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-08T22:46:01.300+01:00")

@Api(value = "applications", description = "the applications API")
public interface ApplicationsApi {

    @ApiOperation(value = "", notes = "The Applications endpoint returns information about an application which are available. The response includes the id, the name, the description. This response is a list of applications sorted by the id.", response = ApplicationOutputDTO.class, responseContainer = "List", tags={ "Applications", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK, an array of application.", response = ApplicationOutputDTO.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = ApplicationOutputDTO.class) })
    @RequestMapping(value = "/applications",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ApplicationOutputDTO>> applicationsGet();


    @ApiOperation(value = "", notes = "Returns all the badges of the application having the specified id.", response = BadgeOutputDTO.class, responseContainer = "List", tags={ "Applications", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK Array of badges", response = BadgeOutputDTO.class),
        @ApiResponse(code = 404, message = "Not found, if id provided don't exist.", response = BadgeOutputDTO.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = BadgeOutputDTO.class) })
    @RequestMapping(value = "/applications/{id}/badges",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<BadgeOutputDTO>> applicationsIdBadgesGet(
@ApiParam(value = "The id of the desired application.",required=true ) @PathVariable("id") Long id


);


    @ApiOperation(value = "", notes = "Delete the application which has the specified id.", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content, if success.", response = Void.class),
        @ApiResponse(code = 404, message = "Not found, if id provided don't exist.", response = Void.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = Void.class) })
    @RequestMapping(value = "/applications/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> applicationsIdDelete(
@ApiParam(value = "The id of the desired application.",required=true ) @PathVariable("id") String id


);


    @ApiOperation(value = "", notes = "Returns the application which has the specified id.", response = ApplicationOutputDTO.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ApplicationOutputDTO.class),
        @ApiResponse(code = 404, message = "Not found, if id provided don't exist.", response = ApplicationOutputDTO.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = ApplicationOutputDTO.class) })
    @RequestMapping(value = "/applications/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ApplicationOutputDTO> applicationsIdGet(
@ApiParam(value = "The id of the desired application.",required=true ) @PathVariable("id") String id


);


    @ApiOperation(value = "", notes = "Modify completely the existing application which has the specified id.", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content, if success.", response = Void.class),
        @ApiResponse(code = 404, message = "Not found, if id provided don't exist.", response = Void.class),
        @ApiResponse(code = 422, message = "Unprocessable entity, if mandatory fields aren't provided, if mandatory fields provided are empty or contain only spaces, if name provided contains more than 80 characters, if application name provided already exists.", response = Void.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = Void.class) })
    @RequestMapping(value = "/applications/{id}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> applicationsIdPut(
@ApiParam(value = "The id of the application to modify.",required=true ) @PathVariable("id") String id


,

@ApiParam(value = "Application to be updated" ,required=true ) @RequestBody ApplicationInputDTO application

);


    @ApiOperation(value = "", notes = "Create a new application.", response = LocationApplication.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created, returns the URL to access the new application.", response = LocationApplication.class),
        @ApiResponse(code = 422, message = "Unprocessable entity, if mandatory fields aren't provided, if mandatory fields provided are empty or contain only spaces, if mandatory fields contain more than 80 characters, if application name provided already exists.", response = LocationApplication.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = LocationApplication.class) })
    @RequestMapping(value = "/applications",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LocationApplication> applicationsPost(

@ApiParam(value = "Application object that needs to be added to the database." ,required=true ) @RequestBody ApplicationInputDTO application

);

}
