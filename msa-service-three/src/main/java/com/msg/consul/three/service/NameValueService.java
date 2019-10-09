package com.msg.consul.three.service;

import com.msg.consul.three.model.AllNameValueTO;
import com.msg.consul.three.model.NameValueTO;

public interface NameValueService {

	NameValueTO updateNameValue(NameValueTO nameValueTO);

	AllNameValueTO getAllNameValues(String name);

	NameValueTO updateNameValue(NameValueTO nameValueTO, boolean fromRabbit);

	NameValueTO generateUUID();

	NameValueTO generateUUID(String applicationName);

}
