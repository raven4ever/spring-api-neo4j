package org.arp.pocs.neo4jdata.repositories;

import org.arp.pocs.neo4jdata.entities.ComponentStatus;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ComponentStatusRepository extends Neo4jRepository<ComponentStatus, String>{
    
}
