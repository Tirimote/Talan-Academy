

public class Main {

	public static void main(String[] args) {
		AnnouncementManager manager = new AnnouncementManager();
		UserImpl user1 = new UserImpl(8,"sami","bensalha","bzo","ben.salha.oussama","lol200","50502772","nabeul",1);
		UserImpl user2 = new UserImpl(3,"aaaaaaaaaaazeazrzarzaaaaaaaaaa","bensalha","bzo","ben.salha.oussama","lol200","50502772","nabeul",1);
		manager.createAccount(user1);
		manager.seConnecter("ben.salha.oussama", "lol20");
		manager.updateAccount(user2);
		manager.showAds();
		manager.showVendor(2);
		AnnouncementImpl ad1 = new AnnouncementImpl(4,2,3,"HYPEX","A7la produiet fik ya tounis",50.6,"c:\\sfsfds","2019-02-25 11:32:12",true,"jandouba");
		AnnouncementImpl ad2 = new AnnouncementImpl(4,2,3,"HYPEX","A7la produiet fik ya tounis",87.7,"c:\\sfsfds","2019-02-25 11:32:12",true,"jandouba");
		manager.createAd(ad1);
		manager.updateAd(ad2);
		manager.deleteAd(3);

	}

}
