//package com.kafka.consumer.cassandra.cassandrakafkaconsumerservice.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
//
//import org.springframework.data.cassandra.core.mapping.BasicCassandraMappingContext;
//import org.springframework.data.cassandra.core.mapping.CassandraMappingContext;
//
//@Configuration
//public class CassandraConfig extends AbstractCassandraConfiguration {
//
//  @Value("${spring.data.cassandra.contact-points}")
//  private String hostList;
//
////  @Value("${spring.data.cassandra.datacenter}")
////  private String datacenter;
//
//  @Value("${spring.data.cassandra.keyspace-name}")
//  private String keyspaceName;
//
//  @Value("${spring.data.cassandra.username}")
//  private String userName;
//
//  @Value("${spring.data.cassandra.password}")
//  private String password;
//
//  @Value("${spring.data.cassandra.port}")
//  private Integer port;
//
//  @Override
//  protected String getKeyspaceName() {
//    return keyspaceName;
//  }
//  @Override
//  protected String getContactPoints() {
//    return hostList;
//  }
//  @Override
//  protected int getPort() {
//    return port;
//  }
//}