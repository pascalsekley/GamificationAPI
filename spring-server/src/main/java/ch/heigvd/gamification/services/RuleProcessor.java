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
    RuleRepository ruleRepository;

    
    public RuleProcessor(ApplicationRepository applicationRepository, PointScaleRepository pointScaleRepository,
                         BadgeRepository badgeRepository, AwardRepository awardRepository,
                         RuleRepository ruleRepository){
        this.applicationRepository = applicationRepository;
        this.pointScaleRepository = pointScaleRepository;
        this.badgeRepository = badgeRepository;
        this.awardRepository = awardRepository;
        this.ruleRepository = ruleRepository;
        
    }
    
    
    @Async
    @Transactional
    public void processRule(Event event) {
        
        Application targetApplication = event.getApplication();
        String eventType= event.getName();
        Long userId = event.getUserAppid();
        
        //List<Rule> rules = targetApplication.getListRules();
        List<Rule> rules = ruleRepository.findByEventTypeAndApplicationId(eventType, event.getApplication().getId());
        PointScale pointScale;
        Badge badge;
        
        
        if(rules.size() > 0){
            for (Rule rule : rules) {
                pointScale = rule.getPointScale();
                badge = rule.getBadge();
                
                if(pointScale != null){
                    PointsAward userPointAward = awardRepository.findByUserAndPointScale(event.getUser(), pointScale);
                    if(userPointAward != null){
                        userPointAward.setScore(userPointAward.getScore() + rule.getPoints());
                    }
                    else{
                        userPointAward = new PointsAward(rule.getPointScale(), "Got some points", new Date(), event.getUser());
                        userPointAward.setScore(rule.getPoints());
                    }
                    awardRepository.save(userPointAward);
                }
                
                if(badge != null){
                    BadgeAward userBadgeAward = awardRepository.findByUserAndBadge(event.getUser(), badge);
                    if(userBadgeAward == null){
                        userBadgeAward = new BadgeAward(rule.getBadge(), "Got a badge", new Date(), event.getUser());
                        awardRepository.save(userBadgeAward);
                    }
                }
            }
                        
        }
        else{
            throw new UnsupportedOperationException("No rules available for this: Create some rules before.");
        }
        
    }

}
