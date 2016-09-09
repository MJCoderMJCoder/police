package com.lzf.bean;

/**
 * 工作日志类
 */
public class WorkLog {
	private String time; // 2016-08-26
	private String worklog;
	private String remark;

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getWorklog() {
		return worklog;
	}

	public void setWorklog(String worklog) {
		this.worklog = worklog;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public WorkLog() {
	}

	public WorkLog(String time, String worklog, String remark) {
		super();
		this.time = time;
		this.worklog = worklog;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "日期：" + time + ", 工作日志：" + worklog + ", 备注：" + remark;
	}

}
