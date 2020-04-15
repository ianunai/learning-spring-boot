package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

/**
 * TopicRepository class extendes a generic CrudRepository
 * CrudRepository takes in two arguments:
 *  1. class of Java object represented by the row of the table
 *  2. type of id for the Java class
 *  Benefit of using CrudRepository:
 *  Contains all basic implementations pre-defined
 */

public interface TopicRepository extends CrudRepository<Topic, String> {

}
