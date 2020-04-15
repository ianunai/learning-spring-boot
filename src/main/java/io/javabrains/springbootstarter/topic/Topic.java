package io.javabrains.springbootstarter.topic;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
public class Topic {

    @Getter @Setter private String id;
    @Getter @Setter private String name;
    @Getter @Setter private String description;

    public Topic(String id, String name, String description) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
    }

}
