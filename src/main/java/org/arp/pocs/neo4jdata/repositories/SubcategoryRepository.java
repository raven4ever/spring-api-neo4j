package org.arp.pocs.neo4jdata.repositories;

import org.arp.pocs.neo4jdata.entities.Subcategory;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface SubcategoryRepository extends Neo4jRepository<Subcategory, String> {

}
