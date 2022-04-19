import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("entrer un nbr entre 10 et 30");
		int a = scan.nextInt();
		try {
				if(a<10 || a>30) {
					throw new Exception("\n"+"Il faut entrer un nombre entre 10 et 30");
				}
		}
		catch (Exception e) {
			System.out.println("Il y a un probleme"+e);
		}

	}

}
