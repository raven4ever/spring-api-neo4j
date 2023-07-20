package org.arp.pocs.neo4jdata.repositories;

import org.arp.pocs.neo4jdata.entities.Provider;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ProviderRepository extends Neo4jRepository<Provider, String> {

}
