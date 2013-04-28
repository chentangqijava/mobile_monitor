package org.monitor.task;

import org.monitor.http.HttpClient;

import android.os.Handler;
import android.os.Message;

/**
 * this thread will execute some asynchronized tasks and return the retrieved
 * data for you
 * 
 * @author moon-wong
 * 
 */
public class TaskThread implements Runnable {

	protected Handler surfaceHandler;
	protected Task task;

	public TaskThread(Handler surfaceHandler, Task task) {
		this.surfaceHandler = surfaceHandler;
		this.task = task;
	}

	@Override
	public void run() {
		switch (task.getTaskId()) {
		case Task.RETRIVE_PROTO:

		case Task.RETRIVE_JSON:
			String result = retriveJson();
			task.setData(result);
			notify(Task.RETRIVE_JSON);
			break;
		}
	}

	private String retriveJson() {
		try {
			return HttpClient.getCurrentInstance().retriveJson(task);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void notify(int taskId) {
		Message message = surfaceHandler.obtainMessage();
		message.what = taskId;
		message.obj = task;
		message.sendToTarget();
	}
}
