package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.AuthenticationInputDTO;

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

@Api(value = "authentications", description = "the authentications API")
public interface AuthenticationsApi {

    @ApiOperation(value = "", notes = "Send an authentication.", response = String.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok, returns a Json web token.", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized, if name or/and password are incorrect.", response = String.class),
        @ApiResponse(code = 422, message = "Unprocessable entity, if mandatory fields aren't provided.", response = String.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = String.class) })
    @RequestMapping(value = "/authentications",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<String> authenticationsPost(

@ApiParam(value = "Authentication object that used to authenticate application." ,required=true ) @RequestBody AuthenticationInputDTO authentication

);

}
