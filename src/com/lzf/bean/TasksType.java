package com.lzf.bean;

public class TasksType {
	private int inspect; // Ӧ���
	private int inspected; // �Ѽ��
	private int time; // ����ʱ��
	private String taskType; // ��������

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
		return "Ӧ���" + inspect + ", �Ѽ�飺" + inspected + ", ����ʱ�䣺" + time + ", �������ͣ�" + taskType;
	}

}
