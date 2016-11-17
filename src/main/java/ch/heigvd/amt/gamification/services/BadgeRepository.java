
package ch.heigvd.amt.gamification.services;
//
//
//import ch.heigvd.amt.gamification.model.Badge;
//import java.util.List;
//import java.util.Optional;
//import java.util.Collection;
//import org.springframework.data.repository.PagingAndSortingRepository;
//import org.springframework.data.repository.query.Param;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//import org.springframework.data.jpa.repository.JpaRepository;
//
////@RepositoryRestResource(collectionResourceRel = "badges", path = "badges")
//public interface BadgeRepository extends JpaRepository<Badge, Long>{
//    
//    //Collection<Badge> findByName(String BadgeName);
//}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ch.heigvd.amt.gamification.model.Badge;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Sekley Pascal <pascal.sekley@heig-vd.ch>
 */
public interface BadgeRepository extends JpaRepository<Badge, Long>{
    
    //List<Badge> findByName (String name);
    Badge findOne(long badgeId);
    List<Badge> findAll ();
    
}
