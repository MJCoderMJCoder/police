package com.lzf.bean;

/**
 * 出租房类
 */
public class Rental {

	private String landlord; // 房东姓名
	private String landlordTel; // 房东联系方式
	private String address; // 出租房地址
	private String type; // 出租房类型
	private String time; // 始租时间（2016-08-28）
	private String grade; // 房屋等级
	private String police; // 所属辖区（派出所)
	private String community; // 所属社区

	private String renter; // 承租人
	private String renterTel; // 承租人联系方式
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
		return "房东姓名：" + landlord + ", 房东联系方式：" + landlordTel + ", 出租房地址：" + address + ", 出租房类型：" + type + ", 始租时间："
				+ time + ", 房屋等级：" + grade + ", 所属辖区：" + police + ", 所属社区：" + community + ", 承租人：" + renter
				+ ", 承租人联系方式：" + renterTel + ", 备注：" + remark;
	}

}
