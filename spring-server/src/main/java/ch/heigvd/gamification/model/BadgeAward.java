
package ch.heigvd.gamification.model;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author TCHUENSU
 */

@Entity
public class BadgeAward extends Award implements Serializable{

    
    @ManyToOne
    private Badge badge;
    
//    @ManyToOne
//    private User user;
    
    
     public BadgeAward() {
    }
   
     public BadgeAward(Badge badge, String reason, Timestamp timestamp, User appUser){
         super(reason, timestamp, appUser);
         this.badge = badge;
     }

     
     public Badge getBadge() {
        return badge;
    }
     
    public void setBadge(Badge badge) {
        this.badge = badge;
    }
    
     // new Timestamp(System.currentTimeMillis());
}