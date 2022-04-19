import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;


public class Main {

	public static void main(String[] args) {
		Collection<String> list1 = new ArrayList<>();
		Collections.addAll(list1, "Lion", "Tiger", "Cat", "Dog");
		
		Collection<String> list2 = new ArrayList<>();
		Collections.addAll(list2, "Lion", "Tiger","Elephant", "Cat", "Dog");
		
		System.out.println(list1);
		System.out.println(list2);
		
		
		ArrayList<String> list3 = new ArrayList<>();
		list3.addAll(list2);
		list3.addAll(list2);
		System.out.println(list3);
		System.out.println("Taille du tableau:"+list3.size());
		supprimerIndex(list3,4);
		System.out.println(list3);
		supprimerNom(list3, "Tiger");
		System.out.println(list3);
		
		comparateur(list3);
		System.out.println(list3);
		
		Collections.sort(list3);
		System.out.println(list3);
		
		list3.sort(null);
		System.out.println(list3);
		
		
		
		
		


	}
	 public static void supprimerIndex(ArrayList<String> list , int index) {
			list.remove(index-1);	
		}
	static void supprimerNom(ArrayList<String> list , String nom) {
			list.remove(nom);	
		}
	static void rechercheIndex(ArrayList<String> list , String nom) {
			list.indexOf("nom");	
		}
	 static void rechercheNom(ArrayList<String> list , int index) {
			list.get(index);	
		}
	 static void comparateur(ArrayList<String> list) {
		 
		 
			 for ( int i= 0 ; i < list.size()-1; i++ ) {
				for (int j=list.size()-1; j>i;j--) {
					if(list.get(j).compareTo(list.get(j-1))<0) {
						String e = list.get(j);
						list.set(j,list.get(j-1));
						list.set(j-1, e);
						
					}
					
				}
			}
			
		
	 }

}
