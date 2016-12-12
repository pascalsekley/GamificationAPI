/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.heigvd.gamification.services;

import ch.heigvd.gamification.model.Application;
import ch.heigvd.gamification.model.Badge;
import ch.heigvd.gamification.model.BadgeAward;
import ch.heigvd.gamification.model.Event;
import ch.heigvd.gamification.model.PointScale;
import ch.heigvd.gamification.model.PointsAward;
import ch.heigvd.gamification.model.Rule;
import java.util.Date;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 
 * @author Sekley Pascal <pascal.sekley@heig-vd.ch>
 */
@Service
public class RuleProcessor {
    
    ApplicationRepository applicationRepository;
    PointScaleRepository pointScaleRepository;
    BadgeRepository badgeRepository;
    AwardRepository awardRepository;
    
    
    
    
    
    public RuleProcessor(ApplicationRepository applicationRepository, PointScaleRepository pointScaleRepository,
                         BadgeRepository badgeRepository, AwardRepository awardRepository){
        this.applicationRepository = applicationRepository;
        this.pointScaleRepository = pointScaleRepository;
        this.badgeRepository = badgeRepository;
        this.awardRepository = awardRepository;
        
    }
    
    
    @Async
    @Transactional
    public void processRule(Event event) {
        
        Application targetApplication = event.getApplication();
        String eventName = event.getName();
        Long userId = event.getUserAppid();
        
        List<Rule> rules = targetApplication.getListRules();
        PointScale pointScale;
        Badge badge;
        if (rules.size() > 0) {
            for (Rule rule : rules) {
                switch (event.getName()) {
                    case "GivePoints":
                        pointScale = rule.getPointScale();

                        //if(pointScale != null && badge != null ){
                        PointsAward pointAward = new PointsAward(rule.getPointScale(), "Got some points", new Date(), event.getUser());
                        pointAward.setScore(rule.getPoints());
                        awardRepository.save(pointAward);
                        break;
                    case "GiveBadge":

                        badge = rule.getBadge();
                        BadgeAward badgeAward = new BadgeAward(rule.getBadge(), "Got a badge", new Date(), event.getUser());
                        awardRepository.save(badgeAward);
                        break;
                        
                    default:
                        throw new UnsupportedOperationException("No event rules for this request.");
//                    }
//                    else{
//                        throw new UnsupportedOperationException("No PointScale or Badge available for this rule.");
//                    }
                }
            }
        } else {
            throw new UnsupportedOperationException("No rules available for this: Create some rules before.");
        }
        

    }

}
