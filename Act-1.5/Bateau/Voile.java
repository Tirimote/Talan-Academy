
public class Voile {
		public int longueur;
		public int largeur;
		private final int identif=2;
		protected int prix;
		boolean enroule;
		boolean deroule;
		public void enrouler() {
			enroule=true;
			deroule=false;
		}
		public void derouler() {
			enroule=false;
			deroule=true;
		}
		public Voile () {
			this.longueur=15;
		}
		public Voile (int longueur) {
			this.longueur=longueur; 
		}
		public String toString () {
			return ("Voile N°"+this.identif+".");
		}

		

		
}
