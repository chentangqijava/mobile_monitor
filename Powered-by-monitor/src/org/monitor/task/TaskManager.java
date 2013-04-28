package org.monitor.task;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import android.os.Handler;
import android.os.Message;

public class TaskManager {

	protected static int COREPOOLSIZE = 1;

	protected static int MAXPOOLSIZE = 5;

	protected static final int KEEPALIVETIME = 60;

	protected static final TimeUnit TIMEUNIT = TimeUnit.SECONDS;

	protected static final int HANDLECOUNT = 100;

	protected ThreadPoolExecutor tpe;

	protected BlockingQueue<Runnable> workQueue;

	protected static Handler surfaceHandler = new Handler() {

		@Override
		public void handleMessage(Message msg) {
			//判断是否成功
			Task result = (Task) msg.obj;
			result.getCallback().callback(result.getData());
		}
	};

	public TaskManager() {

		workQueue = new LinkedBlockingQueue<Runnable>();
		
		tpe = new ThreadPoolExecutor(COREPOOLSIZE, MAXPOOLSIZE, KEEPALIVETIME,
				TIMEUNIT, workQueue);
		tpe.setRejectedExecutionHandler(new RejectedExecutionHandler() {
			@Override
			public void rejectedExecution(Runnable r,
					ThreadPoolExecutor executor) {
				System.out.println("任务被拒绝!");

			}
		});
	}

	public void dispatchTask(Task task) {
		TaskThread tt = new TaskThread(surfaceHandler, task);
		tpe.execute(tt);
	}

	/**
	 * 停止往线程池当中再加入新的线程
	 * 
	 * @date： 2012-9-7
	 * @weibo <a href="http://weibo.com/u/1906287051">hello_match</a>
	 * 
	 */
	public void shutdown() {
		if (!tpe.isShutdown()) {
			tpe.shutdown();
		}
	}

}
