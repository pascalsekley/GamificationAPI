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

@Api(value = "pointScales", description = "the pointScales API")
public interface PointScalesApi {

    @ApiOperation(value = "", notes = "The PointScales endpoint returns information about point scales which are available. The response includes the id, the name, the description, and the coefficient of each point scale. This response is a list of point scale sorted by the id.", response = PointScaleGet.class, responseContainer = "List", tags={ "PointScale", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK, an array of point scale.", response = PointScaleGet.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = PointScaleGet.class) })
    @RequestMapping(value = "/pointScales",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<PointScaleGet>> pointScalesGet();


    @ApiOperation(value = "", notes = "Create a new point scale.", response = PointScalePost.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created, returns the URL to access the new point scale.", response = PointScalePost.class),
        @ApiResponse(code = 422, message = "Unprocessable entity, if mandatory fields aren't provided, if mandatory fields don't contain at least 1 character, if mandatory fields contain more than 45 characters, if point scale name provided already exists.", response = PointScalePost.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = PointScalePost.class) })
    @RequestMapping(value = "/pointScales",
        method = RequestMethod.POST)
    ResponseEntity<PointScalePost> pointScalesPost();

}
