package org.monitor.http;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.monitor.cache.ImageCache;
import org.monitor.cache.RequestCache;
import org.monitor.task.Task;

public class HttpClient {

	private static HttpClient instance = new HttpClient();

	private static final ImageCache IMAGECACHE = new ImageCache();

	private static final RequestCache REQUESTCACHE = new RequestCache();

	public static final String PROTO_URI = "http://192.168.194.117:8080/jersey/ws/user/list_proto";
	public static final String JSON_URI = "http://192.168.194.117:8080/jersey/ws/user/list_json";
	public static final String LIST_TOPIC_URI = "http://192.168.194.117:8080/jersey/ws/topic/list_topic";
	public static final String LIST_CASUAL_URI = "http://192.168.194.117:8080/jersey/ws/casual/list_casual";// ?startIndex=0&pageSize=20

	private HttpClient() {
	}

	public static HttpClient getCurrentInstance() {
		return instance;
	}

	public ImageCache retriveImageCache() {
		return IMAGECACHE;
	}

	public RequestCache retriveRequestCache() {
		return REQUESTCACHE;
	}

	public String retriveJson(Task task) throws Exception {
		DefaultHttpClient client = new DefaultHttpClient();

		HttpGet httpget = new HttpGet(JSON_URI);

		HttpResponse response = client.execute(httpget);
		HttpEntity entity = response.getEntity();

		String result = null;
		Header ce = response.getFirstHeader("Content-Encoding");
		if (ce != null && "gzip".equalsIgnoreCase(ce.getValue())) {
			InputStream is = entity.getContent();
			GZIPInputStream gzip = new GZIPInputStream(is);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			byte[] buffer = new byte[1024];
			int len = -1;
			while ((len = gzip.read(buffer)) != -1) {
				baos.write(buffer, 0, len);
			}
			result = new String(baos.toByteArray());
			gzip.close();
			baos.close();
		} else {
			result = EntityUtils.toString(entity);
		}

		httpget.abort();

		client.getConnectionManager().shutdown();

		return result;
	}

}
