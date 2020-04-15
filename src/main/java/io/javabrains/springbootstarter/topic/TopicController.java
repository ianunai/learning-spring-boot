package io.javabrains.springbootstarter.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    /**
     * 1. Spring automatically converts the return list into a JSON
     * 2. The key in the properties of each JSON object returned correspond to the properties of the Java class.
     */

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("spring", "Spring Framework", "Spring Framework Description"),
                new Topic("spring-boot", "Spring Boot Framework", "Spring Boot Framework Description"),
                new Topic("spring-mvc", "Spring MVC Framework", "Spring MVC Framework Description")
        );
    }

}
