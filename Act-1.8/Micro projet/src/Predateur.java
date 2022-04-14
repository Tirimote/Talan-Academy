import java.util.Scanner;

public abstract class Predateur implements PredateurAction{
	private String sexe;
	String age;
	String force;
	boolean inGroupe=false;
	Scanner input = new Scanner(System.in);
	void age() {
		String a;
		
		do {
			System.out.println("Entrer l'age du lion\n1)Jeune\n2)Adulte\n3)Vieux");
			a = input.nextLine();
			 ;
		}while (!a.equals("Jeune") && !a.equals("Adulte")&& !a.equals("Vieux"));
		setAge(a);
	}
	void sexe() {
		String a;
		
		do {
			System.out.println("Entrer le sex du lion\n1)Male\n2)Femelle");
			a = input.nextLine();
			 ;
		}while (!a.equals("Malle") && !a.equals("Femelle"));
		setSexe(a);
	}
	@Override
	public void manger() {
		System.out.println("Le predateur mange");
		
	}
	@Override
	public void chasser() {
		System.out.println("Le predateur chasse");
		
	}
	@Override
	public void courir() {
		System.out.println("Le predateur court");
		
	}
	@Override
	public void seReproduire() {
		System.out.println("Le predateur se reproduit");
		
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getForce() {
		return force;
	}
	public void setForce(String force) {
		this.force = force;
	}
	public boolean isInGroupe() {
		return inGroupe;
	}
	public void setInGroupe(boolean inGroupe) {
		this.inGroupe = inGroupe;
	}
	@Override
	public void son(int a) {
		System.out.println("Le predateur émet un son");
		
	}
	

}
