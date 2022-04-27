
public class Favoris {
	private int id,user_id, ad_id;
	private String date;
	
	Favoris(int id, String date,int user_id,int ad_id){
		setId(id);setDate(date);setUser_id(user_id);setAd_id(ad_id);
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getAd_id() {
		return ad_id;
	}
	public void setAd_id(int ad_id) {
		this.ad_id = ad_id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
