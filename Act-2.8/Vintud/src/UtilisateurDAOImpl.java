import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UtilisateurDAOImpl extends DAO {
	void createAccount (UserImpl user) {
		 try {
			 	ConnectionManager conManager = ConnectionManager.getlnstance();
	            Connection con = conManager.getConnection();
	            Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery("INSERT INTO users (id,first_name,last_name,pseudo,mail,u_password,phone,address,role_id) VALUES ("+user.getId()+",'"+user.getFirstname()+"','"+ user.getName() +"','"+user.getPseudo()+"','"+user.getMail()+"','"+user.getU_password()+"','"+user.getPhone()+"','"+user.getAddress()+"',"+user.getRole_id()+")");
	           
	            
	            con.close();
	        } catch (SQLException e) {
	        }
	}
	
	void updateAccount (UserImpl user) {
		 try {
			 ConnectionManager conManager = ConnectionManager.getlnstance();
	            Connection con = conManager.getConnection();
	            Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery("UPDATE users SET first_name ='"+user.getFirstname()+"',last_name ='"+user.getName()+"',pseudo ='"+user.getPseudo()+"',mail ='"+user.getMail()+"',u_password ='"+user.getU_password()+"',phone ='"+user.getPhone()+"',address ='"+user.getAddress()+"',role_id ="+user.getRole_id()+" WHERE id ="+user.getId()+";");
	           
	            
	            con.close();
	        } catch (SQLException e) {
	        }
	}
	boolean seConnecter (String email, String mdp) {
		boolean a = false;
		 try {
			 ConnectionManager conManager = ConnectionManager.getlnstance();
			    
	            Connection con = conManager.getConnection();
	            Statement stmt = con.createStatement();
	            
	            ResultSet res = stmt.executeQuery("SELECT*FROM users WHERE mail ='"+email+"' AND u_password='"+mdp+"'" );
	            if(res.next()) {
	            	System.out.println("vous êtes connecté");
	            	a=true;
	            }else {
	            	System.out.println("erreur d'entrée");
	            }
	            
	            con.close();
	            
	        } catch (SQLException e) {
	        }
		return (a);
	}
	void showVendor (int id) {
		 try {
			 ConnectionManager conManager = ConnectionManager.getlnstance();
	            Connection con = conManager.getConnection();
	            Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery("SELECT  * FROM users WHERE id ="+id);
	            while(res.next()) {
	            	String first_name = res.getString("first_name");
	            	String last_name = res.getString("last_name");
	            	String pseudo = res.getString("pseudo");
	            	String mail = res.getString("mail");
	            	String phone = res.getString("phone");
	            	String address = res.getString("address");
	                System.out.println("Prénom: "+ first_name+"; \nNom: "+last_name+"; \nPseudo: "+pseudo+"; \nEmail: "+mail+"; \nPhone: "+phone+"; \nAdresse: "+address+"\n\n");
	               
	            }
	            con.close();
	        } catch (SQLException e) {
	        }
	}

}
