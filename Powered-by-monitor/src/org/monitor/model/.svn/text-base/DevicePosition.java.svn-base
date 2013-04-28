package org.monitor.model;

import java.util.Date;


import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Area entity...
 */
@DatabaseTable(tableName = "t_device_position")
public class DevicePosition {

	@DatabaseField(id=true, canBeNull=false,unique=true, columnName = "device_position_id")
	private String devicePositionId;

	@DatabaseField( columnName = "device_position_name", canBeNull = true)
	private String devicePositionName;

	@DatabaseField(columnName = "parent_id", canBeNull = true)
	private String parentId;
	@DatabaseField(columnName = "device_position_path", canBeNull = true)
	private String devicePositionPath;
	@DatabaseField(columnName = "level", canBeNull = true)
	private int level;
	@DatabaseField(columnName = "xh", canBeNull = true)
	private int xh;
	@DatabaseField(columnName = "is_leaf", canBeNull = true)
	private int isLeaf;
	@DatabaseField(columnName = "create_by", canBeNull = true)
	private String createBy;

	@DatabaseField(columnName = "create_date", canBeNull = true, dataType = DataType.DATE)
	private Date createDate;

	@DatabaseField(columnName = "update_by", canBeNull = true)
	private String updateBy;
	@DatabaseField(columnName = "update_date", canBeNull = true, dataType = DataType.DATE)
	private Date updateDate;

	@DatabaseField(columnName = "status", canBeNull = true)
	private int status;

	 

	 

	public String getDevicePositionId() {
		return devicePositionId;
	}

	public void setDevicePositionId(String devicePositionId) {
		this.devicePositionId = devicePositionId;
	}

	public String getDevicePositionName() {
		return devicePositionName;
	}

	public void setDevicePositionName(String devicePositionName) {
		this.devicePositionName = devicePositionName;
	}

	public String getDevicePositionPath() {
		return devicePositionPath;
	}

	public void setDevicePositionPath(String devicePositionPath) {
		this.devicePositionPath = devicePositionPath;
	}

	 

	 

	public int getXh() {
		return xh;
	}

	public void setXh(int xh) {
		this.xh = xh;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getIsLeaf() {
		return isLeaf;
	}

	public void setIsLeaf(int isLeaf) {
		this.isLeaf = isLeaf;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
