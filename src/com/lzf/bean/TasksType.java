package com.lzf.bean;

public class TasksType {
	private int inspect; // 应检查
	private int inspected; // 已检查
	private int time; // 任务时间
	private String taskType; // 任务类型

	public int getInspect() {
		return inspect;
	}

	public void setInspect(int inspect) {
		this.inspect = inspect;
	}

	public int getInspected() {
		return inspected;
	}

	public void setInspected(int inspected) {
		this.inspected = inspected;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public TasksType() {
	}

	public TasksType(int inspect, int inspected, int time, String taskType) {
		super();
		this.inspect = inspect;
		this.inspected = inspected;
		this.time = time;
		this.taskType = taskType;
	}

	@Override
	public String toString() {
		return "应检查" + inspect + ", 已检查：" + inspected + ", 任务时间：" + time + ", 任务类型：" + taskType;
	}

}
