package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.RegistrationOutputDTO;
import ch.heigvd.gamification.api.dto.RegistrationInputDTO;
import ch.heigvd.gamification.api.dto.LocationRegistration;

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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-19T20:02:53.332+01:00")

@Api(value = "registrations", description = "the registrations API")
public interface RegistrationsApi {

    @ApiOperation(value = "", notes = "The Registrations endpoint returns information about registrations which are saved. The response includes the application id, the application name, the application description. This response is a list of registration sorted by the id.", response = RegistrationOutputDTO.class, responseContainer = "List", tags={ "Registrations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK, an array of registrations.", response = RegistrationOutputDTO.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = RegistrationOutputDTO.class) })
    @RequestMapping(value = "/registrations",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<RegistrationOutputDTO>> registrationsGet();


    @ApiOperation(value = "", notes = "Delete the registration which has the specified id.", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content, if success.", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden, if id provided doesn't equal to the id in the Json Web Token.", response = Void.class),
        @ApiResponse(code = 404, message = "Not found, if id provided don't exist.", response = Void.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = Void.class) })
    @RequestMapping(value = "/registrations/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> registrationsIdDelete(
@ApiParam(value = "The id of the desired registration.",required=true ) @PathVariable("id") Long id


,
@ApiParam(value = "Token used to authenticate the client application. Token must be preceded by \"Bearer \" pattern." ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization


);


    @ApiOperation(value = "", notes = "Returns the registration which has the specified id.", response = RegistrationOutputDTO.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK, the desired registration.", response = RegistrationOutputDTO.class),
        @ApiResponse(code = 404, message = "Not found, if id provided don't exist.", response = RegistrationOutputDTO.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = RegistrationOutputDTO.class) })
    @RequestMapping(value = "/registrations/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<RegistrationOutputDTO> registrationsIdGet(
@ApiParam(value = "The id of the desired registration.",required=true ) @PathVariable("id") Long id


);


    @ApiOperation(value = "", notes = "Modify completely the existing registration which has the specified id.", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content, if success.", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden, if id provided doesn't equal to the id in the Json Web Token.", response = Void.class),
        @ApiResponse(code = 404, message = "Not found, if id provided don't exist.", response = Void.class),
        @ApiResponse(code = 422, message = "Unprocessable entity, if mandatory fields aren't provided, if mandatory fields provided are empty or contain only spaces, if name or password fields contain more than 80 characters, if description field contain more than 255 characters, if password contains less than 7 characters, if application name provided already exists.", response = Void.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = Void.class) })
    @RequestMapping(value = "/registrations/{id}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> registrationsIdPut(
@ApiParam(value = "The id of the registration to modify.",required=true ) @PathVariable("id") Long id


,
@ApiParam(value = "Token used to authenticate the client application. Token must be preceded by \"Bearer \" pattern." ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization


,

@ApiParam(value = "Registration to be updated" ,required=true ) @RequestBody RegistrationInputDTO registration

);


    @ApiOperation(value = "", notes = "Create a new registration.", response = LocationRegistration.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created, returns the URL to access the new registration.", response = LocationRegistration.class),
        @ApiResponse(code = 422, message = "Unprocessable entity, if mandatory fields aren't provided, if mandatory fields provided are empty or contain only spaces, if name or password fields contain more than 80 characters, if description field contain more than 255 characters, if password contains less than 7 characters, if application name provided already exists.", response = LocationRegistration.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = LocationRegistration.class) })
    @RequestMapping(value = "/registrations",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LocationRegistration> registrationsPost(

@ApiParam(value = "Registration object that needs to be added to the database." ,required=true ) @RequestBody RegistrationInputDTO registration

);

}
