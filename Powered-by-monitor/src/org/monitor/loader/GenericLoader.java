package org.monitor.loader;

import org.monitor.model.DataModel;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

public class GenericLoader<T> extends AsyncTaskLoader<T> {

	public int loadType = 1;
	
	protected DataModel<?> dm;

	T result = null;

	public GenericLoader(Context context) {
		super(context);
	}

	@Override
	public T loadInBackground() {
		T result = null;
		switch (loadType) {
		case 1:
			break;
		case 2:

			break;
		case 3:

			break;
		case 4:
			break;
		}
		return result;
	}

	@Override
	public void deliverResult(T data) {
		if (isReset()) {
			if (data != null) {
				// 释放资源
			}
		}
		T oldData = data;
		result = data;
		if (isStarted()) {
			super.deliverResult(result);
		}

		if (oldData != null) {
			// 释放资源
		}
	}

	@Override
	public void onCanceled(T data) {
		super.onCanceled(data);
		cancelLoad();
	}

	@Override
	protected void onReset() {
		super.onReset();
		onStopLoading();
		if (result != null) {
			//result = null;
		}
	}

	@Override
	protected void onStartLoading() {
		if (result != null) {
			deliverResult(result);
		}
		if (result == null) {
			forceLoad();
		}
	}

	@Override
	protected void onStopLoading() {
		super.onStopLoading();
	}

	public int getLoadType() {
		return loadType;
	}

	public void setLoadType(int loadType) {
		this.loadType = loadType;
	}

	public DataModel<?> getDm() {
		return dm;
	}

	public void setDm(DataModel<?> dm) {
		this.dm = dm;
	}

}
