
public class Coque {
	public int longueur;
	public int largeur;
	private final int identif=2;
	public Coque() {
		this(15);
	}
	private Coque(int longueur) {
		this.longueur=longueur;
	}
	public int indentifGetter () {
		return this.identif;
	}
	public String toString () {
		return ("La Coque N°"+this.identif+".");
	}



}
