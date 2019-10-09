package com.msg.consul.one.service;

import com.msg.consul.one.model.AllNameValueTO;
import com.msg.consul.one.model.NameValueTO;

public interface NameValueService {

	NameValueTO updateNameValue(NameValueTO nameValueTO);

	NameValueTO updateNameValue(NameValueTO nameValueTO, boolean fromRabbit);

	AllNameValueTO getAllNameValues(String name);

	NameValueTO generateUUID();

	NameValueTO generateUUID(String applicationName);

}
