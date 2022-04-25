
public class AnnouncementImpl implements Announcement {
	int 
	id,
	user_id,
	category_id,
	view_number;
	
	String
	title ,
	description,
	localisation,
	publication_date,
	picture;
	
	boolean 
	is_available;
	
	double price;
	
	AnnouncementImpl(int id,int idUser,int cat,String title ,String desc ,double price ,String pic ,String publication_date, boolean is_available,String localisation){
		setId(id);setTitle(title);setDescription(desc);setPrice(price);setPicture(pic);setPublication_date(publication_date);setIs_available(is_available);setLocalisation(localisation);setView_number(0);setUser_id(idUser);setCategory_id(cat);	
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

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public int getView_number() {
		return view_number;
	}

	public void setView_number(int view_number) {
		this.view_number = view_number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public String getPublication_date() {
		return publication_date;
	}

	public void setPublication_date(String publication_date) {
		this.publication_date = publication_date;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public boolean isIs_available() {
		return is_available;
	}

	public void setIs_available(boolean is_available) {
		this.is_available = is_available;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
