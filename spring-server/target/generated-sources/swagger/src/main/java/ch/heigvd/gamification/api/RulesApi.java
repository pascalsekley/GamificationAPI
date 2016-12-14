package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.RuleOutputDTO;
import ch.heigvd.gamification.api.dto.RuleInputDTO;
import ch.heigvd.gamification.api.dto.LocationRule;

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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-14T14:38:31.463+01:00")

@Api(value = "rules", description = "the rules API")
public interface RulesApi {

    @ApiOperation(value = "", notes = "The rules of the gamification platform", response = RuleOutputDTO.class, responseContainer = "List", tags={ "Rules", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK, an array of rules.", response = RuleOutputDTO.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = RuleOutputDTO.class) })
    @RequestMapping(value = "/rules",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<RuleOutputDTO>> rulesGet();


    @ApiOperation(value = "", notes = "Delete the rule which has the specified id.", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content, if success.", response = Void.class),
        @ApiResponse(code = 404, message = "Not found, if id provided don't exist.", response = Void.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = Void.class) })
    @RequestMapping(value = "/rules/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> rulesIdDelete(
@ApiParam(value = "The id of the desired rule.",required=true ) @PathVariable("id") Long id


);


    @ApiOperation(value = "", notes = "Returns the rule which has the specified id.", response = RuleOutputDTO.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RuleOutputDTO.class),
        @ApiResponse(code = 404, message = "Not found, if id provided don't exist.", response = RuleOutputDTO.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = RuleOutputDTO.class) })
    @RequestMapping(value = "/rules/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<RuleOutputDTO> rulesIdGet(
@ApiParam(value = "The id of the desired rule.",required=true ) @PathVariable("id") Long id


);


    @ApiOperation(value = "", notes = "Modify completely the existing rule which has the specified id.", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content, if success.", response = Void.class),
        @ApiResponse(code = 404, message = "Not found, if id provided don't exist.", response = Void.class),
        @ApiResponse(code = 422, message = "Unprocessable entity, if mandatory fields aren't provided, if mandatory fields provided are empty or contain only spaces, if name provided contains more than 80 characters, if description or imageUrl provided contain more than 255 characters, if rule name provided already exists.", response = Void.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = Void.class) })
    @RequestMapping(value = "/rules/{id}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> rulesIdPut(
@ApiParam(value = "The id of the rule to modify.",required=true ) @PathVariable("id") Long id


,

@ApiParam(value = "rule to be updated" ,required=true ) @RequestBody RuleInputDTO rule

);


    @ApiOperation(value = "", notes = "Create a new rule.", response = LocationRule.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created, returns the URL to access the new rule.", response = LocationRule.class),
        @ApiResponse(code = 422, message = "Unprocessable entity, if mandatory fields aren't provided, if mandatory fields provided are empty or contain only spaces, if name provided contains more than 80 characters, if description or imageUrl provided contain more than 255 characters, if rule name provided already exists.", response = LocationRule.class),
        @ApiResponse(code = 500, message = "If database isn't reachable.", response = LocationRule.class) })
    @RequestMapping(value = "/rules",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LocationRule> rulesPost(

@ApiParam(value = "Rule object that needs to be added to the database." ,required=true ) @RequestBody RuleInputDTO rule

,
@ApiParam(value = "The application for which the rule belongs" ,required=true ) @RequestHeader(value="token", required=true) Long token


);

}
