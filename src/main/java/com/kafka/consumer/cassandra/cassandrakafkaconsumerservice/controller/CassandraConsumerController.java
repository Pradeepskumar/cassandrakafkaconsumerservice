package com.kafka.consumer.cassandra.cassandrakafkaconsumerservice.controller;

import com.kafka.consumer.cassandra.cassandrakafkaconsumerservice.model.Person;
import com.kafka.consumer.cassandra.cassandrakafkaconsumerservice.service.CassandraConsumerService;
import java.util.List;
import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getdata")
public class CassandraConsumerController {


private CassandraConsumerService consumerService;

  @Autowired
  public CassandraConsumerController(CassandraConsumerService consumerService) {
    this.consumerService = consumerService;
  }

  @GetMapping("/values/{name}")
  public ResponseEntity gertValueFromCassandra (@PathVariable String name){
    List<Person> person = consumerService.getValueByName(name);
    return new ResponseEntity(person, HttpStatus.OK);
  }







}
