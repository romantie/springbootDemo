package nuc.edu.chapter05_mybatis1_20201118.pojo;

import org.springframework.stereotype.Component;

@Component
public class User {
	private Integer id;
	private String userName;
	private String note;

	public User() {

	}

	public User(Integer id,String userName, String note) {
		super();
		this.id=id;
		this.userName = userName;
		this.note = note;
	}

	public String getUserName() {
		return userName;
	}

	public String getNote() {
		return note;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
