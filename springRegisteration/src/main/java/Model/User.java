package Model;


public class User {
	private String fullName;
	private String userEmail;
	private String passWord;
	private String gender;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getGender() {
		return gender;
	}
	public User(String fullName, String userEmail, String passWord, String gender) {
		super();
		this.fullName = fullName;
		this.userEmail = userEmail;
		this.passWord = passWord;
		this.gender = gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Full Name : " + fullName + "\n"+ "Email : " + userEmail + "\n"+"Password : " + passWord + "\n"+"Gender : " +gender;
	}
	
}
