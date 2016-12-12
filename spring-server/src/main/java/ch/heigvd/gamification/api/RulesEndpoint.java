/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.LocationRule;
import ch.heigvd.gamification.api.dto.RuleInputDTO;
import ch.heigvd.gamification.api.dto.RuleOutputDTO;
import ch.heigvd.gamification.model.Application;
import ch.heigvd.gamification.model.Badge;
import ch.heigvd.gamification.model.PointScale;
import ch.heigvd.gamification.model.Rule;
import ch.heigvd.gamification.services.ApplicationRepository;
import ch.heigvd.gamification.services.BadgeRepository;
import ch.heigvd.gamification.services.PointScaleRepository;
import ch.heigvd.gamification.services.RuleRepository;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Sekley Pascal <pascal.sekley@heig-vd.ch>
 */
@RestController
@RequestMapping("/rules")
public class RulesEndpoint implements RulesApi{
    
    BadgeRepository badgeRepository;
    PointScaleRepository pointScaleRepository;
    RuleRepository ruleRepository;
    ApplicationRepository applicationRepository;
    private final HttpServletRequest request;
    
    
    @Autowired
    RulesEndpoint(RuleRepository ruleRepository, ApplicationRepository applicationRepository, 
            BadgeRepository badgesRepository, PointScaleRepository pointScaleRepository,
            HttpServletRequest request) {
            this.ruleRepository = ruleRepository;
            this.applicationRepository = applicationRepository;
            this.badgeRepository = badgesRepository;
            this.pointScaleRepository = pointScaleRepository;
            this.request = request;
            
}
    
    
    

    @Override
    public ResponseEntity<List<RuleOutputDTO>> rulesGet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> rulesIdDelete(@PathParam("id") Long id) {
        Rule currentRule = ruleRepository.findOne(id);
         if(currentRule == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        
        ruleRepository.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Override
    public ResponseEntity<RuleOutputDTO> rulesIdGet(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> rulesIdPut(Long id, RuleInputDTO rule) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<LocationRule> rulesPost(@RequestBody RuleInputDTO rule, @RequestHeader Long token) {
        
        // Let's find the target application the badge and the pointscale
        Application targetApplication = applicationRepository.findOne(token);
        Badge targetBadge = badgeRepository.findOne(rule.getBadgeId());
        PointScale targetPointScale = pointScaleRepository.findOne(rule.getPointScaleId());
        
        // If that rule exist
        //if (ruleRepository.findByName(rule.getRuleName()) != null) {
            if (targetApplication != null) {
                if (targetBadge != null || targetPointScale != null) {

                    Rule newRule = new Rule(rule.getRuleName(), targetApplication, targetBadge, targetPointScale);
                    newRule.setPoints(rule.getPoints());
                    ruleRepository.save(newRule);
                    
                    String location = request.getRequestURL() + "/" + newRule.getId();
                    HttpHeaders headers = new HttpHeaders();
                    headers.add("Location", location);
                    return new ResponseEntity<>(headers, HttpStatus.CREATED);
                }

            }
        //}

        return new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);

    }

}
