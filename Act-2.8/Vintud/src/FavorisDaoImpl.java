import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FavorisDaoImpl extends DAO {
	void createFav (Favoris fav) {
		 try {
			 ConnectionManager conManager = ConnectionManager.getlnstance();
	            Connection con = conManager.getConnection();
	            Statement stmt = con.createStatement();
	            System.out.println();
	            ResultSet res = stmt.executeQuery("INSERT INTO favoris VALUES ("+fav.getId()+",'"+fav.getDate()+"',"+fav.getUser_id()+","+fav.getAd_id()+")");
	           
	            
	            con.close();
	        } catch (SQLException e) {
	        }
	}
	
	void deleteFav (int id) {
		 try {
			 ConnectionManager conManager = ConnectionManager.getlnstance();
	            Connection con = conManager.getConnection();
	            Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery("DELETE FROM favoris WHERE id ="+id);
	            con.close();
	        } catch (SQLException e) {
	        }
	}
	void showFav (int id) {
		 try {
			 
			 ConnectionManager conManager = ConnectionManager.getlnstance();
	            Connection con = conManager.getConnection();
	            Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery("SELECT  * FROM announcement WHERE id="+id);
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
	void updateFav (Favoris fav) {
		 try {
			 ConnectionManager conManager = ConnectionManager.getlnstance();
	            Connection con = conManager.getConnection();
	            Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery("UPDATE favoris SET date_dajout ='"+fav.getDate()+"',user_id="+fav.getUser_id()+",announcement_id="+fav.getAd_id()+" WHERE id ="+fav.getId());
	           
	            
	            con.close();
	        } catch (SQLException e) {
	        }
	}



}
