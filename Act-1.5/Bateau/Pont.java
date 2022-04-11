
public class Pont {
	public int longueur;
	public int largeur;
	public final int identif=1;
	public Pont() {
		this(15);
	}
	private Pont(int longueur) {
		this.longueur=longueur;
	}
	public int indentifGetter () {
		return this.identif;
	}
	public String toString () {
		return ("Le Pont N°"+this.identif+" est constitué du ");
	}


}
