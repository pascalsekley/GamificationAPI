package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.BadgeOutputDTO;
import ch.heigvd.gamification.api.dto.BadgeInputDTO;
import ch.heigvd.gamification.api.dto.LocationBadge;

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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-30T20:15:04.390+01:00")

@Api(value = "badges", description = "the badges API")
public interface BadgesApi {

    @ApiOperation(value = "", notes = "The Badges endpoint returns information about badges which are available. The response includes the id, the name, the description, and the image of each badge. This response is a list of badge sorted by the id.", response = BadgeOutputDTO.class, responseContainer = "List", tags={ "Badges", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK, an array of badges.", response = BadgeOutputDTO.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = BadgeOutputDTO.class) })
    @RequestMapping(value = "/badges",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<BadgeOutputDTO>> badgesGet();


    @ApiOperation(value = "", notes = "Delete the badge which has the specified id.", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content, if success.", response = Void.class),
        @ApiResponse(code = 404, message = "Not found, if id provided don't exist.", response = Void.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = Void.class) })
    @RequestMapping(value = "/badges/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> badgesIdDelete(
@ApiParam(value = "The id of the desired badge.",required=true ) @PathVariable("id") String id


);


    @ApiOperation(value = "", notes = "Returns the badge which has the specified id.", response = BadgeOutputDTO.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = BadgeOutputDTO.class),
        @ApiResponse(code = 404, message = "Not found, if id provided don't exist.", response = BadgeOutputDTO.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = BadgeOutputDTO.class) })
    @RequestMapping(value = "/badges/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<BadgeOutputDTO> badgesIdGet(
@ApiParam(value = "The id of the desired badge.",required=true ) @PathVariable("id") String id


);


    @ApiOperation(value = "", notes = "Modify completely the existing badge which has the specified id.", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content, if success.", response = Void.class),
        @ApiResponse(code = 404, message = "Not found, if id provided don't exist.", response = Void.class),
        @ApiResponse(code = 422, message = "Unprocessable entity, if mandatory fields aren't provided, if mandatory fields provided are empty or contain only spaces, if name provided contains more than 80 characters, if description or imageUrl provided contain more than 255 characters, if badge name provided already exists.", response = Void.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = Void.class) })
    @RequestMapping(value = "/badges/{id}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> badgesIdPut(
@ApiParam(value = "The id of the badge to modify.",required=true ) @PathVariable("id") String id


,

@ApiParam(value = "Badge to be updated" ,required=true ) @RequestBody BadgeInputDTO badge

);


    @ApiOperation(value = "", notes = "Create a new badge.", response = LocationBadge.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created, returns the URL to access the new badge.", response = LocationBadge.class),
        @ApiResponse(code = 422, message = "Unprocessable entity, if mandatory fields aren't provided, if mandatory fields provided are empty or contain only spaces, if name provided contains more than 80 characters, if description or imageUrl provided contain more than 255 characters, if badge name provided already exists.", response = LocationBadge.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = LocationBadge.class) })
    @RequestMapping(value = "/badges",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LocationBadge> badgesPost(

@ApiParam(value = "Badge object that needs to be added to the database." ,required=true ) @RequestBody BadgeInputDTO badge

);

}
