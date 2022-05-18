package Vintud.Vintud.Spring;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")

public class UserImpl implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	
	@Column(name="first_name")
	String firstname;
	@Column(name="last_name")
	String name;
	@Column(name="pseudo")
	String pseudo;
	@Column(name="mail")
	String mail;
	@Column(name="u_password")
	String u_password;
	@Column(name="phone")
	String phone;
	@Column(name="address")
	String address;
	@Column(name="role_id")
	long role_id;
	
	
	
	UserImpl(String firstname,String name, String pseudo, String mail, String u_password , String phone, String address,int role_id){
		
		setFirstname(firstname);
		setName(name);
		setPseudo(pseudo);
		setMail(mail);
		setU_password(u_password);
		setRole_id(role_id);
		setPhone(phone);
		setAddress(address);
	}
	
	UserImpl(){
		
	}
	
	
	
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public long getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	
	
	
	
	

}
