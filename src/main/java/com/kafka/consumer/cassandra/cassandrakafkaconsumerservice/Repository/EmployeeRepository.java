package com.kafka.consumer.cassandra.cassandrakafkaconsumerservice.Repository;

import com.kafka.consumer.cassandra.cassandrakafkaconsumerservice.model.Person;
import java.util.List;
import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CassandraRepository<Person, String> {

   @AllowFiltering
   List<Person> findByName(String name);
  
}
