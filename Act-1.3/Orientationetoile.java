import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;


public class Orientationetoile{



public static void main(String[] args) {
int q;
String[] tab = {"Alban", "Jim", "Bob", "Albatroz", "Jinto", "Bow", "Hijo", "Manu", "Seb", "Teilo", "Charles", "Xavier"};
String[] tab1 = new String[tab.length+1];
String[] tab2= new String[1];

ordre(tab);
Scanner input = new Scanner(System.in);
System.out.println("Entrer un nouveau nom");
String nom = input.nextLine();
tab2[0]=nom;
System.arraycopy(tab,0,tab1,0,tab.length);
System.arraycopy(tab2,0,tab1,tab.length,tab2.length);

ordre(tab1);
System.out.println("Entrer un nom pour chercher sa position");
String nom1 = input.nextLine();
q=recherche( tab1, 0 , tab1.length-1 , nom1 );
System.out.println("La position de votre mot est ");
System.out.println(q);
}


private static void ordre( String[] prenoms ){


int k;
String x;

for (int i = 0 ; i < prenoms.length-1; i++ ) {

	for (int j = prenoms.length-1 ; j > i; j-- ) {

	k=0;

	while (k < Math.min(prenoms[j].length(), prenoms[j-1].length())) {


	if (prenoms[j].charAt(k)<prenoms[j-1].charAt(k)) {
	x=prenoms[j];
	prenoms[j]=prenoms[j-1];
	prenoms[j-1]=x;
	k =Math.min(prenoms[j].length(), prenoms[j-1].length());
} 
 else if (prenoms[j].charAt(k)>prenoms[j-1].charAt(k)) {
k=Math.min(prenoms[j].length(), prenoms[j-1].length());
}

else {
k++;
}
}
}
}


for (int i = 0 ; i < prenoms.length; i++ ) {

System.out.println(prenoms[i]);

}

}
	





private static int comparer(String ch1,String ch2){

		
		int i,a;
		i=0; a=0;
do{
		if (ch1.charAt(i)<ch2.charAt(i)) {
                a=1;
		} else if (ch1.charAt(i)>ch2.charAt(i) ){
                a=2;
	        } else {i=i+1;}
}while(a==0 && i<Math.min(ch1.length(),ch2.length())); 
	        return(a);
		}






private static int recherche( String[] prenoms, int min , int max, String ch ){
int a; int mid=0; float mid1=0;
if(min==max){ 
		if (prenoms[min]==ch){
		a=min;
		} else { 
		a=-1;
}
} else {
mid1 = (min + max) / 2;
mid=(int)mid1;
}

if (comparer(ch , prenoms[mid])==2){
	a = recherche(prenoms,mid+1,max, ch);
	}else{
	a = recherche(prenoms,min, mid, ch);
	}

return(a);
}
}