package main.DTO;

import java.util.Date;

public class MemberDTO {

	private Long id;
	private String email;
	private String password;
	private String name;
	private Date registerDate;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public void changePassword(String oldPwd , String newPwd) {
		if (password.equals(oldPwd)) {
			password = newPwd;
			System.out.println("비밀번호가 변경되었습니다");
		}else {
			System.out.println("비밀번호가 다릅니다.");
		}
	}
	
	
}
