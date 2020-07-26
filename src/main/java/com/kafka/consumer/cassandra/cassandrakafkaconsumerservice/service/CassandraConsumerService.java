package com.kafka.consumer.cassandra.cassandrakafkaconsumerservice.service;

import com.kafka.consumer.cassandra.cassandrakafkaconsumerservice.dto.PersonDTO;
import com.kafka.consumer.cassandra.cassandrakafkaconsumerservice.model.Person;
import com.kafka.consumer.cassandra.cassandrakafkaconsumerservice.Repository.EmployeeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CassandraConsumerService {

private EmployeeRepository employeeRepository;

@Autowired
  public CassandraConsumerService(
      EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }

  public List<Person> getValueByName(String name) {
    return employeeRepository.findByName(name);
  }

  public Person saveAll(PersonDTO personDTO) {
    Person person = new Person();
    person.setId(Integer.parseInt(personDTO.getId()));
    person.setAge(personDTO.getAge());
    person.setName(personDTO.getName());
    person.setCountry(personDTO.getCountry());

    Person newPerson = employeeRepository.save(person);
    return person;
  }
}
