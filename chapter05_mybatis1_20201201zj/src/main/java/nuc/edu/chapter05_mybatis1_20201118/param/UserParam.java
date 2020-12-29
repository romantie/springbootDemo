package nuc.edu.chapter05_mybatis1_20201118.param;

import org.springframework.stereotype.Component;

@Component
public class UserParam {
	private String userName;
	private String note;

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

}
