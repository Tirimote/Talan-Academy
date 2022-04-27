import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AnnonceDAOImpl extends DAO  {
	void showAds () {
		 try {
			 
			 ConnectionManager conManager = ConnectionManager.getlnstance();
	            Connection con = conManager.getConnection();
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
	
	void createAd (AnnouncementImpl ad) {
		 try {
			 ConnectionManager conManager = ConnectionManager.getlnstance();
	            Connection con = conManager.getConnection();
	            Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery("INSERT INTO announcement (id,title,description,category_id,price,picture,publication_date,is_available,view_number,localisation,user_id) VALUES ("+ad.getId()+",'"+ad.getTitle()+"','"+ ad.getDescription() +"','"+ad.getCategory_id()+"','"+ad.getPrice()+"','"+ad.getPicture()+"',DATE'"+ad.getPublication_date()+"',"+ad.isIs_available()+","+0+",'"+ad.getLocalisation()+"',"+ad.getUser_id()+")");
	           
	            
	            con.close();
	        } catch (SQLException e) {
	        }
	}
	
	void updateAd (AnnouncementImpl ad) {
		 try {
			 ConnectionManager conManager = ConnectionManager.getlnstance();
	            Connection con = conManager.getConnection();
	            Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery("UPDATE announcement SET title ='"+ad.getTitle()+"',description ='"+ad.getDescription()+"',price ="+ad.getPrice()+",picture ='"+ad.getPicture()+"',publication_date ='"+ad.getPublication_date()+"',is_available ="+ad.isIs_available()+",view_number ="+0+",localisation ='"+ad.getLocalisation()+"' WHERE id ="+ad.getId()+";");
	           
	            
	            con.close();
	        } catch (SQLException e) {
	        }
	}
	void deleteAd (int id) {
		 try {
			 ConnectionManager conManager = ConnectionManager.getlnstance();
	            Connection con = conManager.getConnection();
	            Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery("DELETE FROM announcement WHERE id ="+id);
	            con.close();
	        } catch (SQLException e) {
	        }
	}
	
	void showAdsBy (String nom, int cath, double prix) {
		 try {
			 
			 ConnectionManager conManager = ConnectionManager.getlnstance();
	            Connection con = conManager.getConnection();
	            Statement stmt = con.createStatement();
	            System.out.println("Resultats de la recherche par titre categorie et prix ");
	            ResultSet res = stmt.executeQuery("SELECT * FROM announcement WHERE title='"+nom+"' AND category_id="+cath+" AND price="+prix);
	 
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
	
	void filterAdsByPrice () {
		 try {
			 
			 ConnectionManager conManager = ConnectionManager.getlnstance();
	            Connection con = conManager.getConnection();
	            Statement stmt = con.createStatement();
	            System.out.println("Affichage annonces triées par prix: ");
	            ResultSet res = stmt.executeQuery("SELECT  * FROM announcement ORDER BY price");
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
	
	void filterAdsByLocalisation () {
		 try {
			 
			 ConnectionManager conManager = ConnectionManager.getlnstance();
	            Connection con = conManager.getConnection();
	            Statement stmt = con.createStatement();
	            System.out.println("Affichage annonces triées par localisation: ");
	            ResultSet res = stmt.executeQuery("SELECT  * FROM announcement ORDER BY localisation");
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
	
	void reserveAd (int id) {
		 try {
			 ConnectionManager conManager = ConnectionManager.getlnstance();
	            Connection con = conManager.getConnection();
	            Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery("UPDATE announcement SET id_statut = 4 WHERE id ="+id+"AND id_statut=2");
	            con.close();
	        } catch (SQLException e) {
	        }
	}
	
	void viewsNum (int id) {
		 try {
			 
			 ConnectionManager conManager = ConnectionManager.getlnstance();
	            Connection con = conManager.getConnection();
	            Statement stmt = con.createStatement();
	            System.out.println("Le nombre des visualisations de l'annonce: ");
	            ResultSet res = stmt.executeQuery("SELECT  view_number FROM announcement WHERE id="+id);
	            while(res.next()) {
	            	int view_number = res.getInt("view_number");
	            	
	                System.out.println("Views numb: "+ view_number);
	               
	            }
	            con.close();
	        } catch (SQLException e) {
	        }
	}
	
	

}
