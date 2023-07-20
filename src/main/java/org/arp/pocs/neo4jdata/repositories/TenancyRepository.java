package org.arp.pocs.neo4jdata.repositories;

import org.arp.pocs.neo4jdata.entities.Tenancy;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface TenancyRepository extends Neo4jRepository<Tenancy, String> {

}
