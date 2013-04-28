package org.monitor.activity;

import java.sql.SQLException;
import java.util.List;

import org.monitor.adapter.AreaAdapter;
import org.monitor.model.Area;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

import com.j256.ormlite.dao.Dao;

public class MainActivity extends BaseFragmentActivity {

	protected ListView lvArea;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		List<Area> areas = null;
		try {
			Dao<Area, Integer> dao = getHelper().getDao(Area.class);
			areas = dao.queryForAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		AreaAdapter aa = new AreaAdapter(this, areas);
		lvArea = (ListView) findViewById(R.id.lvArea);
		lvArea.setAdapter(aa);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
