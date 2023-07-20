package org.arp.pocs.neo4jdata.repositories;

import org.arp.pocs.neo4jdata.entities.Status;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface StatusRepository extends Neo4jRepository<Status, String>{
    
}
