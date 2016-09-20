package ganada.obj.member;

import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import ganada.core.DB;

public class Account {
    
	private String code;
	private String name;
    private String info;
    
	private String email;
	private String id;
	private String passwd;	
	
	private Timestamp birthday;
	
	private int lunisolar;
    public final static int LS_LUNAR = -1;
    public final static int LS_SOLAR = 1;
	
	private int gender;
    public final static int GENDER_MALE = 1;
    public final static int GENDER_FAMALE = -1;
    public final static int GENDER_ETC = 0;
	
	private String contact_call_code;
    private String phone_call_code;
	private boolean sms_allow;
	
	private double mile;
		
	private int info_store_term;
	private Timestamp reg_date;
	private Timestamp mod_date;
	
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
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
        try {
            this.passwd = DB.getEncSHA256(passwd);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
    public Timestamp getBirthday() {
        return birthday;
    }
    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }
    public void setBirthday(String birthday) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            dateFormat.parse(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar cal = dateFormat.getCalendar();        
        setBirthday(new Timestamp(cal.getTime().getTime()));
    }
    public int getLunisolar() {
        return lunisolar;
    }
    public void setLunisolar(int LUNARorSOLAR) {
        this.lunisolar = LUNARorSOLAR;
    }
    public int getGender() {
        return gender;
    }
    public void setGender(int gender) {
        this.gender = gender;
    }
    public String getContact_call_code() {
        return contact_call_code;
    }
    public void setContact_call_code(String contact_call_code) {
        this.contact_call_code = contact_call_code;
    }
    public String getPhone_call_code() {
        return phone_call_code;
    }
    public void setPhone_call_code(String phone_call_code) {
        this.phone_call_code = phone_call_code;
    }
    public int getSms_allow() {
        if (sms_allow) return 1;
        else return 0;
    }
    public void setSms_allow(int trueIsOne) {
        this.sms_allow = (trueIsOne==1)?true:false;
    }
    public double getMile() {
        return mile;
    }
    public void setMile(double mile) {
        this.mile = mile;
    }
    public int getInfo_store_term() {
        return info_store_term;
    }
    public void setInfo_store_term(int info_store_term) {
        this.info_store_term = info_store_term;
    }
    public Timestamp getReg_date() {
        return reg_date;
    }
    public void setReg_date(Timestamp reg_date) {
        this.reg_date = reg_date;
    }
    public Timestamp getMod_date() {
        return mod_date;
    }
    public void setMod_date(Timestamp mod_date) {
        this.mod_date = mod_date;
    }
	
	
}
	

	