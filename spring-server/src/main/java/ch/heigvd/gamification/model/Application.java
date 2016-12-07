

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
import javax.persistence.OneToMany;

/**
 * 
 * @author Sekley Pascal <pascal.sekley@heig-vd.ch>
 */
@Entity
public class Application implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private String description;
    
    @OneToMany(mappedBy = "application", cascade = CascadeType.ALL)
    private List<Badge> listBadges;
    
    @OneToMany(mappedBy = "application", cascade = CascadeType.ALL)
    private List<Event> listEvents;
    
    public Application(){}
    
    public Application(String name, String description){
        this.name = name;
        this.description = description;
        listBadges = new ArrayList<>();
        listEvents = new ArrayList<>();
    }
    
    
    public List<Badge> getBadges(){
        return listBadges;
    }
    
    public List<Event> getEvents(){
        return listEvents;
    }
    
    
    public Long getId() {
        return id;
    }
   
    
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public void addEvent(Event newEvent){
        this.listEvents.add(newEvent);
    }
}
