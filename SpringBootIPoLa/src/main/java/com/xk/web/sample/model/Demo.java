package com.xk.web.sample.model;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 這是一個，測試實體類。
 * 
 * @author yuan
 * @version v.0.1
 * @date 2017.09.13
 */
public class Demo {

	private int id;
	private String account;
	private String password;
	private String name;
	private Integer status;

	// com.alibaba.fastjson.annotation.JSONField
	@JSONField(format = "yyyy-MM-dd HH:mm")
	private Date createTime; // 創建時間

	/**
	 * 不想輸出 remark ? serialize 是否要序列化屬性
	 */
	@JSONField(serialize = false)
	private String remark; // 備註訊息

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
