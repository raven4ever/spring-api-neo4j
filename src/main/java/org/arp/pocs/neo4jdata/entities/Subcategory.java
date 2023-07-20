package org.arp.pocs.neo4jdata.entities;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Node("Subcategory")
public class Subcategory {

    @Id
    @GeneratedValue(UUIDStringGenerator.class)
    private String id;

    private String subject;
    private String description;
    private Integer displayOrder;
    private String imageSrc;

    @Relationship(type = "HAS_CAPABILITY", direction = Relationship.Direction.INCOMING)
    private Category category;

    public Subcategory(String subject, String description, Integer displayOrder, Category category) {
        this.subject = subject;
        this.description = description;
        this.displayOrder = displayOrder;
        this.category = category;
    }

    public Subcategory(String subject, String description, String imageSrc, Integer displayOrder, Category category) {
        this.subject = subject;
        this.description = description;
        this.imageSrc = imageSrc;
        this.displayOrder = displayOrder;
        this.category = category;
    }
}
