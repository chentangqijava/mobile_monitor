package org.monitor.parser;

import org.apache.http.HttpResponse;
import org.monitor.model.DataModel;

import com.fasterxml.jackson.databind.ObjectMapper;

public interface GenericParser<T> {

	public static final ObjectMapper mapper = new ObjectMapper();

	T parse(String data, Class<T> clazz) throws Exception;

	DataModel<T> parse(HttpResponse response, Class<T> clazz) throws Exception;

}
