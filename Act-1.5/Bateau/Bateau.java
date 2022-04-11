
public class Bateau {
	public int longueur;
	public int largeur;
	private final int identif=1;
	public Bateau() {
		this(15);
	}
	private Bateau(int longueur) {
		this.longueur=longueur;
	}
	public int indentifGetter () {
		return this.identif;
	}
	public String toString () {
		return ("Le bateau N°"+this.identif+" est constitué de:");
	}

}
