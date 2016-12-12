package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.UserOutputDTO;

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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-11T14:36:18.324+01:00")

@Api(value = "users", description = "the users API")
public interface UsersApi {

    @ApiOperation(value = "", notes = "The Applications endpoint returns information about an users which are available.", response = UserOutputDTO.class, responseContainer = "List", tags={ "Applications", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK, an array of users.", response = UserOutputDTO.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = UserOutputDTO.class) })
    @RequestMapping(value = "/users",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<UserOutputDTO>> usersGet();

}
