
public class Cabine {
	public int longueur;
	public int largeur;
	public final int identif=1;
	public Cabine() {
		this(15);
	}
	private Cabine(int longueur) {
		this.longueur=longueur;
	}
	public int indentifGetter () {
		return this.identif;
	}
	public String toString () {
		return ("La Cabine N°"+this.identif);
	}

}
