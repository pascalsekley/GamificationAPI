/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.LocationRule;
import ch.heigvd.gamification.api.dto.RuleInputDTO;
import ch.heigvd.gamification.api.dto.RuleOutputDTO;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Sekley Pascal <pascal.sekley@heig-vd.ch>
 */
@RestController
@RequestMapping("/rules")
public class RulesEndpoint implements RulesApi{

    @Override
    public ResponseEntity<List<RuleOutputDTO>> rulesGet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> rulesIdDelete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public ResponseEntity<LocationRule> rulesPost(RuleInputDTO rule, Long token) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
