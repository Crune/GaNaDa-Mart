package ganada.obj;

import java.sql.Timestamp;

public class Account {
	private String name;
	private String email;
	private String id;
	private String passwd;
	private String passwd1;
	private String birthday;
	private String birthday1;
	private String birthday2;
	private Integer lunisolar;
	private String gender;
	private String contact;
	private String contact1;
	private String contact2;
	private String Phone;
	private String Phone1;
	private String Phone2;
	private String sms_check;
	private String passwd_phone;
	private Integer security;
	private Timestamp reg_date;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getPasswd1() {
		return passwd1;
	}
	public void setPasswd1(String passwd1) {
		this.passwd1 = passwd1;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getBirthday1() {
		return birthday1;
	}
	public void setBirthday1(String birthday1) {
		this.birthday1 = birthday1;
	}
	public String getBirthday2() {
		return birthday2;
	}
	public void setBirthday2(String birthday2) {
		this.birthday2 = birthday2;
	}
	public Integer getLunisolar() {
		return lunisolar;
	}
	public void setLunisolar(Integer lunisolar) {
		this.lunisolar = lunisolar;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getContact1() {
		return contact1;
	}
	public void setContact1(String contact1) {
		this.contact1 = contact1;
	}
	public String getContact2() {
		return contact2;
	}
	public void setContact2(String contact2) {
		this.contact2 = contact2;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getPhone1() {
		return Phone1;
	}
	public void setPhone1(String phone1) {
		Phone1 = phone1;
	}
	public String getPhone2() {
		return Phone2;
	}
	public void setPhone2(String phone2) {
		Phone2 = phone2;
	}
	public String getSms_check() {
		return sms_check;
	}
	public void setSms_check(String sms_check) {
		this.sms_check = sms_check;
	}
	public String getPasswd_phone() {
		return passwd_phone;
	}
	public void setPasswd_phone(String passwd_phone) {
		this.passwd_phone = passwd_phone;
	}
	public Integer getSecurity() {
		return security;
	}
	public void setSecurity(Integer security) {
		this.security = security;
	}
	public Timestamp getReg_date() {
	    return reg_date;
	}
	public void setReg_date(Timestamp reg_date) {
	    this.reg_date = reg_date;
	}
}
