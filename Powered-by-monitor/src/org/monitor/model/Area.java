package org.monitor.model;

import java.util.Date;


import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Area entity...
 */
@DatabaseTable(tableName = "t_area")
public class Area {

	@DatabaseField(id=true, canBeNull=false,unique=true, columnName = "area_id")
	private String areaId;

	@DatabaseField( columnName = "area_name", canBeNull = true)
	private String areaName;

	@DatabaseField(columnName = "parent_id", canBeNull = true)
	private String parentId;
	@DatabaseField(columnName = "area_path", canBeNull = true)
	private String areaPath;
	@DatabaseField(columnName = "level", canBeNull = true)
	private int level;
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

 

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	 

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getAreaPath() {
		return areaPath;
	}

	public void setAreaPath(String areaPath) {
		this.areaPath = areaPath;
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
