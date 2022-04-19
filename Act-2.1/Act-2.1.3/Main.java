import java.util.Scanner;
import java.util.*;
public class Main {

	

	public static void main(String[] args) {
		int a;
		int b = 0;
		int c=0;
		ArrayList<MusiqueImpl> listMusique = new ArrayList<MusiqueImpl>();
		ArrayList<PlayListeImp> listPlayliste = new ArrayList<PlayListeImp>();
		do {
			System.out.println("Menu des commandes");
			System.out.println("Pour ajouter une chanson taper 1");
			System.out.println("Pour afficher la musique disponible taper 2");
			System.out.println("Pour ajouter une playliste taper 3");
			System.out.println("Pour afficher les musiques d'une playliste taper 4");
			System.out.println("Pour trier les musiques d'une playliste par Auteur taper 5");
			System.out.println("Pour trier les musiques d'une playliste par Interprete taper 6");
			System.out.println("Pour ajouter une chanson à une playliste taper 7");
			System.out.println("Pour quitter taper 0");
			Scanner scanner = new Scanner(System.in);
			a= scanner.nextInt();
			switch (a) {
		    case 1 :
		    	MusiqueImpl h = new MusiqueImpl();
		    	h.setTitre(scanner.nextLine());
		    	System.out.println("Entrer le titre");
		    	h.setTitre(scanner.nextLine());
		        System.out.println("Entrer l'auteur");
		        h.setAuteur(scanner.nextLine());
		        System.out.println("Entrer l'interprete");
		        h.setInterprete(scanner.nextLine());
		        System.out.println("Entrer le genre");
		        h.setGenre(scanner.nextLine());
		        listMusique.add(h);
		        System.out.println("La nouvelle liste des musique:" );  
				for (int t = 0 ; t < listMusique.size(); t++ ) {
					System.out.print(t+")");
		            System.out.println(listMusique.get(t));
		            }
		        break;
		    case 2 :
		    	
		        System.out.println("La liste des musiques:" );  
				for (int t = 0 ; t < listMusique.size(); t++ ) {
					System.out.print(t+")");
		            System.out.println(listMusique.get(t));
		            }
		        break;    
		        
		    case 3 :
		    	PlayListeImp l = new PlayListeImp();
		    	l.setNom(scanner.nextLine());
		    	System.out.println("Entrer le nom de la playliste");
		    	l.setNom(scanner.nextLine());
		        System.out.println("Entrer le genre");
		        l.setGenre(scanner.nextLine());
		        listPlayliste.add(l);
		        System.out.println("La nouvelle liste des musique:" );  
				for (int t = 0 ; t < listPlayliste.size(); t++ ) {
					System.out.print(t+")");
		            System.out.println(listPlayliste.get(t));
		            }
		        break;  
		    case 4 :
		    	
		        System.out.println("La liste des playlistes:" );  
				for (int t = 0 ; t < listPlayliste.size(); t++ ) {
					System.out.print(t+")");
		            System.out.println(listPlayliste.get(t));
		            }
				System.out.println("Entrer le numero de la playliste à afficher");
		    	int pp= scanner.nextInt();
		    	listPlayliste.get(pp).afficherPlayListe();
				
		        break; 
		    case 5 :
		    	
		        System.out.println("La liste des playlistes:" );  
				for (int t = 0 ; t < listMusique.size(); t++ ) {
					System.out.print(t+")");
		            System.out.println(listMusique.get(t));
		            }
				System.out.println("Entrer le numero de la playliste à trier");
		    	int pp3= scanner.nextInt();
		    	
		    	listPlayliste.get(pp3).triAuteur();
				
		        break;  
             case 6 :
		    	
		        System.out.println("La liste des playlistes:" );  
				for (int t = 0 ; t < listMusique.size(); t++ ) {
					System.out.print(t+")");
		            System.out.println(listMusique.get(t));
		            }
				System.out.println("Entrer le numero de la playliste à trier");
		    	int pp4= scanner.nextInt();
		    	
		    	listPlayliste.get(pp4).triInterprete();
				
		        break;      
		    case 7 :
		    	System.out.println("La liste des musiques:" );  
					for (int t = 0 ; t < listMusique.size(); t++ ) {
						System.out.print(t+")");
			            System.out.println(listMusique.get(t));
			            }
		        System.out.println("La liste des playlistes:" );  
				for (int t = 0 ; t < listPlayliste.size(); t++ ) {
					System.out.print(t+")");
		            System.out.println(listPlayliste.get(t));
		            }
				System.out.println("Entrer le numero de la musique");
		    	int pp1= scanner.nextInt();
		    	System.out.println("Entrer le numero de la playliste");
		    	int pp2= scanner.nextInt();
		    	
		    	listPlayliste.get(pp2).addMusic(listMusique.get(pp1));
				
		        break;    
			}
		     
		        }  while(a!=0);
			
		   
		
			
		}

	
	
}
