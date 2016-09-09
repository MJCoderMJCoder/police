package com.lzf.bean;

/**
 * 场所类
 */
public class Site {
	private String type; // 场所类型（单位性质）
	private String name; // 场所名称（单位名称）
	private int amount; // 单位人数
	private String scope; // 经营范围
	private String contact; // 单位联系方式
	private int area; // 经营面积
	private String criticalPart; // 要害部位数
	private String fire; // 消防设施
	private int defend; // 保卫人数
	private String flowPeople; // 是否雇佣流动人口
	private String strike; // 是否受过打击处理
	private int monitor; // 视频监控数
	private String legalPerson; // 法人代表
	private String legalPersonTel; // 法人代表联系方式
	private String legalPersonSite; // 法人详细地址
	private String defendPrincipal; // 保卫负责人
	private String defendPrincipalTel; // 保卫负责人联系方式
	private String dangerName; // 存放危险物品名称
	private int dangerAmount; // 危险物品数量
	private String dangerUse; // 存放危险物品用途
	private String dangerSite; // 存放危险物品地点
	private String remark;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getCriticalPart() {
		return criticalPart;
	}

	public void setCriticalPart(String criticalPart) {
		this.criticalPart = criticalPart;
	}

	public String getFire() {
		return fire;
	}

	public void setFire(String fire) {
		this.fire = fire;
	}

	public int getDefend() {
		return defend;
	}

	public void setDefend(int defend) {
		this.defend = defend;
	}

	public String getFlowPeople() {
		return flowPeople;
	}

	public void setFlowPeople(String flowPeople) {
		this.flowPeople = flowPeople;
	}

	public String getStrike() {
		return strike;
	}

	public void setStrike(String strike) {
		this.strike = strike;
	}

	public int getMonitor() {
		return monitor;
	}

	public void setMonitor(int monitor) {
		this.monitor = monitor;
	}

	public String getLegalPerson() {
		return legalPerson;
	}

	public void setLegalPerson(String legalPerson) {
		this.legalPerson = legalPerson;
	}

	public String getLegalPersonTel() {
		return legalPersonTel;
	}

	public void setLegalPersonTel(String legalPersonTel) {
		this.legalPersonTel = legalPersonTel;
	}

	public String getLegalPersonSite() {
		return legalPersonSite;
	}

	public void setLegalPersonSite(String legalPersonSite) {
		this.legalPersonSite = legalPersonSite;
	}

	public String getDefendPrincipal() {
		return defendPrincipal;
	}

	public void setDefendPrincipal(String defendPrincipal) {
		this.defendPrincipal = defendPrincipal;
	}

	public String getDefendPrincipalTel() {
		return defendPrincipalTel;
	}

	public void setDefendPrincipalTel(String defendPrincipalTel) {
		this.defendPrincipalTel = defendPrincipalTel;
	}

	public String getDangerName() {
		return dangerName;
	}

	public void setDangerName(String dangerName) {
		this.dangerName = dangerName;
	}

	public int getDangerAmount() {
		return dangerAmount;
	}

	public void setDangerAmount(int dangerAmount) {
		this.dangerAmount = dangerAmount;
	}

	public String getDangerUse() {
		return dangerUse;
	}

	public void setDangerUse(String dangerUse) {
		this.dangerUse = dangerUse;
	}

	public String getDangerSite() {
		return dangerSite;
	}

	public void setDangerSite(String dangerSite) {
		this.dangerSite = dangerSite;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Site() {
	}

	public Site(String type, String name, int amount, String scope, String contact, int area, String criticalPart,
			String fire, int defend, String flowPeople, String strike, int monitor, String legalPerson,
			String legalPersonTel, String legalPersonSite, String defendPrincipal, String defendPrincipalTel,
			String dangerName, int dangerAmount, String dangerUse, String dangerSite, String remark) {
		super();
		this.type = type;
		this.name = name;
		this.amount = amount;
		this.scope = scope;
		this.contact = contact;
		this.area = area;
		this.criticalPart = criticalPart;
		this.fire = fire;
		this.defend = defend;
		this.flowPeople = flowPeople;
		this.strike = strike;
		this.monitor = monitor;
		this.legalPerson = legalPerson;
		this.legalPersonTel = legalPersonTel;
		this.legalPersonSite = legalPersonSite;
		this.defendPrincipal = defendPrincipal;
		this.defendPrincipalTel = defendPrincipalTel;
		this.dangerName = dangerName;
		this.dangerAmount = dangerAmount;
		this.dangerUse = dangerUse;
		this.dangerSite = dangerSite;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "场所类型：" + type + ", 单位名称：" + name + ", 单位人数" + amount + ", 经营范围：" + scope + ", 单位联系方式：" + contact
				+ ", 经营面积：" + area + ", 要害部位数：" + criticalPart + ", 消防设施：" + fire + ", 保卫人数：" + defend + ", 是否雇佣流动人口："
				+ flowPeople + ", 是否受过打击处理：" + strike + ", 视频监控：" + monitor + ", 法人代表：" + legalPerson + ", 法人代表联系方式："
				+ legalPersonTel + ", 法人详细地址：" + legalPersonSite + ", 保卫负责人：" + defendPrincipal + ", 保卫负责人联系方式："
				+ defendPrincipalTel + ", 存放危险物名称：" + dangerName + ", 存放危险物品数量：" + dangerAmount + ", 存放危险物品用途："
				+ dangerUse + ", 存放危险物品地点：" + dangerSite + ", 备注：" + remark;
	}

}
