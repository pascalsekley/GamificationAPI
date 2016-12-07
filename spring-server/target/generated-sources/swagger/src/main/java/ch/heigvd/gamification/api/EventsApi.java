package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.EventInputDTO;
import ch.heigvd.gamification.api.dto.LocationEvent;

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

@Api(value = "events", description = "the events API")
public interface EventsApi {

    @ApiOperation(value = "", notes = "Create a new even in an application.", response = LocationEvent.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created, returns the URL to access the new event.", response = LocationEvent.class),
        @ApiResponse(code = 422, message = "Unprocessable entity, if mandatory fields aren't provided, if mandatory fields provided are empty or contain only spaces, if mandatory fields contain more than 80 characters, if application name provided already exists.", response = LocationEvent.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = LocationEvent.class) })
    @RequestMapping(value = "/events",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LocationEvent> eventsPost(

@ApiParam(value = "Event object that needs to be added to an application in a database." ,required=true ) @RequestBody EventInputDTO event

);

}
