import java. util. Arrays;
public class PlayListeImp implements PlayListe {
	public String toString ( ) {
		return this.nom;
	}
	private final int MAX_MUSIQUES=10;
	private int nombreTitre;
	private String nom,genre;
	private MusiqueImpl[] tab= new MusiqueImpl[MAX_MUSIQUES];
	PlayListeImp( String b, String c ) {
		
		this.nom=b;
		this.genre=c;
	}
PlayListeImp( ) {
		
	}
	public int getMAX_MUSIQUES() {
		return MAX_MUSIQUES;
	}

	public int getNombreTitre() {
		return nombreTitre;
	}
	public void setNombreTitre(int nombreTitre) {
		this.nombreTitre = nombreTitre;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@Override
	public void afficherPlayListe() {
		for(int i = 0 ; i<nombreTitre ; i++) {
			System.out.println(tab[i].getTitre());
			
		}
		
	}
	@Override
	public void addMusic(MusiqueImpl a) {
		if(nombreTitre<MAX_MUSIQUES) {
			tab[nombreTitre]=a;
			this.nombreTitre=this.nombreTitre+1;
		} else {System.out.println("La playliste est pleine, impossible d'ajouter");
			
		}
		
	}

	@Override
	public void deleteDouble() {
		MusiqueImpl a = new MusiqueImpl();
		for(int i=0;i<this.nombreTitre;i++) {
			for (int j=this.nombreTitre-1 ;j>-1;j--) {
				if(i!=j && tab[i]==tab[j]){
					a=tab[this.nombreTitre-1]=tab[j]; tab[this.nombreTitre-1]=tab[j];tab[j]=a;
					this.nombreTitre=this.nombreTitre-1;
					
					
				}
			}
		}
		
	}
	@Override
	public void triAuteur() {
		String[] tab = new String [this.nombreTitre];
		for(int i = 0 ; i< this.nombreTitre;i++) {
			tab[i]=this.tab[i].getAuteur()+" "+this.tab[i].getTitre();
		}
		Arrays.sort(tab);
		for(int i = 0 ; i< this.nombreTitre;i++) {
			System.out.println(tab[i]);
		}
	}
	@Override
	public void triInterprete() {
		String[] tab = new String [this.nombreTitre];
		for(int i = 0 ; i< this.nombreTitre;i++) {
			tab[i]=this.tab[i].getInterprete()+" "+this.tab[i].getTitre();
		}
		Arrays.sort(tab);
		for(int i = 0 ; i< this.nombreTitre;i++) {
			System.out.println(tab[i]);
		}
		
	}

	

}
