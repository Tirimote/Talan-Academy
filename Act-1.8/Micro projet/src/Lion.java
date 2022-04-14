import java.util.Scanner;
public class Lion extends Predateur implements LionAction {
	String domination;
	String rang;
	String impetiosite;
	Lion(){
		
	}
	

	public String getDomination() {
		return domination;
	}
	Scanner input = new Scanner(System.in);

	public void domination() {
		String a;
		
		do {
			System.out.println("Entrer la dominance du lion\n1)Dominant\n2)Non dominant");
			a = input.nextLine();
			 ;
		}while (!a.equals("Dominant") && !a.equals("Non dominant"));
		setDomination(a);
		
	}

	public String getRang() {
		return this.rang;
	}

	public void rang() {
		String a;
		
		do {
			System.out.println("Entrer le rang du lion\n1)APLHA\n2)BETA\n3)GAMA\n4)OMEGA");
			a = input.nextLine();
			 ;
		}while (!a.equals("APLHA") && !a.equals("BETA")&& !a.equals("GAMA")&& !a.equals("OMEGA"));
		setRang(a);
	}

	public String getImpetiosite() {
		return impetiosite;
	}

	public void impetiosite() {
	String a;
		
		do {
			System.out.println("Entrer l'impétiosité du lion\n1)Impétueux\n2)Prudent");
			a = input.nextLine();
			 ;
		}while (!a.equals("Impétueux") && !a.equals("Prudent"));
		setImpetiosite(a);
	}

	@Override
	public void manger() {
		// TODO Auto-generated method stub
		super.manger();
	}

	@Override
	public void chasser() {
		// TODO Auto-generated method stub
		super.chasser();
	}

	@Override
	public void courir() {
		// TODO Auto-generated method stub
		super.courir();
	}

	@Override
	public void seReproduire() {
		// TODO Auto-generated method stub
		super.seReproduire();
	}

	@Override
	public void son(int a) {
		switch (a) {
		case 1: {
			System.out.println("Exprime l'appartenance à un groupe");
			break;
		}
		case 2: {
			System.out.println("Exprime la domination");
			break;
		}
		case 3: {
			System.out.println("Exprime la soumission");
			break;
		}
		case 4: {
			System.out.println("Exprime l'agressivité");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + a);
		}
	}

	@Override
	public void caracteristique() {
		System.out.println("("+getSexe()+";"+getAge()+";"+getDomination()+";"+getRang()+";"+getImpetiosite()+")");
		
	}

	@Override
	public void entendre() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void seSeparer() {
		// TODO Auto-generated method stub
		
	}

	
	public void sexe() {
		String a;
		
		do {
			System.out.println("Entrer le sex du lion\n1)Male\n2)Femelle");
			a = input.nextLine();
			 ;
		}while (!a.equals("Male") && !a.equals("Femelle"));
		setSexe(a);
	}

	@Override
	public void son() {
		// TODO Auto-generated method stub
		
	}


	public Scanner getInput() {
		return input;
	}


	public void setInput(Scanner input) {
		this.input = input;
	}


	public void setDomination(String domination) {
		this.domination = domination;
	}


	public void setRang(String rang) {
		this.rang = rang;
	}


	public void setImpetiosite(String impetiosite) {
		this.impetiosite = impetiosite;
	}
	

	

}
