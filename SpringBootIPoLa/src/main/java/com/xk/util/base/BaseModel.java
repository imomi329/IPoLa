package com.xk.util.base;

/**
 * 基本類模型
 * 
 * @author yuan
 * @version v.0.1
 * @date 2017.09.23
 */
public class BaseModel {

	private boolean success; // 處理狀態
	private String code; // 處理代碼
	private String message; // 處理訊息
	private Object data; // 資料類存放

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	// public void setMessage(String message) {
	// this.message = message;
	// }

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
