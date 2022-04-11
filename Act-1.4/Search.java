import java.util.Scanner;


public class Search{



	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Entrer un nombre des case");
		int t = input.nextInt();
		int[] tableau = entrer (t);
		boolean z;
		System.out.println("Entrer un nombre à chercher");
		int a = input.nextInt();
		z=search ( tableau,a,0);
		System.out.println(z);
	}


	private static boolean search ( int[] tab,int nbr,int ind){
		boolean a=false;
		if(tab[ind]==nbr){
			a=true;
		}
		if(a==false && ind<tab.length-1){
		return search (tab,nbr,ind+1);
		}
	return(a);
	}
	
	private static int[] entrer (int nbr){
		int[] tab= new int[nbr]; ;
		for (int i = 0 ; i < tab.length; i++ ){
			Scanner input = new Scanner(System.in);
			System.out.println("Entrer le nombre N°"+(i+1));

			int p = input.nextInt();
			tab[i]=p;
		}
	return(tab);
	}
}