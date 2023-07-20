package org.arp.pocs.neo4jdata.entities;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Node("Category")
public class Category {

    @Id
    @GeneratedValue(UUIDStringGenerator.class)
    private String id;

    private String name;
    private String description;
    private String imageSrc;
    private Integer displayOrder;

    public Category(String name, String description, String imageSrc, Integer displayOrder) {
        this.id = null;
        this.name = name;
        this.description = description;
        this.imageSrc = imageSrc;
        this.displayOrder = displayOrder;
    }

}
