package org.monitor;

import org.monitor.task.TaskManager;

import android.app.Application;

public class MonitorApplication extends Application {

	private static MonitorApplication instance;

	private TaskManager MANAGER = new TaskManager();
	
	private MonitorApplication() {
	}

	public static synchronized MonitorApplication getCurrentInstance() {
		if (instance == null) {
			instance = new MonitorApplication();
		}
		return instance;
	}

	public TaskManager retriveTaskManager() {
		return MANAGER;
	}

	@Override
	public void onCreate() {
		super.onCreate();
	}

	@Override
	public void onLowMemory() {
		super.onLowMemory();
	}

	@Override
	public void onTerminate() {
		super.onTerminate();
		MANAGER.shutdown();
	}
}
