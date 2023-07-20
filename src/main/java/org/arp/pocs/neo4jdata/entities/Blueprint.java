package org.arp.pocs.neo4jdata.entities;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Node("Blueprint")
public class Blueprint {

    @Id
    @GeneratedValue(UUIDStringGenerator.class)
    private String id;

    private String title;
    private String description;
    private String imageSrc;
    private String link;
    private String stackoverflowLink;
    private String confluenceLink;
    private String terraformLink;
    private String ansibleLink;
    private String cicdLink;
}
