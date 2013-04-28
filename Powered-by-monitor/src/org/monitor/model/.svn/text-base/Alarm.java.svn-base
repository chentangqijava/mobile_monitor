package org.monitor.model;

import java.util.Date;


import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Area entity...
 */
@DatabaseTable(tableName = "t_alarm")
public class Alarm {


	@DatabaseField(id=true, canBeNull=false,unique=true,columnName = "alarm_id")
	private String alarmId;
	
	@DatabaseField( canBeNull = true, columnName = "device_id")
	private int deviceId;

	@DatabaseField(  columnName = "alarm_type", canBeNull = true)
	private String alarmType;
 
	@DatabaseField( columnName = "alarm_ccur_ime", canBeNull = true,dataType = DataType.DATE)
	private String alarmOccurTime;
	
	@DatabaseField( columnName = "alarm_end_time", canBeNull = true,dataType = DataType.DATE)
	private String alarmEndTime;
	
	@DatabaseField(columnName = "alarm_clean_time", canBeNull = true,dataType = DataType.DATE)
	private String alarmCleanTime;
	
	
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
 
	

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
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

 

	public String getAlarmId() {
		return alarmId;
	}

	public void setAlarmId(String alarmId) {
		this.alarmId = alarmId;
	}

	public String getAlarmType() {
		return alarmType;
	}

	public void setAlarmType(String alarmType) {
		this.alarmType = alarmType;
	}

	public String getAlarmOccurTime() {
		return alarmOccurTime;
	}

	public void setAlarmOccurTime(String alarmOccurTime) {
		this.alarmOccurTime = alarmOccurTime;
	}

	public String getAlarmEndTime() {
		return alarmEndTime;
	}

	public void setAlarmEndTime(String alarmEndTime) {
		this.alarmEndTime = alarmEndTime;
	}

	public String getAlarmCleanTime() {
		return alarmCleanTime;
	}

	public void setAlarmCleanTime(String alarmCleanTime) {
		this.alarmCleanTime = alarmCleanTime;
	}

	
}
