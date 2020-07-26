package com.kafka.consumer.cassandra.cassandrakafkaconsumerservice.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Table("employees")
public class Person implements Serializable{

  @PrimaryKey
  @Column("id")
  private @NonNull int id;
  @Column("name")
  private @NonNull String name;
  @Column("country")
  private @NonNull String country;
  @Column("age")
  private @NonNull String age;

}
