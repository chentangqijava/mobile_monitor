package org.monitor.task;

import android.content.Context;

/**
 * each request is a task...
 * 
 * so, when you request a url, you have to new a instance of this.
 * 
 * @author moon-wong
 * 
 */
public class Task {

	/**
	 * every task must be have a id...
	 */
	private int taskId;

	/**
	 * every request can be require some parameters...
	 */
	private Object params;

	/**
	 * in order to hold current context...
	 */
	private Context context;

	/**
	 * this will be called when the request return...
	 */
	private Callback callback;

	/**
	 * retrieved data...
	 */
	private Object data;

	/**
	 * the custom code according to request...
	 */
	private int code;

	/**
	 * give some message according to request code...
	 */
	private String message;

	public static final int RETRIVE_USER = 1;
	public static final int RETRIVE_PROTO = 2;
	public static final int RETRIVE_JSON = 3;
	public static final int RETRIVE_TOPIC_ALL = 4;
	public static final int RETRIVE_TOPIC_HOT = 5;

	public Task(int taskId, Context context, Callback callback) {
		this.taskId = taskId;
		this.context = context;
		this.callback = callback;
	}

	public Task(int taskId, Context context, Object params, Callback callback) {
		this(taskId, context, callback);
		this.params = params;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public Object getParams() {
		return params;
	}

	public void setParams(Object params) {
		this.params = params;
	}

	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}

	public Callback getCallback() {
		return callback;
	}

	public void setCallback(Callback callback) {
		this.callback = callback;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
