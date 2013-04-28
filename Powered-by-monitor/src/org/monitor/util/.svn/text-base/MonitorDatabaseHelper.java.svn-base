package org.monitor.util;

import java.sql.SQLException;

import org.monitor.model.Area;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class MonitorDatabaseHelper extends OrmLiteSqliteOpenHelper {

	private static final String DATABASE_NAME = "monitor.db";

	private static final int DATABASE_VERSION = 1;

	public MonitorDatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
	
	@Override
	public void onCreate(SQLiteDatabase db, ConnectionSource cs) {
		try {
			TableUtils.createTableIfNotExists(cs, Area.class);
			Dao<Area, Integer> dao = getDao(Area.class);
			for (int i = 0; i < 50; i++) {
				Area a = new Area();
				a.setAreaName("test"+i);
				dao.create(a);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, ConnectionSource cs, int arg2,
			int arg3) {

	}

}
