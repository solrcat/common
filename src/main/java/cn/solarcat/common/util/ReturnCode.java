package cn.solarcat.common.util;

public enum ReturnCode {
	/**
	 * 操作成功
	 */
	C200(200, "操作成功"),
	/**
	 * 暂无查询结果
	 */
	C250(250, "暂无查询结果"),
	/**
	 * 数据库更新失败
	 */
	C300(300, "数据库更新失败"),
	/**
	 * 数据库删除失败
	 */
	C301(301, "数据库删除失败");
	private final int status;
	private final String message;

	private ReturnCode(int status, String message) {
		this.status = status;
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}
}
