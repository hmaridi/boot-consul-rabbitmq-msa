package com.msg.consul.one.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.msg.consul.one.domain.NameValue;

@Repository
public interface NameValueDao extends CrudRepository<NameValue, Long> {

}
