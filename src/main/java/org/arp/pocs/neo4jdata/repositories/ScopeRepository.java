package org.arp.pocs.neo4jdata.repositories;

import org.arp.pocs.neo4jdata.entities.Scope;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ScopeRepository extends Neo4jRepository<Scope, String>{
    
}
