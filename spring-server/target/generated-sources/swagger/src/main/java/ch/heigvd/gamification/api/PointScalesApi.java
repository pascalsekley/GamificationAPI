package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.PointScaleOutputDTO;
import ch.heigvd.gamification.api.dto.PointScaleInputDTO;
import ch.heigvd.gamification.api.dto.LocationPointScale;

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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-05T20:36:58.390+01:00")

@Api(value = "pointScales", description = "the pointScales API")
public interface PointScalesApi {

    @ApiOperation(value = "", notes = "The PointScales endpoint returns information about point scales which are available. The response includes the id, the name, the description, and the coefficient of each point scale. This response is a list of point scale sorted by the id.", response = PointScaleOutputDTO.class, responseContainer = "List", tags={ "PointScales", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK, an array of point scales.", response = PointScaleOutputDTO.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = PointScaleOutputDTO.class) })
    @RequestMapping(value = "/pointScales",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<PointScaleOutputDTO>> pointScalesGet();


    @ApiOperation(value = "", notes = "Delete the point scale which has the specified id.", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content, if success.", response = Void.class),
        @ApiResponse(code = 404, message = "Not found, if id provided don't exist.", response = Void.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = Void.class) })
    @RequestMapping(value = "/pointScales/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> pointScalesIdDelete(
@ApiParam(value = "The id of the desired point scale.",required=true ) @PathVariable("id") String id


);


    @ApiOperation(value = "", notes = "Returns the point scale which has the specified id.", response = PointScaleOutputDTO.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PointScaleOutputDTO.class),
        @ApiResponse(code = 404, message = "Not found, if id provided don't exist.", response = PointScaleOutputDTO.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = PointScaleOutputDTO.class) })
    @RequestMapping(value = "/pointScales/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<PointScaleOutputDTO> pointScalesIdGet(
@ApiParam(value = "The id of the desired point scale.",required=true ) @PathVariable("id") String id


);


    @ApiOperation(value = "", notes = "Modify completely the existing point scale which has the specified id.", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content, if success.", response = Void.class),
        @ApiResponse(code = 404, message = "Not found, if id provided don't exist.", response = Void.class),
        @ApiResponse(code = 422, message = "Unprocessable entity, if mandatory fields aren't provided, if mandatory fields provided are empty or contain only spaces, if name provided contains more than 80 characters, if pointScale name provided already exists.", response = Void.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = Void.class) })
    @RequestMapping(value = "/pointScales/{id}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> pointScalesIdPut(
@ApiParam(value = "The id of the point scale to modify.",required=true ) @PathVariable("id") String id


,

@ApiParam(value = "PointScale to be updated" ,required=true ) @RequestBody PointScaleInputDTO pointScale

);


    @ApiOperation(value = "", notes = "Create a new point scale.", response = LocationPointScale.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created, returns the URL to access the new point scale.", response = LocationPointScale.class),
        @ApiResponse(code = 422, message = "Unprocessable entity, if mandatory fields aren't provided, if mandatory fields provided are empty or contain only spaces, if mandatory fields contain more than 80 characters, if point scale name provided already exists.", response = LocationPointScale.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = LocationPointScale.class) })
    @RequestMapping(value = "/pointScales",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LocationPointScale> pointScalesPost(

@ApiParam(value = "PointScale object that needs to be added to the database." ,required=true ) @RequestBody PointScaleInputDTO badge

);

}
