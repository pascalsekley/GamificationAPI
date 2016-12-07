/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.EventInputDTO;
import ch.heigvd.gamification.api.dto.LocationEvent;
import ch.heigvd.gamification.model.Event;
import ch.heigvd.gamification.services.ApplicationRepository;
import ch.heigvd.gamification.services.EventRepository;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Sekley Pascal <pascal.sekley@heig-vd.ch>
 */
@RestController
public class EventsEndpoint implements EventsApi{
    
    private final EventRepository eventRepository;
    private final ApplicationRepository applicationRepository;
    private final HttpServletRequest request;
    
    @Autowired
    EventsEndpoint(HttpServletRequest request, EventRepository eventRepository, 
                                               ApplicationRepository applicationRepository){
        this.request = request;
        this.eventRepository = eventRepository;
        this.applicationRepository = applicationRepository;
    }

    @Override
    public ResponseEntity<LocationEvent> eventsPost(EventInputDTO event) {
        Event newEvent = new Event();
        
        newEvent.setName(event.getName());
        newEvent.setDescription(event.getDescription());
        //newEvent.setScore(event.getScore());
        newEvent.setApplicationType(event.getApplicationType());
        
        eventRepository.save(newEvent);
        applicationRepository.findByName(event.getApplicationType()).addEvent(newEvent);
        
        String location =request.getRequestURL()+"/";
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", location);
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
        
    }

}
