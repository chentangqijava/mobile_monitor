package org.monitor.model;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class DataModel<T> implements Serializable{

	private int pageNumber;

	private int startIndex;

	private int pageSize;

	private int total;

	private List<T> datas;

	public DataModel() {
	}

	public DataModel(int total, List<T> datas) {
		this.total = total;
		this.datas = datas;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<T> getDatas() {
		return datas;
	}

	public void setDatas(List<T> datas) {
		this.datas = datas;
	}

}
