package com.lzf.bean;

public class Tasks {
	private String name; // ����
	private String type; // ��������
	private int inspect; // Ӧ���
	private int inspected; // �Ѽ��
	private String time; // ����ʱ��
	private String taskType; // ��������
	private String remark;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

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

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Tasks() {
	}

	public Tasks(String name, String type, int inspect, int inspected, String time, String taskType, String remark) {
		super();
		this.name = name;
		this.type = type;
		this.inspect = inspect;
		this.inspected = inspected;
		this.time = time;
		this.taskType = taskType;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "���ƣ�" + name + ", �������ͣ�" + type + ", Ӧ���" + inspect + ", �Ѽ�飺" + inspected + ", ����ʱ�䣺" + time + ", �������ͣ�"
				+ taskType + ", ��ע��" + remark;
	}

}
