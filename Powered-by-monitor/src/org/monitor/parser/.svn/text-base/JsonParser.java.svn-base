package org.monitor.parser;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.monitor.model.DataModel;

import com.fasterxml.jackson.databind.JavaType;

/**
 * jackson解析器(未有明确类型指定时，需要指定相应的类型，否则全部为map格式)
 * 
 * @author moon-wong
 * 
 * @param <T>
 */
public class JsonParser<T> implements GenericParser<T> {

	@Override
	public T parse(String data, Class<T> clazz) throws Exception {
		return mapper.readValue(data, clazz);
	}

	@Override
	public DataModel<T> parse(HttpResponse response, Class<T> clazz)
			throws Exception {
		HttpEntity entity = response.getEntity();

		DataModel<T> dm = null;
		Header ce = response.getFirstHeader("Content-Encoding");
		JavaType type = mapper.getTypeFactory().constructParametricType(
				DataModel.class, clazz);
		if (ce != null && "gzip".equalsIgnoreCase(ce.getValue())) {
			InputStream is = entity.getContent();
			GZIPInputStream gzip = new GZIPInputStream(is);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			byte[] buffer = new byte[1024];
			int len = -1;
			while ((len = gzip.read(buffer)) != -1) {
				baos.write(buffer, 0, len);
			}

			dm = mapper.readValue(baos.toByteArray(), type);
			gzip.close();
			baos.close();

		} else {
			dm = mapper.readValue(entity.getContent(), type);
		}
		return dm;
	}

}
