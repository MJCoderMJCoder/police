package com.lzf.bean;

/**
 * 人口类
 */
public class Population {
	private String name; // 姓名
	private String idcard; // 身份证号
	private String type; // 人口类别
	private String gender; // 性别
	private String birthday; // 出生日期（1959-02-03）
	private String nation; // 民族
	private String relation; // 与户主关系
	private String masterName; // 户主姓名
	private String masterId; // 户主身份证号
	private String birthplace; // 出生地
	private String citizenship; // 籍贯
	private String censusRegister; // 户口所在地址
	private String censusRegisterP; // 户口所在地派出所
	private String liveAddress; // 居住地址
	private String liveAddressP; // 居住地派出所
	private String diploma; // 文凭
	private String blood; // 血型
	private String escuage; // 兵役情况
	private String faith; // 宗教信仰
	private int height; // 身高
	private String jobs; // 职业
	private String marriage; // 婚姻状况
	private String politics; // 政治面貌
	private String spouseName; // 配偶姓名
	private String spouseId; // 配偶身份证号
	private String moveTime; // 何时由何地签来本市
	private String phone; // 移动电话
	private String tel; // 固定电话
	private String remark;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getMasterName() {
		return masterName;
	}

	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}

	public String getMasterId() {
		return masterId;
	}

	public void setMasterId(String masterId) {
		this.masterId = masterId;
	}

	public String getBirthplace() {
		return birthplace;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	public String getCensusRegister() {
		return censusRegister;
	}

	public void setCensusRegister(String censusRegister) {
		this.censusRegister = censusRegister;
	}

	public String getCensusRegisterP() {
		return censusRegisterP;
	}

	public void setCensusRegisterP(String censusRegisterP) {
		this.censusRegisterP = censusRegisterP;
	}

	public String getLiveAddress() {
		return liveAddress;
	}

	public void setLiveAddress(String liveAddress) {
		this.liveAddress = liveAddress;
	}

	public String getLiveAddressP() {
		return liveAddressP;
	}

	public void setLiveAddressP(String liveAddressP) {
		this.liveAddressP = liveAddressP;
	}

	public String getDiploma() {
		return diploma;
	}

	public void setDiploma(String diploma) {
		this.diploma = diploma;
	}

	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	public String getEscuage() {
		return escuage;
	}

	public void setEscuage(String escuage) {
		this.escuage = escuage;
	}

	public String getFaith() {
		return faith;
	}

	public void setFaith(String faith) {
		this.faith = faith;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getJobs() {
		return jobs;
	}

	public void setJobs(String jobs) {
		this.jobs = jobs;
	}

	public String getMarriage() {
		return marriage;
	}

	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}

	public String getPolitics() {
		return politics;
	}

	public void setPolitics(String politics) {
		this.politics = politics;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public String getSpouseId() {
		return spouseId;
	}

	public void setSpouseId(String spouseId) {
		this.spouseId = spouseId;
	}

	public String getMoveTime() {
		return moveTime;
	}

	public void setMoveTime(String moveTime) {
		this.moveTime = moveTime;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Population() {
	}

	public Population(String name, String idcard, String type, String gender, String birthday, String nation,
			String relation, String masterName, String masterId, String birthplace, String citizenship,
			String censusRegister, String censusRegisterP, String liveAddress, String liveAddressP, String diploma,
			String blood, String escuage, String faith, int height, String jobs, String marriage, String politics,
			String spouseName, String spouseId, String moveTime, String phone, String tel, String remark) {
		super();
		this.name = name;
		this.idcard = idcard;
		this.type = type;
		this.gender = gender;
		this.birthday = birthday;
		this.nation = nation;
		this.relation = relation;
		this.masterName = masterName;
		this.masterId = masterId;
		this.birthplace = birthplace;
		this.citizenship = citizenship;
		this.censusRegister = censusRegister;
		this.censusRegisterP = censusRegisterP;
		this.liveAddress = liveAddress;
		this.liveAddressP = liveAddressP;
		this.diploma = diploma;
		this.blood = blood;
		this.escuage = escuage;
		this.faith = faith;
		this.height = height;
		this.jobs = jobs;
		this.marriage = marriage;
		this.politics = politics;
		this.spouseName = spouseName;
		this.spouseId = spouseId;
		this.moveTime = moveTime;
		this.phone = phone;
		this.tel = tel;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "姓名：" + name + ", 身份证号：" + idcard + ", 人口类别：" + type + ", 性别：" + gender + ", 出生日期：" + birthday + ", 民族："
				+ nation + ", 与户主关系：" + relation + ", 户主姓名：" + masterName + ", 户主身份证号：" + masterId + ", 出生地："
				+ birthplace + ", 籍贯：" + citizenship + ", 户口所在地址：=" + censusRegister + ", 户口所在地派出所：" + censusRegisterP
				+ ", 实际居住地址：" + liveAddress + ", 实际居住地派出所：" + liveAddressP + ", 文凭：" + diploma + ", 血型：" + blood
				+ ", 兵役情况：" + escuage + ", 宗教信仰：" + faith + ", 身高：" + height + ", 职业：" + jobs + ", 婚姻状况：" + marriage
				+ ", 政治面貌：" + politics + ", 配偶姓名：" + spouseName + ", 配偶身份证号：" + spouseId + ", 何时由何地迁来本市：" + moveTime
				+ ", 移动电话：" + phone + ", 固定电话：" + tel + ", 备注：" + remark;
	}

}
