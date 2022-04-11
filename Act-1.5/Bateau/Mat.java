
public class Mat {
	public int longueur;
	public int largeur;
	public final int identif=1;
	public Mat () {
		this(15);
	}
	private Mat (int longueur) {
		this.longueur=longueur;
	}
	public int indentifGetter () {
		return this.identif;
	}
	public String toString () {
		return ("MAT N°"+this.identif+" qui est constitué de ");
	}

}
