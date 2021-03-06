package com.kafka.consumer.cassandra.cassandrakafkaconsumerservice.service;

import com.kafka.consumer.cassandra.cassandrakafkaconsumerservice.dto.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

  @Autowired
  CassandraConsumerService cassandraConsumerService;

  @KafkaListener(topics = "EXAMPLE_TOPIC",groupId = "group_id")
  public void consume(String message)
  {
    System.out.println(String.format("Message recieved -> %s", message));
  }

  @KafkaListener(topics = "Example_Topic_JSON", groupId = "group_json", containerFactory = "userKafkaListener")
  public void consume(PersonDTO personDTO) {
    System.out.println("Message recieved -> %s" + personDTO);
    cassandraConsumerService.saveAll(personDTO);
  }

}
