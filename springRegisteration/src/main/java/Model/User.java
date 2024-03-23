package Model;


import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;


@Entity
public class User {

	@Id
	@Column(name="username")
	private String userid;
	@Column(name="name")
	private String fullName;
	@Column(name="email")
	private String userEmail;
	private String passWord;
	private String dateOfBirth;
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name="usercourses")
	@Column(name="courses")
	private List<String> coursestick;
	private String gender;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getuserEmail() {
		return userEmail;
	}
	public void setuserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public List<String> getCoursestick() {
		return coursestick;
	}
	public void setCoursestick(List<String> coursestick) {
		this.coursestick = coursestick;
	}
	public String getGender() {
		return gender;
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
		return "User [userid=" + userid + ", fullName=" + fullName + ", email=" + userEmail + ", passWord=" + passWord
				+ ", dateOfBirth=" + dateOfBirth + ", courses=" + coursestick + ", gender=" + gender
				 + "]";
	}
	
	
	
	
	
}
