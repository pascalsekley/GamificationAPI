/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.heigvd.gamification.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * 
 * @author Sekley Pascal <pascal.sekley@heig-vd.ch>
 */
@Entity
public class Event implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private String description;
    private String applicationType;
   // private Long score;
    
    
    
    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
    private List<Badge> listBadges;
    
    @ManyToOne
    private Application application;
    
    
    
    public Event(){
        this.listBadges = new ArrayList<>();
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }
    
    public String getApplicationType(){
        return applicationType;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }

//    public long getScore()
//    {
//        return score;
//    }
//    
//     public Application getApplication(){
//        return application;
//    }
//
//    public void setScore(long score)
//    {
//        this.score = score;
//    }  
    
    public void setApplicationType(String applicationType){
        this.applicationType = applicationType;
    }
    
    public List<Badge> getBadges(){
        return listBadges;
    }
    
    public void addBadges(Badge badge){
        listBadges.add(badge);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public void setApplication(Application application){
        this.application = application;
    }
}
