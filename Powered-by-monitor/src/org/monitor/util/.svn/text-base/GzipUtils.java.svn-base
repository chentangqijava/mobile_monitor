package org.monitor.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * in order to keep the data small....
 * 
 * @author moon-wong
 * 
 */
public class GzipUtils {

	/**
	 * comparess
	 * 
	 * @date： 2012-12-26
	 * @weibo <a href="http://weibo.com/u/1906287051">hello_match</a>
	 * 
	 * @param str
	 * @return
	 * @throws IOException
	 */
	public static byte[] compress(String content) {
		if (StringUtils.isEmpty(content)) {
			return null;
		}
		ByteArrayOutputStream out = null;
		GZIPOutputStream gzip = null;
		byte[] data = null;
		try {
			out = new ByteArrayOutputStream();
			gzip = new GZIPOutputStream(out);
			gzip.write(content.getBytes());
			data = out.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (gzip != null) {
					gzip.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return data;
	}

	/**
	 * 
	 * @date： 2012-12-26
	 * @weibo <a href="http://weibo.com/u/1906287051">hello_match</a>
	 * 
	 * @param str
	 * @return
	 * @throws IOException
	 */
	public static String uncompress(String content) {
		if (StringUtils.isEmpty(content)) {
			return content;
		}
		ByteArrayOutputStream out = null;
		ByteArrayInputStream in = null;
		GZIPInputStream gunzip = null;
		String result = null;
		try {
			out = new ByteArrayOutputStream();
			in = new ByteArrayInputStream(content.getBytes("ISO-8859-1"));
			gunzip = new GZIPInputStream(in);
			byte[] buffer = new byte[256];
			int n;
			while ((n = gunzip.read(buffer)) >= 0) {
				out.write(buffer, 0, n);
			}
			result = out.toString();
		} catch (Exception e) {
			result = content;
			e.printStackTrace();
		} finally {
			try {
				if (gunzip != null) {
					gunzip.close();
				}
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	/**
	 * 
	 * @date： 2012-12-26
	 * @weibo <a href="http://weibo.com/u/1906287051">hello_match</a>
	 * 
	 * @param str
	 * @return
	 * @throws IOException
	 */
	public static byte[] uncompress(byte[] content) {
		if (content == null || content.length <= 0) {
			return content;
		}
		ByteArrayOutputStream out = null;
		ByteArrayInputStream in = null;
		GZIPInputStream gunzip = null;
		byte[] data = null;
		try {
			out = new ByteArrayOutputStream();
			in = new ByteArrayInputStream(content);
			gunzip = new GZIPInputStream(in);
			byte[] buffer = new byte[256];
			int n;
			while ((n = gunzip.read(buffer)) >= 0) {
				out.write(buffer, 0, n);
			}
			data = out.toByteArray();
		} catch (Exception e) {
			data = content;
			e.printStackTrace();
		} finally {
			try {
				if (gunzip != null) {
					gunzip.close();
				}
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return data;
	}

}
