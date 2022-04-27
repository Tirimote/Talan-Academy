import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RechercheDaoImpl extends DAO {
	
	void createRech (Recherche rech) {
		 try {
			 ConnectionManager conManager = ConnectionManager.getlnstance();
	            Connection con = conManager.getConnection();
	            Statement stmt = con.createStatement();
	            System.out.println();
	            ResultSet res = stmt.executeQuery("INSERT INTO recherche VALUES ("+rech.getId()+",'"+rech.getType()+"','"+ rech.getTaille() +"','"+rech.getCouleur()+"',"+ rech.getMaxPrix()+","+ rech.getMinPrix() +","+rech.getUser_id()+")");
	           
	            
	            con.close();
	        } catch (SQLException e) {
	        }
	}
	
	void deleteRech(int id) {
		 try {
			 ConnectionManager conManager = ConnectionManager.getlnstance();
	            Connection con = conManager.getConnection();
	            Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery("DELETE FROM recherche WHERE id ="+id);
	            con.close();
	        } catch (SQLException e) {
	        }
	}
	
	void useRech (int id) {
		 try {
			 
			 ConnectionManager conManager = ConnectionManager.getlnstance();
	            Connection con = conManager.getConnection();
	            Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery("SELECT  * FROM recherche WHERE id="+id);
	            while(res.next()) {
	            	String type = res.getString("type");
	            	String taille = res.getString("taille");
	            	String couleur = res.getString("couleur");
	            	int maxPrix = res.getInt("prix_max");
	            	int minPrix = res.getInt("prix_min");
	            
	                System.out.println("Type: "+ type+"; \nTaille: "+taille+"; \nCouleur: "+couleur+"; \nPrix max: "+maxPrix+"; \nPrix min: "+minPrix+"\n\n");
	               
	            }
	            con.close();
	        } catch (SQLException e) {
	        }
	}
	
	void updateRech (Recherche rech) {
		 try {
			 ConnectionManager conManager = ConnectionManager.getlnstance();
	            Connection con = conManager.getConnection();
	            Statement stmt = con.createStatement();
	            System.out.println();
	            ResultSet res = stmt.executeQuery("UPDATE recherche SET type='"+rech.getType()+"',taille='"+ rech.getTaille() +"',couleur='"+rech.getCouleur()+"',prix_max="+ rech.getMaxPrix()+", prix_min="+ rech.getMinPrix() +",user_id="+rech.getUser_id()+"WHERE id="+rech.getId());
	           
	            
	            con.close();
	        } catch (SQLException e) {
	        }
	}

}
