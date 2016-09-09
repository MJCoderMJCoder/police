package com.lzf.bean;

/**
 * 小区类
 */
public class Community {
	private String name; // 小区名称
	private String police; // 派出所名称
	private String community; // 社区名称
	private int floors; // 楼层数
	private int unit; // 单元数
	private int households; // 户数
	private int peoples; // 人数
	private String monitor; // 有无监控
	private String tenement; // 物业公司
	private String tenementTel; // 物业联系电话
	private String address; // 地址
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
		return "小区名称：" + name + ", 派出所名称：" + police + ", 社区名称：" + community + ", 楼层数：" + floors + ", 单元数：" + unit
				+ ", 户数：" + households + ", 小区人数：" + peoples + ", 有无监控：" + monitor + ", 物业公司：" + tenement + ", 物业联系方式："
				+ tenementTel + ", 地址：" + address + ", 备注：" + remark;
	}
}
