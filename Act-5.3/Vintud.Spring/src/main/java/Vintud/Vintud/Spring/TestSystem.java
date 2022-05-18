package Vintud.Vintud.Spring;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class TestSystem {
	private static EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("Vintud");

	public static void main(String[] args) {
		addUser("Moudir1954546","Moudir", "Moudir", "Moudir", "Moudir", "Moudir", "Moudir", 1);
		updateUser(8,"Moudir1954546","Moudir", "Moudir", "Moudir", "Moudir", "Moudir", "Moudir", 1);
		getUser(3);
		deleteUser(14);
		getusers();
		
		String str="2015-03-31";  
	    Date date=Date.valueOf(str);//converting string into sql date  
		addAnnouncement (5,2,"A7la annouce" ,"sim7a" ,7.9 ,"fdsds" ,date, true,"nabeul");
		updateAnnouncement(6,5,2,"A7la annouce6" ,"sim7a" ,7.9 ,"fdsds" ,date, true,"nabeul");
		getAnnouncements();
		getAnnouncement(9);
		deleteAnnouncement(14);

		
		
		
		ENTITY_MANAGER_FACTORY.close();

	}
	
	
	//Users
	
	 public static void addUser (String firstname,String name, String pseudo, String mail, String u_password , String phone, String address,int role_id) {
	        // The EntityManager class allows operations such as create, read, update, delete
	        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
	        // Used to issue transactions on the EntityManager
	        EntityTransaction et = null;
	 
	        try {
	            // Get transaction and start
	            et = em.getTransaction();
	            et.begin();
	 
	            // Create and set values for new customer
	            UserImpl cust = new UserImpl(firstname,name, pseudo,mail, u_password , phone, address,role_id);
	          
	 
	            // Save the customer object
	            em.persist(cust);
	            et.commit();
	        } catch (Exception ex) {
	            // If there is an exception rollback changes
	            if (et != null) {
	                et.rollback();
	            }
	            ex.printStackTrace();
	        } finally {
	            // Close EntityManager
	            em.close();
	        }
	    }
	 public static void getUser(long id) {
	    	EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
	    	
	    	// the lowercase c refers to the object
	    	// :custID is a parameterized query thats value is set below
	    	String query = "SELECT c FROM UserImpl c WHERE c.id = :id";
	    	
	    	// Issue the query and get a matching Customer
	    	TypedQuery<UserImpl> tq = em.createQuery(query, UserImpl.class);
	    	tq.setParameter("id", id);
	    	
	    	UserImpl cust = null;
	    	try {
	    		// Get matching customer object and output
	    		cust = tq.getSingleResult();
	    		System.out.println(cust.getFirstname() + "\n" + cust.getName() + "\n " +cust.getPseudo() + "\n " +cust.getAddress() + " ");
	    	}
	    	catch(NoResultException ex) {
	    		ex.printStackTrace();
	    	}
	    	finally {
	    		em.close();
	    	}
	    }
	    
	    public static void getusers() {
	    	EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
	    	
	    	// the lowercase c refers to the object
	    	// :custID is a parameterized query thats value is set below
	    	String strQuery = "SELECT c FROM UserImpl c WHERE c.id IS NOT NULL";
	    	
	    	// Issue the query and get a matching Customer
	    	TypedQuery<UserImpl> tq = em.createQuery(strQuery, UserImpl.class);
	    	List<UserImpl> custs;
	    	try {
	    		// Get matching customer object and output
	    		custs = tq.getResultList();
	    		custs.forEach(cust->System.out.println(cust.getFirstname() + " " + cust.getName()));
	    	}
	    	catch(NoResultException ex) {
	    		ex.printStackTrace();
	    	}
	    	finally {
	    		em.close();
	    	}
	    }
	    
	    public static void updateUser (long id,String firstname,String name, String pseudo, String mail, String u_password , String phone, String address,int role_id) {
	        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
	        EntityTransaction et = null;
	        
	    	UserImpl cust = null;
	 
	        try {
	            // Get transaction and start
	            et = em.getTransaction();
	            et.begin();
	 
	            // Find customer and make changes
	            cust = em.find(UserImpl.class, id);
	            cust.setFirstname(firstname);
	            cust.setName(name);
	            cust.setPseudo(pseudo);
	            cust.setMail(mail);
	            cust.setU_password(u_password);
	            cust.setPhone(phone);
	            cust.setAddress(address);
	            cust.setRole_id(role_id);
	 
	            // Save the customer object
	            em.persist(cust);
	            et.commit();
	        } catch (Exception ex) {
	            // If there is an exception rollback changes
	            if (et != null) {
	                et.rollback();
	            }
	            ex.printStackTrace();
	        } finally {
	            // Close EntityManager
	            em.close();
	        }
	    }
	    
	    public static void deleteUser(long id) {
	    	EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
	        EntityTransaction et = null;
	        UserImpl cust = null;
	 
	        try {
	            et = em.getTransaction();
	            et.begin();
	            cust = em.find(UserImpl.class, id);
	            em.remove(cust);
	            et.commit();
	        } catch (Exception ex) {
	            // If there is an exception rollback changes
	            if (et != null) {
	                et.rollback();
	            }
	            ex.printStackTrace();
	        } finally {
	            // Close EntityManager
	            em.close();
	        }
	    }
	    
	    
	  //Announcement
	    
		 public static void addAnnouncement (long idUser,long cat,String title ,String desc ,double price ,String pic ,Date publication_date, boolean is_available,String localisation) {
		        // The EntityManager class allows operations such as create, read, update, delete
		        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		        // Used to issue transactions on the EntityManager
		        EntityTransaction et = null;
		 
		        try {
		            // Get transaction and start
		            et = em.getTransaction();
		            et.begin();
		 
		            // Create and set values for new customer
		            AnnouncementImpl cust = new AnnouncementImpl (idUser, cat, title , desc ,price , pic , publication_date,  is_available,localisation);
		          
		 
		            // Save the customer object
		            em.persist(cust);
		            et.commit();
		        } catch (Exception ex) {
		            // If there is an exception rollback changes
		            if (et != null) {
		                et.rollback();
		            }
		            ex.printStackTrace();
		        } finally {
		            // Close EntityManager
		            em.close();
		        }
		    }
		 public static void getAnnouncement (long id) {
		    	EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		    	
		    	// the lowercase c refers to the object
		    	// :custID is a parameterized query thats value is set below
		    	String query = "SELECT c FROM AnnouncementImpl c WHERE c.id = :id";
		    	
		    	// Issue the query and get a matching Customer
		    	TypedQuery<AnnouncementImpl> tq = em.createQuery(query, AnnouncementImpl.class);
		    	tq.setParameter("id", id);
		    	
		    	AnnouncementImpl cust = null;
		    	try {
		    		// Get matching customer object and output
		    		cust = tq.getSingleResult();
		    		System.out.println(cust.getTitle() + "\n" + cust.getDescription() + "\n " +cust.getPrice() + "\n " +cust.getPublication_date() + " ");
		    	}
		    	catch(NoResultException ex) {
		    		ex.printStackTrace();
		    	}
		    	finally {
		    		em.close();
		    	}
		    }
		    
		    public static void getAnnouncements() {
		    	EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		    	
		    	// the lowercase c refers to the object
		    	// :custID is a parameterized query thats value is set below
		    	String strQuery = "SELECT c FROM AnnouncementImpl c WHERE c.id IS NOT NULL";
		    	
		    	// Issue the query and get a matching Customer
		    	TypedQuery<AnnouncementImpl> tq = em.createQuery(strQuery, AnnouncementImpl.class);
		    	List<AnnouncementImpl> custs;
		    	try {
		    		// Get matching customer object and output
		    		custs = tq.getResultList();
		    		custs.forEach(cust->System.out.println(cust.getTitle() + " " + cust.getDescription()));
		    	}
		    	catch(NoResultException ex) {
		    		ex.printStackTrace();
		    	}
		    	finally {
		    		em.close();
		    	}
		    }
		    
		    public static void updateAnnouncement (long id ,long idUser,long cat,String title ,String desc ,double price ,String pic ,Date publication_date, boolean is_available,String localisation) {
		        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		        EntityTransaction et = null;
		        
		    	AnnouncementImpl cust = null;
		 
		        try {
		            // Get transaction and start
		            et = em.getTransaction();
		            et.begin();
		 
		            // Find customer and make changes
		            cust = em.find(AnnouncementImpl.class, id);
		            cust.setUser_id(idUser);
		            cust.setCategory_id(cat);
		            cust.setTitle(title);
		            cust.setDescription(desc);
		            cust.setPrice(price);
		            cust.setPicture(pic);
		            cust.setPublication_date(publication_date);
		            cust.setIs_available(is_available);
		            cust.setLocalisation(localisation);;
		 
		            // Save the customer object
		            em.persist(cust);
		            et.commit();
		        } catch (Exception ex) {
		            // If there is an exception rollback changes
		            if (et != null) {
		                et.rollback();
		            }
		            ex.printStackTrace();
		        } finally {
		            // Close EntityManager
		            em.close();
		        }
		    }
		    
		    public static void deleteAnnouncement (long id) {
		    	EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		        EntityTransaction et = null;
		        AnnouncementImpl cust = null;
		 
		        try {
		            et = em.getTransaction();
		            et.begin();
		            cust = em.find(AnnouncementImpl.class, id);
		            em.remove(cust);
		            et.commit();
		        } catch (Exception ex) {
		            // If there is an exception rollback changes
		            if (et != null) {
		                et.rollback();
		            }
		            ex.printStackTrace();
		        } finally {
		            // Close EntityManager
		            em.close();
		        }
		    }

}
