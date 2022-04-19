
public class MusiqueImpl implements Musique {
	private String titre,auteur,interprete,genre;
	public String toString ( ) {
		return this.titre;
	}
	public MusiqueImpl() {
		
	}

	@Override
	public void afficherMusique() {
		System.out.println(titre);
		
	}

	@Override
	public boolean comparerMusique(MusiqueImpl a , MusiqueImpl b) {
		
		return (a.titre == b.titre);
		
		
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getInterprete() {
		return interprete;
	}

	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	

}
