package org.monitor.adapter;

import java.util.ArrayList;
import java.util.List;

import org.monitor.model.Area;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AreaAdapter extends BaseAdapter {

	List<Area> areas;
	Context cxt;

	public AreaAdapter(Context cxt, List<Area> areas) {
		if (areas == null) {
			areas = new ArrayList<Area>();
		}
		this.areas = areas;
		this.cxt = cxt;
	}

	@Override
	public int getCount() {
		return areas.size();
	}

	@Override
	public Object getItem(int position) {
		return areas.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Area area = areas.get(position);
		AreaHolder holder = null;
		if (convertView == null) {
			holder = new AreaHolder();
			convertView = new TextView(cxt);
			holder.tvAreaName = (TextView) convertView;
			convertView.setTag(holder);
		} else {
			holder = (AreaHolder) convertView.getTag();
		}
		holder.tvAreaName.setText(area.getAreaName());
		return convertView;
	}

	private static final class AreaHolder {
		TextView tvAreaName;
	}
}
