package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.PointScaleGet;
import ch.heigvd.gamification.api.dto.PointScalePost;

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

@Api(value = "pointScale", description = "the pointScale API")
public interface PointScaleApi {

    @ApiOperation(value = "", notes = "Delete the point scale which has the specified id.", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content, if success.", response = Void.class),
        @ApiResponse(code = 404, message = "Not found, if id provided don't exist.", response = Void.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = Void.class) })
    @RequestMapping(value = "/pointScale/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> pointScaleIdDelete(
@ApiParam(value = "The id of the desired point scale.",required=true ) @PathVariable("id") String id


);


    @ApiOperation(value = "", notes = "Returns the point scale which has the specified id.", response = PointScaleGet.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PointScaleGet.class),
        @ApiResponse(code = 404, message = "Not found, if id provided don't exist.", response = PointScaleGet.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = PointScaleGet.class) })
    @RequestMapping(value = "/pointScale/{id}",
        method = RequestMethod.GET)
    ResponseEntity<PointScaleGet> pointScaleIdGet(
@ApiParam(value = "The id of the desired point scale.",required=true ) @PathVariable("id") String id


);


    @ApiOperation(value = "", notes = "Update partially or completely an existing point scale which has the specified id.", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content", response = Void.class),
        @ApiResponse(code = 404, message = "Not found, if id provided don't exist.", response = Void.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = Void.class) })
    @RequestMapping(value = "/pointScale/{id}",
        method = RequestMethod.PATCH)
    ResponseEntity<Void> pointScaleIdPatch(
@ApiParam(value = "The id of the point scale to update.",required=true ) @PathVariable("id") String id


);


    @ApiOperation(value = "", notes = "Modify completely the existing point scale which has the specified id.", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content, if success.", response = Void.class),
        @ApiResponse(code = 404, message = "Not found, if id provided don't exist.", response = Void.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = Void.class) })
    @RequestMapping(value = "/pointScale/{id}",
        method = RequestMethod.PUT)
    ResponseEntity<Void> pointScaleIdPut(
@ApiParam(value = "The id of the point scale to modify.",required=true ) @PathVariable("id") String id


);

}
