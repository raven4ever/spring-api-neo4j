package org.arp.pocs.neo4jdata.repositories;

import java.util.Optional;

import org.arp.pocs.neo4jdata.entities.Category;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface CategoryRepository extends Neo4jRepository<Category, String> {
    Optional<Category> findByName(String name);
}
