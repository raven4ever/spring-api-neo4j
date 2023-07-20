package org.arp.pocs.neo4jdata.entities;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Node("Provider")
public class Provider {

    @Id
    @GeneratedValue(UUIDStringGenerator.class)
    private String id;

    private String name;
    private String description;
    private String imageSrc;

    public Provider(String name, String description) {
        this.id = null;
        this.name = name;
        this.description = description;
    }

    public Provider(String name, String description, String imageSrc) {
        this.id = null;
        this.name = name;
        this.description = description;
        this.imageSrc = imageSrc;
    }
}
