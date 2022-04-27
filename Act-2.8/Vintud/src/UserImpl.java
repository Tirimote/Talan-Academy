
public class UserImpl implements User {
	int 
	id,role_id;
	
	String firstname,
	name,
	pseudo,
	mail,
	u_password,
	phone,
	address;
	
	UserImpl(int id, String firstname,String name, String pseudo, String mail, String u_password , String phone, String address,int role_id){
		setId(id);
		setFirstname(firstname);
		setName(name);
		setPseudo(pseudo);
		setMail(mail);
		setU_password(u_password);
		setRole_id(role_id);
		setPhone(phone);
		setAddress(address);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getU_password() {
		return u_password;
	}

	public void setU_password(String u_password) {
		this.u_password = u_password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
