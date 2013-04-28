package org.monitor.activity;

import org.monitor.util.MonitorDatabaseHelper;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;

public class BaseFragmentActivity extends FragmentActivity {

	OrmLiteSqliteOpenHelper helper;

	private volatile boolean created = false;
	private volatile boolean destroyed = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		if (helper == null) {
			helper = getHelperInternal(this);
			created = true;
		}
		super.onCreate(savedInstanceState);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		releaseHelper(helper);
		destroyed = true;
	}

	public ConnectionSource getConnectionSource() {
		return getHelper().getConnectionSource();
	}

	protected OrmLiteSqliteOpenHelper getHelperInternal(Context context) {
		OrmLiteSqliteOpenHelper newHelper = OpenHelperManager.getHelper(
				context, MonitorDatabaseHelper.class);
		return newHelper;
	}

	protected void releaseHelper(OrmLiteSqliteOpenHelper helper) {
		OpenHelperManager.releaseHelper();
		this.helper = null;
	}

	public OrmLiteSqliteOpenHelper getHelper() {
		if (helper == null) {
			if (!created) {
				throw new IllegalStateException(
						"A call has not been made to onCreate() yet so the helper is null");
			} else if (destroyed) {
				throw new IllegalStateException(
						"A call to onDestroy has already been made and the helper cannot be used after that point");
			} else {
				throw new IllegalStateException(
						"Helper is null for some unknown reason");
			}
		} else {
			return helper;
		}
	}

}
