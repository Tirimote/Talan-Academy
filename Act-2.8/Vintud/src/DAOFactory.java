
public  class DAOFactory {
	public static UtilisateurDAOImpl getUserDAO() {

		    return new UtilisateurDAOImpl();
		  
	}
	
	public static  AnnonceDAOImpl getAdDAO() {

	    return new AnnonceDAOImpl();
	  
	}
	public static  RechercheDaoImpl getRechDAO() {

	    return new RechercheDaoImpl();
	  
	}
	public static FavorisDaoImpl getFavDAO() {

	    return new FavorisDaoImpl();
	  
	}
	

}
