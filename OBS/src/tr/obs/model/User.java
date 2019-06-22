package tr.obs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_user")
public class User extends BaseModel{
	
	@Column(length=20,unique=true) // ayn� kullan�c� ad�nda kayded�lemez dupl�cate yok!
	private String userName;
	
	@Column(length=8)
	private String password; // password md5 g�re hashleyecez sha-1

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// ROLES
	
	
	
}
