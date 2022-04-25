import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AnnouncementManager {
	
	void createAccount (UserImpl user) {
		 try {
	            Connection con = ConnectionManager.getConnection();
	            Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery("INSERT INTO users (id,first_name,last_name,pseudo,mail,u_password,phone,address,role_id) VALUES ("+user.getId()+",'"+user.getFirstname()+"','"+ user.getName() +"','"+user.getPseudo()+"','"+user.getMail()+"','"+user.getU_password()+"','"+user.getPhone()+"','"+user.getAddress()+"',"+user.getRole_id()+")");
	           
	            
	            con.close();
	        } catch (SQLException e) {
	        }
	}
	
	void updateAccount (UserImpl user) {
		 try {
	            Connection con = ConnectionManager.getConnection();
	            Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery("UPDATE users SET first_name ='"+user.getFirstname()+"',last_name ='"+user.getName()+"',pseudo ='"+user.getPseudo()+"',mail ='"+user.getMail()+"',u_password ='"+user.getU_password()+"',phone ='"+user.getPhone()+"',address ='"+user.getAddress()+"',role_id ="+user.getRole_id()+" WHERE id ="+user.getId()+";");
	           
	            
	            con.close();
	        } catch (SQLException e) {
	        }
	}
	
	void showAds () {
		 try {
	            Connection con = ConnectionManager.getConnection();
	            Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery("SELECT  * FROM announcement");
	            while(res.next()) {
	            	String titre = res.getString("title");
	            	String description = res.getString("description");
	            	double price = res.getDouble("price");
	            	String publication_date = res.getString("publication_date");
	            	String view_number = res.getString("view_number");
	            	String is_available = res.getString("is_available");
	            	String localisation = res.getString("localisation");
	                System.out.println("Titre: "+ titre+"; \nDescription: "+description+"; \nPrix: "+price+"; \nDate de pub: "+publication_date+"; \nNombre de vu: "+view_number+"; \nDisponibilité: "+is_available+"; \nLocalisation: "+localisation+"\n\n");
	               
	            }
	            con.close();
	        } catch (SQLException e) {
	        }
	}
	
	boolean seConnecter (String email, String mdp) {
		boolean a = false;
		 try {
			    
	            Connection con = ConnectionManager.getConnection();
	            Statement stmt = con.createStatement();
	            System.out.println("FROM*SELECT users WHERE mail ='"+email+"' AND u_password='"+mdp+"'" );
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
	            Connection con = ConnectionManager.getConnection();
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
	void createAd (AnnouncementImpl ad) {
		 try {
	            Connection con = ConnectionManager.getConnection();
	            Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery("INSERT INTO announcement (id,title,description,category_id,price,picture,publication_date,is_available,view_number,localisation,user_id) VALUES ("+ad.getId()+",'"+ad.getTitle()+"','"+ ad.getDescription() +"','"+ad.getCategory_id()+"','"+ad.getPrice()+"','"+ad.getPicture()+"',DATE'"+ad.getPublication_date()+"',"+ad.isIs_available()+","+0+",'"+ad.getLocalisation()+"',"+ad.getUser_id()+")");
	           
	            
	            con.close();
	        } catch (SQLException e) {
	        }
	}
	
	void updateAd (AnnouncementImpl ad) {
		 try {
	            Connection con = ConnectionManager.getConnection();
	            Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery("UPDATE announcement SET title ='"+ad.getTitle()+"',description ='"+ad.getDescription()+"',price ="+ad.getPrice()+",picture ='"+ad.getPicture()+"',publication_date ='"+ad.getPublication_date()+"',is_available ="+ad.isIs_available()+",view_number ="+0+",localisation ='"+ad.getLocalisation()+"' WHERE id ="+ad.getId()+";");
	           
	            
	            con.close();
	        } catch (SQLException e) {
	        }
	}
	void deleteAd (int id) {
		 try {
	            Connection con = ConnectionManager.getConnection();
	            Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery("DELETE FROM announcement WHERE id ="+id);
	            con.close();
	        } catch (SQLException e) {
	        }
	}
	


}
