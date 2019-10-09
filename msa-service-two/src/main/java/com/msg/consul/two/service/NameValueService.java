package com.msg.consul.two.service;

import com.msg.consul.two.model.AllNameValueTO;
import com.msg.consul.two.model.NameValueTO;

public interface NameValueService {

	NameValueTO updateNameValue(NameValueTO nameValueTO);

	AllNameValueTO getAllNameValues(String name);

	NameValueTO updateNameValue(NameValueTO nameValueTO, boolean fromRabbit);

	NameValueTO generateUUID();

	NameValueTO generateUUID(String applicationName);

}
