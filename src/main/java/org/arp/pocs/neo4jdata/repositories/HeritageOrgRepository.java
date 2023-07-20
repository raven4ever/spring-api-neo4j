package org.arp.pocs.neo4jdata.repositories;

import org.arp.pocs.neo4jdata.entities.HeritageOrg;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface HeritageOrgRepository extends Neo4jRepository<HeritageOrg, String> {

}
