package com.msg.consul.two.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.msg.consul.two.domain.NameValue;

@Repository
public interface NameValueDao extends CrudRepository<NameValue, Long> {

}
