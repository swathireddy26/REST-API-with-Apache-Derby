package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

//We are getting all the generic crud repositoy methods by extending CrudRepository
public interface TopicRepository extends CrudRepository<Topic, String> {

}
