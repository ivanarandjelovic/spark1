package org.aivan.spark1.util;

import com.fasterxml.jackson.databind.*;
import java.io.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonUtil {
  final static Logger logger = LoggerFactory.getLogger(JsonUtil.class);
  
	public static String dataToJson(Object data) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			StringWriter sw = new StringWriter();
			mapper.writeValue(sw, data);
			return sw.toString();
		} catch (IOException e) {
			logger.error("IOEXception while mapping object (" + data + ") to JSON", e);
			throw new RuntimeException("IOEXception while mapping object (" + data + ") to JSON");
		}
	}
}