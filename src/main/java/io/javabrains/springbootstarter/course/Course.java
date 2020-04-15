package io.javabrains.springbootstarter.course;

import io.javabrains.springbootstarter.topic.Topic;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
public class Course {

    @Id
    @Getter @Setter private String id;
    @Getter @Setter private String name;
    @Getter @Setter private String description;

    @ManyToOne
    private Topic topic;

    public Course(String id, String topicId, String name, String description) {
        super();
        this.topic = new Topic(topicId, "", "");
        this.id = id;
        this.name = name;
        this.description = description;
    }

}
