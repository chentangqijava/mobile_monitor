package org.monitor.model;

import java.util.Date;


import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Area entity...
 */
@DatabaseTable(tableName = "t_device")
public class Device {

	@DatabaseField(id=true, canBeNull=false,unique=true,columnName = "device_id")
	private String deviceId;

	@DatabaseField( columnName = "device_name", canBeNull = true)
	private String deviceName;
 
	@DatabaseField( columnName = "device_position_id", canBeNull = true)
	private String devicePositionId;
	
	@DatabaseField( columnName = "area_id", canBeNull = true)
	private String areaId;
	
	@DatabaseField( columnName = "device_type", canBeNull = true)
	private String deviceType;
	
	@DatabaseField(columnName = "device_ip", canBeNull = true)
	private String deviceIp;
	
	
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
 
	
 

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDevicePositionId() {
		return devicePositionId;
	}

	public void setDevicePositionId(String devicePositionId) {
		this.devicePositionId = devicePositionId;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceIp() {
		return deviceIp;
	}

	public void setDeviceIp(String deviceIp) {
		this.deviceIp = deviceIp;
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

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	
}
