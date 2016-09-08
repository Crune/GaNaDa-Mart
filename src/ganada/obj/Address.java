package ganada.obj;

public class Address {

	private String Post;//우편번호
	private String Address1; //시,군,
	private String Recipient; //받는사람
	private String Name;      //이름
	private String Phone;     //전화번호
	private String message;
	
	public String getPost() {
		return Post;
	}
	public void setPost(String post) {
		Post = post;
	}
	public String getAddress1() {
		return Address1;
	}
	public void setAddress1(String address1) {
		Address1 = address1;
	}
	
	
	public String getRecipient() {
		return Recipient;
	}
	public void setRecipient(String recipient) {
		Recipient = recipient;
	}
	public String getmessage() {
		return message;
	}
	public void setmessage(String message) {
		message = message;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}

}

