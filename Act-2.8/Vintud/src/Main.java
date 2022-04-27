

public class Main {

	public static void main(String[] args) {
		
		
		UserImpl user1 = new UserImpl(8,"sami","bensalha","bzo","ben.salha.oussama","lol200","50502772","nabeul",1);
		UserImpl user2 = new UserImpl(3,"aaaaaaaaaaazeazrzarzaaaaaaaaaa","bensalha","bzo","ben.salha.oussama","lol200","50502772","nabeul",1);
		DAOFactory.getUserDAO().createAccount(user1);
		DAOFactory.getUserDAO().seConnecter("ben.salha.oussama", "lol200");
		DAOFactory.getUserDAO().updateAccount(user2);
		DAOFactory.getAdDAO().showAds();
		DAOFactory.getUserDAO().showVendor(2);
		
		AnnouncementImpl ad1 = new AnnouncementImpl(4,2,3,"HYPEX","A7la produiet fik ya tounis",50.6,"c:\\sfsfds","2019-02-25 11:32:12",true,"jandouba");
		AnnouncementImpl ad2 = new AnnouncementImpl(4,2,3,"HYPEX","A7la produiet fik ya tounis",87.7,"c:\\sfsfds","2019-02-25 11:32:12",true,"benzart");
		AnnouncementImpl ad3 = new AnnouncementImpl(5,2,3,"HYPEX","A7la produiet fik ya tounis",16.7,"c:\\sfsfds","2019-02-25 11:32:12",true,"ariana");
		AnnouncementImpl ad4 = new AnnouncementImpl(6,2,3,"HYPEX","A7la produiet fik ya tounis",53,"c:\\sfsfds","2019-02-25 11:32:12",true,"zarzouna");
		DAOFactory.getAdDAO().createAd(ad1);
		DAOFactory.getAdDAO().createAd(ad3);
		DAOFactory.getAdDAO().createAd(ad4);
		DAOFactory.getAdDAO().updateAd(ad2);
		DAOFactory.getAdDAO().deleteAd(3);
		DAOFactory.getAdDAO().showAdsBy("HYPEX", 3, 87.7);
		DAOFactory.getAdDAO().filterAdsByPrice();
		DAOFactory.getAdDAO().filterAdsByLocalisation();
		DAOFactory.getAdDAO().reserveAd(2);
		DAOFactory.getAdDAO().viewsNum(2);
		
		Favoris fav1 = new Favoris(2,"2019-02-25 11:32:12",1,1);
		Favoris fav2 = new Favoris(3,"2019-02-26 11:32:12",1,1);
		DAOFactory.getFavDAO().createFav(fav1);
		DAOFactory.getFavDAO().createFav(fav2);
		DAOFactory.getFavDAO().deleteFav(1);
		DAOFactory.getFavDAO().showFav(1);
		DAOFactory.getFavDAO().updateFav(fav2);
		
		Recherche rech1 = new Recherche(1,"tshirt","L","bleu", 250,120,1);
		Recherche rech2 = new Recherche(2,"tshirt","L","bleu", 250,120,1);
		Recherche rech3 = new Recherche(2,"tshirt","L","noir", 250,120,1);
		DAOFactory.getRechDAO().createRech(rech1);
		DAOFactory.getRechDAO().deleteRech(1);
		DAOFactory.getRechDAO().createRech(rech2);
		DAOFactory.getRechDAO().useRech(2);
		DAOFactory.getRechDAO().updateRech(rech3);
		
		
		
		
		
		

	}

}
