import java.util.Scanner;
public abstract class GroupePredateur {
	Scanner input = new Scanner(System.in);
	int[] taille= {0,0};
	String zone;
	void zone() {
		String a;
		
		do {
			System.out.println("Entrer la zone du groupe\n1)Savane \n2)Rivière");
			a = input.nextLine();
			 ;
		}while (!a.equals("Savane") && !a.equals("Rivière"));
		setZone(a);
	}
	void afficherGroupeCara() {
		System.out.println(taille);
		System.out.println(zone);
	}
	 abstract void afficherElemCara();
	 abstract void addElem(Predateur pred);
	 abstract void supElem(Predateur pred);
	public int[] getTaille() {
		return taille;
	}
	public void setTaille(int[] taille) {
		this.taille = taille;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	 

}
