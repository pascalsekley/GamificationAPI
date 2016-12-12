/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.heigvd.gamification.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * 
 * @author Sekley Pascal <pascal.sekley@heig-vd.ch>
 */
@Entity
public class Rule implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne
    private PointScale pointScale;
    
    @ManyToOne
    private Badge badge;
    
    @ManyToOne
    private Application application;
    
    private int points;
    
    //private String eventName;
    
    private String ruleName;

        
    
    
    public Rule(){}
    
    public Rule(String ruleName, Application application, Badge badge, PointScale pointScale){
        this.ruleName = ruleName;
        this.application = application;
        this.badge = badge;
        this.pointScale = pointScale;
        this.points = 0;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public PointScale getPointScale() {
        return pointScale;
    }

    public void setPointScale(PointScale pointScale) {
        this.pointScale = pointScale;
    }
    
    public void setPoints(int points){
        this.points = points;
    }
    
    public int getPoints(){
        return points;
    }
    
    public void setRuleName(String ruleName){
        this.ruleName = ruleName;
    }
    
    public String getRuleName(){
        return ruleName;
    }

    public Badge getBadge() {
        return badge;
    }

    public void setBadge(Badge badge) {
        this.badge = badge;
    }
    
//    public void setCounterField(String counterField){
//        this.counterField = counterField;
//    }
//    
//    public String getCounterField(){
//        return counterField;
//    }

}
