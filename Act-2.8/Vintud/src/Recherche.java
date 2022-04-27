
public class Recherche {
	int id;
	String type;
	String taille;
	String couleur;
	int maxPrix, minPrix;
	int user_id;
	
	Recherche(int id,String type,String taille,String couleur, int maxPrix,int minPrix, int user_id ){
		setId(id); setType(type);setTaille(taille);setCouleur(couleur);setMaxPrix(maxPrix);setMinPrix(minPrix);setUser_id(user_id);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTaille() {
		return taille;
	}
	public void setTaille(String taille) {
		this.taille = taille;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public int getMaxPrix() {
		return maxPrix;
	}
	public void setMaxPrix(int maxPrix) {
		this.maxPrix = maxPrix;
	}
	public int getMinPrix() {
		return minPrix;
	}
	public void setMinPrix(int minPrix) {
		this.minPrix = minPrix;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	

}
