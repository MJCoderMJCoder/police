package com.lzf.bean;

/**
 * ������
 */
public class Site {
	private String type; // �������ͣ���λ���ʣ�
	private String name; // �������ƣ���λ���ƣ�
	private int amount; // ��λ����
	private String scope; // ��Ӫ��Χ
	private String contact; // ��λ��ϵ��ʽ
	private int area; // ��Ӫ���
	private String criticalPart; // Ҫ����λ��
	private String fire; // ������ʩ
	private int defend; // ��������
	private String flowPeople; // �Ƿ��Ӷ�����˿�
	private String strike; // �Ƿ��ܹ��������
	private int monitor; // ��Ƶ�����
	private String legalPerson; // ���˴���
	private String legalPersonTel; // ���˴�����ϵ��ʽ
	private String legalPersonSite; // ������ϸ��ַ
	private String defendPrincipal; // ����������
	private String defendPrincipalTel; // ������������ϵ��ʽ
	private String dangerName; // ���Σ����Ʒ����
	private int dangerAmount; // Σ����Ʒ����
	private String dangerUse; // ���Σ����Ʒ��;
	private String dangerSite; // ���Σ����Ʒ�ص�
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
		return "�������ͣ�" + type + ", ��λ���ƣ�" + name + ", ��λ����" + amount + ", ��Ӫ��Χ��" + scope + ", ��λ��ϵ��ʽ��" + contact
				+ ", ��Ӫ�����" + area + ", Ҫ����λ����" + criticalPart + ", ������ʩ��" + fire + ", ����������" + defend + ", �Ƿ��Ӷ�����˿ڣ�"
				+ flowPeople + ", �Ƿ��ܹ��������" + strike + ", ��Ƶ��أ�" + monitor + ", ���˴���" + legalPerson + ", ���˴�����ϵ��ʽ��"
				+ legalPersonTel + ", ������ϸ��ַ��" + legalPersonSite + ", ���������ˣ�" + defendPrincipal + ", ������������ϵ��ʽ��"
				+ defendPrincipalTel + ", ���Σ�������ƣ�" + dangerName + ", ���Σ����Ʒ������" + dangerAmount + ", ���Σ����Ʒ��;��"
				+ dangerUse + ", ���Σ����Ʒ�ص㣺" + dangerSite + ", ��ע��" + remark;
	}

}
