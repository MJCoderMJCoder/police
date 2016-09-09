package com.lzf.bean;

/**
 * С����
 */
public class Community {
	private String name; // С������
	private String police; // �ɳ�������
	private String community; // ��������
	private int floors; // ¥����
	private int unit; // ��Ԫ��
	private int households; // ����
	private int peoples; // ����
	private String monitor; // ���޼��
	private String tenement; // ��ҵ��˾
	private String tenementTel; // ��ҵ��ϵ�绰
	private String address; // ��ַ
	private String remark;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPolice() {
		return police;
	}

	public void setPolice(String police) {
		this.police = police;
	}

	public String getCommunity() {
		return community;
	}

	public void setCommunity(String community) {
		this.community = community;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public int getHouseholds() {
		return households;
	}

	public void setHouseholds(int households) {
		this.households = households;
	}

	public int getPeoples() {
		return peoples;
	}

	public void setPeoples(int peoples) {
		this.peoples = peoples;
	}

	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}

	public String getTenement() {
		return tenement;
	}

	public void setTenement(String tenement) {
		this.tenement = tenement;
	}

	public String getTenementTel() {
		return tenementTel;
	}

	public void setTenementTel(String tenementTel) {
		this.tenementTel = tenementTel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Community() {
	}

	public Community(String name, String police, String community, int floors, int unit, int households, int peoples,
			String monitor, String tenement, String tenementTel, String address, String remark) {
		super();
		this.name = name;
		this.police = police;
		this.community = community;
		this.floors = floors;
		this.unit = unit;
		this.households = households;
		this.peoples = peoples;
		this.monitor = monitor;
		this.tenement = tenement;
		this.tenementTel = tenementTel;
		this.address = address;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "С�����ƣ�" + name + ", �ɳ������ƣ�" + police + ", �������ƣ�" + community + ", ¥������" + floors + ", ��Ԫ����" + unit
				+ ", ������" + households + ", С��������" + peoples + ", ���޼�أ�" + monitor + ", ��ҵ��˾��" + tenement + ", ��ҵ��ϵ��ʽ��"
				+ tenementTel + ", ��ַ��" + address + ", ��ע��" + remark;
	}
}
