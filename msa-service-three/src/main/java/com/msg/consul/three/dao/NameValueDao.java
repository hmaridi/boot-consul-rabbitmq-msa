package com.msg.consul.three.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.msg.consul.three.domain.NameValue;

@Repository
public interface NameValueDao extends CrudRepository<NameValue, Long> {

}
