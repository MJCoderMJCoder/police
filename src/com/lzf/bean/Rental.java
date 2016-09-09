package com.lzf.bean;

/**
 * ���ⷿ��
 */
public class Rental {

	private String landlord; // ��������
	private String landlordTel; // ������ϵ��ʽ
	private String address; // ���ⷿ��ַ
	private String type; // ���ⷿ����
	private String time; // ʼ��ʱ�䣨2016-08-28��
	private String grade; // ���ݵȼ�
	private String police; // ����Ͻ�����ɳ���)
	private String community; // ��������

	private String renter; // ������
	private String renterTel; // ��������ϵ��ʽ
	private String remark;

	public String getLandlord() {
		return landlord;
	}

	public void setLandlord(String landlord) {
		this.landlord = landlord;
	}

	public String getLandlordTel() {
		return landlordTel;
	}

	public void setLandlordTel(String landlordTel) {
		this.landlordTel = landlordTel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
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

	public String getRenter() {
		return renter;
	}

	public void setRenter(String renter) {
		this.renter = renter;
	}

	public String getRenterTel() {
		return renterTel;
	}

	public void setRenterTel(String renterTel) {
		this.renterTel = renterTel;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Rental() {
	}

	public Rental(String landlord, String landlordTel, String address, String type, String time, String grade,
			String police, String community, String renter, String renterTel, String remark) {
		super();
		this.landlord = landlord;
		this.landlordTel = landlordTel;
		this.address = address;
		this.type = type;
		this.time = time;
		this.grade = grade;
		this.police = police;
		this.community = community;
		this.renter = renter;
		this.renterTel = renterTel;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "����������" + landlord + ", ������ϵ��ʽ��" + landlordTel + ", ���ⷿ��ַ��" + address + ", ���ⷿ���ͣ�" + type + ", ʼ��ʱ�䣺"
				+ time + ", ���ݵȼ���" + grade + ", ����Ͻ����" + police + ", ����������" + community + ", �����ˣ�" + renter
				+ ", ��������ϵ��ʽ��" + renterTel + ", ��ע��" + remark;
	}

}
