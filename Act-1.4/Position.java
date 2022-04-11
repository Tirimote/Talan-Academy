import java.util.Scanner;


public class Position{



	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Entrer un nombre des case");
		int t = input.nextInt();
		int[] tableau = entrer (t);
		System.out.println("Entrer un nombre pour chercher la position ou il faut le placer pour que le tableau reste trié");
		int a = input.nextInt();
		int z=position ( tableau,a,0);
		System.out.println("La position est");
		System.out.println(z);
	}


	private static int position ( int[] tab,int nbr,int ind){
		int a=0;
		if(tab[ind]>nbr){
			a=ind;
		}
		if(a==0 && ind<tab.length-1){
		return position (tab,nbr,ind+1);
		}
	return(a);
	}
	
	private static int[] entrer (int nbr){
		int[] tab= new int[nbr]; int o = 0 ;
		System.out.println("Entrer le nombre N°1");
			Scanner input = new Scanner(System.in);
			int v = input.nextInt();
			tab[0]=v;
		for (int i = 1 ; i < tab.length; i++ ){
			do{
			System.out.println("Entrer le nombre N°"+(i+1)+" qui doit etre supérieur ou egale à "+tab[i-1]);

			int p = input.nextInt(); o=p;} while(o<tab[i-1]);
			tab[i]=o;
		}
	return(tab);
	}
}