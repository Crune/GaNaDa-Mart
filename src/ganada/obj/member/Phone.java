package ganada.obj.member;

public class Phone {
    
    private String code;
    private String nation;
    private String num1;
    private String num2;
    private String num3;
    private String info;
    
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getNation() {
        return nation;
    }
    public void setNation(String nation) {
        this.nation = nation;
    }
    public String getNum1() {
        return num1;
    }
    public void setNum1(String num1) {
        this.num1 = num1;
    }
    public String getNum2() {
        return num2;
    }
    public void setNum2(String num2) {
        this.num2 = num2;
    }
    public String getNum3() {
        return num3;
    }
    public void setNum3(String num3) {
        this.num3 = num3;
    }
    
    public void setNumber(String str) {
        setNum1(str.split("-")[0]);
        setNum2(str.split("-")[1]);
        setNum3(str.split("-")[2]);
    }
    public String getNumber() {
        return getNum1()+"-"+getNum2()+"-"+getNum3();
    }
    
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }

}
/*
INSERT INTO PHONE ( CODE,NUM1,NUM2,NUM3 )
VALUES ( PHONE_SEQ.NEXTVAL,  '010', '9165', '0415')
*/