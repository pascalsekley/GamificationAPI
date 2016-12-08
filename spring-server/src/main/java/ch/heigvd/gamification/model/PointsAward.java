/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.heigvd.gamification.model;

import java.io.Serializable;
import java.sql.Timestamp;
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
public class PointsAward extends Award implements Serializable {
    
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
    
    private long score;
        
//    @ManyToOne
//    private User user;
    
    @ManyToOne
    private PointScale pointScale;
    
    public PointsAward() {}
    
    public PointsAward(PointScale pointScale, String reason, Timestamp timestamp, User appUser){
         super(reason, timestamp, appUser);
         this.pointScale = pointScale;
     }

     
     public PointScale getPointScale() {
        return pointScale;
    }
     
    public void setPointScale(PointScale pointScale) {
        this.pointScale = pointScale;
    }

}
