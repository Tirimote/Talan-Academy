import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;
		int b = 0;
		int c=0;
		ArrayList<Lion> listLion = new ArrayList<Lion>();
		ArrayList<GroupeLion> listGroupe = new ArrayList<GroupeLion>();
	  	System.out.println("Menu des commandes");
		System.out.println("Pour ajouter un lion à la liste des lions libres taper 1");
		System.out.println("Pour afficher les lions libres taper 2");
		System.out.println("Pour ajouter un groupe de lion taper 3");
		System.out.println("Pour afficher les groupes de lion taper 4");
		System.out.println("Pour ajouter un lion libre à un groupe taper 5");
		System.out.println("Pour supprimer un lion d'un groupe taper 6");
		System.out.println("Pour afficher les lions d'un groupe taper 7");
		System.out.println("Pour changer le couple dominant d'un groupe taper 8");
		System.out.println("Pour afficher le couple dominant d'un groupe taper 9");
		System.out.println("Pour lancer une reproduction taper 10");
		System.out.println("pour comprendre les rugissement d'un lion taper 11");
		System.out.println("pour afficher le menu taper 12");
		System.out.println("Pour quitter taper 0");
		do {
			Scanner scanner = new Scanner(System.in);
			a= scanner.nextInt();
			switch (a) {
		    case 1 :
		    	Lion h = new Lion();
		    	h.sexe();h.age();h.domination();h.rang();h.impetiosite();
		        System.out.println("La nouvelle liste des lions libres:" );  
		        listLion.add(h);
				for (int t = 0 ; t < listLion.size(); t++ ) {
		            System.out.print(">Lion ");
		            System.out.print(t+1+" ");listLion.get(t).caracteristique();
		            }
		        break;
		    case 2 :
		    	if(listLion.size()>0) {
		    	
		        System.out.println("La liste des lions libres:" );  
		        for (int t = 0 ; t < listLion.size(); t++ ) {
		            System.out.print(">Lion ");
		            System.out.print(t+1+" ");listLion.get(t).caracteristique();
		            }
		    	}else {
		    		System.out.println("La liste des lions libres est vide");
		    	}
		        break;   
		    case 3 :
		    	GroupeLion c1 = new GroupeLion();
		    	c1.zone();
		        System.out.println("La nouvelle liste des Groupes:" );  
		        listGroupe.add(c1);
				for (int t = 0 ; t < listGroupe.size(); t++ ) {
					int taille=listGroupe.get(t).getTaille()[0]+listGroupe.get(t).getTaille()[1];
		            System.out.print(">Groupe ");
		            System.out.print(t+1+" ");System.out.println("("+taille+" lion(s);zone : " +c1.getZone()+")");
		            }
		        break;
		    case 4 :
		    	
		        System.out.println("La liste des Groupes:" );  
				for (int t = 0 ; t < listGroupe.size(); t++ ) {
					int taille=listGroupe.get(t).getTaille()[0]+listGroupe.get(t).getTaille()[1];
					int male=listGroupe.get(t).getTaille()[0];
					int fem=listGroupe.get(t).getTaille()[1];
		            System.out.print(">Groupe ");
		            System.out.print(t+1+" ");System.out.println("("+taille+" lion(s):"+male+" male(s)/"+fem+" femelle(s);zone : " +listGroupe.get(t).getZone()+")");
		            }
		        break;
		    case 5 :
		    	if(listLion.size()!=0 && listGroupe.size()!=0) {
		    	 System.out.println("La liste des lions libres:" );  
			        for (int t = 0 ; t < listLion.size(); t++ ) {
			            System.out.print(">Lion ");
			            System.out.print(t+1+" ");listLion.get(t).caracteristique();
			            }
			        System.out.println("La liste des Groupes:" );  
					for (int t = 0 ; t < listGroupe.size(); t++ ) {
						int taille=listGroupe.get(t).getTaille()[0]+listGroupe.get(t).getTaille()[1];
						int male=listGroupe.get(t).getTaille()[0];
						int fem=listGroupe.get(t).getTaille()[1];
			            System.out.print(">Groupe ");
			            System.out.print(t+1+" ");System.out.println("("+taille+" lion(s):"+male+" male(s)/"+fem+" femelle(s);zone : " +listGroupe.get(t).getZone()+")");
			            }
				System.out.println("Entrer le numero du lion");
		    	int pp1= scanner.nextInt()-1;
		    	System.out.println("Entrer le numero du groupe");
		    	int pp2= scanner.nextInt()-1;
		
		    	listGroupe.get(pp2).addElem(listLion.get(pp1));
		    	listLion.remove(pp1);
		    	}else {
		    		System.out.println("Impossible!! La liste des lions libres et/ou la liste des groupe est vide");
		    	}
		        break; 
		    case 6 :
		    	if(listGroupe.size()!=0) {
			        System.out.println("La liste des Groupes:" );  
					for (int t = 0 ; t < listGroupe.size(); t++ ) {
						int taille=listGroupe.get(t).getTaille()[0]+listGroupe.get(t).getTaille()[1];
						int male=listGroupe.get(t).getTaille()[0];
						int fem=listGroupe.get(t).getTaille()[1];
			            System.out.print(">Groupe ");
			            System.out.print(t+1+" ");System.out.println("("+taille+" lion(s):"+male+" male(s)/"+fem+" femelle(s);zone : " +listGroupe.get(t).getZone()+")");
			            }
		    	System.out.println("Entrer le numero du groupe");
		    	int pp= scanner.nextInt()-1;
		    	ArrayList<Lion> list = listGroupe.get(pp).getListLion();
		    	 System.out.println("La liste des lions dans le groupe choisi:" );  
			        for (int t = 0 ; t < list.size(); t++ ) {
			            System.out.print(">Lion ");
			            System.out.print(t+1+" ");list.get(t).caracteristique();
			            }
			        System.out.println("Entrer le numero du lion à supprimer");
			    	int pp1= scanner.nextInt()-1;
			    	listLion.add(listGroupe.get(pp).getListLion().get(pp1));
		
			    	listGroupe.get(pp).supElem(pp1);
		    	
		    	}else {
		    		System.out.println("Impossible!! La liste des groupes est vide");
		    	}
		        break;   
		    case 7 :
		    	if(listGroupe.size()!=0) {
			        System.out.println("La liste des Groupes:" );  
					for (int t = 0 ; t < listGroupe.size(); t++ ) {
						int taille=listGroupe.get(t).getTaille()[0]+listGroupe.get(t).getTaille()[1];
						int male=listGroupe.get(t).getTaille()[0];
						int fem=listGroupe.get(t).getTaille()[1];
			            System.out.print(">Groupe ");
			            System.out.print(t+1+" ");System.out.println("("+taille+" lion(s):"+male+" male(s)/"+fem+" femelle(s);zone : " +listGroupe.get(t).getZone()+")");
			            }
		    	System.out.println("Entrer le numero du groupe pour afficher ses éléments");
		    	int pp= scanner.nextInt()-1;
		    	ArrayList<Lion> list = listGroupe.get(pp).getListLion();
		    	 System.out.println("La liste des lions dans le groupe choisi:" );  
			        for (int t = 0 ; t < list.size(); t++ ) {
			            System.out.print(">Lion ");
			            System.out.print(t+1+" ");list.get(t).caracteristique();
			            }
		    	
		    	}else {
		    		System.out.println("Impossible!! La liste des groupes est vide");
		    	}
		        break;
                case 8 :
		    	
                	if(listGroupe.size()!=0) {
    			        System.out.println("La liste des Groupes:" );  
    					for (int t = 0 ; t < listGroupe.size(); t++ ) {
    						int taille=listGroupe.get(t).getTaille()[0]+listGroupe.get(t).getTaille()[1];
    						int male=listGroupe.get(t).getTaille()[0];
    						int fem=listGroupe.get(t).getTaille()[1];
    			            System.out.print(">Groupe ");
    			            System.out.print(t+1+" ");System.out.println("("+taille+" lion(s):"+male+" male(s)/"+fem+" femelle(s);zone : " +listGroupe.get(t).getZone()+")");
    			            }
    		    	System.out.println("Entrer le numero du groupe pour modifier son couple dominant");
    		    	int pp= scanner.nextInt()-1;
    		    	ArrayList<Lion> list = listGroupe.get(pp).getListLion();
    		    	 System.out.println("La liste des lions dans le groupe choisi:" );  
    			        for (int t = 0 ; t < list.size(); t++ ) {
    			            System.out.print(">Lion ");
    			            System.out.print(t+1+" ");list.get(t).caracteristique();
    			            }
    			        System.out.println("entrer le numero du male dominant" );
    			        int numMale= scanner.nextInt()-1;
    			        System.out.println("entrer le numero de la femelle" );
    			        int numFemelle= scanner.nextInt()-1;
    			        listGroupe.get(pp).constituerCouple(listGroupe.get(pp).getListLion().get(numMale), listGroupe.get(pp).getListLion().get(numFemelle));
    		    	}else {
    		    		System.out.println("Impossible!! La liste des groupes est vide");
    		    	}
		        break;
                case 9 :
    		    	
                	if(listGroupe.size()!=0) {
    			        System.out.println("La liste des Groupes:" );  
    					for (int t = 0 ; t < listGroupe.size(); t++ ) {
    						int taille=listGroupe.get(t).getTaille()[0]+listGroupe.get(t).getTaille()[1];
    						int male=listGroupe.get(t).getTaille()[0];
    						int fem=listGroupe.get(t).getTaille()[1];
    			            System.out.print(">Groupe ");
    			            System.out.print(t+1+" ");System.out.println("("+taille+" lion(s):"+male+" male(s)/"+fem+" femelle(s);zone : " +listGroupe.get(t).getZone()+")");
    			            }
    		    	System.out.println("Entrer le numero du groupe pour afficher son couple dominant");
    		    	int pp= scanner.nextInt()-1;
    		    	Lion[] couple=listGroupe.get(pp).getCoupleDominant();
    		    	 System.out.print("Le couple dominateur dans ce groupe est:\n>Le lion du couple dominant ");couple[0].caracteristique();
    		    	 System.out.print("\n>La lionne du couple dominant ");
    		    	 couple[1].caracteristique();
    		    	}else {
    		    		System.out.println("Impossible!! La liste des groupes est vide");
    		    	}
		        break;
                case 10 :
    		    	
                	if(listGroupe.size()!=0) {
    			        System.out.println("La liste des Groupes:" );  
    					for (int t = 0 ; t < listGroupe.size(); t++ ) {
    						int taille=listGroupe.get(t).getTaille()[0]+listGroupe.get(t).getTaille()[1];
    						int male=listGroupe.get(t).getTaille()[0];
    						int fem=listGroupe.get(t).getTaille()[1];
    			            System.out.print(">Groupe ");
    			            System.out.print(t+1+" ");System.out.println("("+taille+" lion(s):"+male+" male(s)/"+fem+" femelle(s);zone : " +listGroupe.get(t).getZone()+")");
    			            }
    		    	System.out.println("Entrer le numero du groupe pour lancer une reproduction");
    		    	int pp= scanner.nextInt()-1;
    		    	listGroupe.get(pp).lancerReproduction();
    		    	}else {
    		    		System.out.println("Impossible!! La liste des groupes est vide");
    		    	}
		        break;
                case 11 :
    		    	System.out.println("On vous informe aujourd'hui sur les rugissements des lions\nEntrer un nombre de 1 à 4 pour savoir l'utilité du rugissement");
    		    	int dd= scanner.nextInt();
    		    	Lion j = new Lion();
    		    	j.son(dd);
    		        break;
		        

		    case 12 :
		    	System.out.println("Menu des commandes");
				System.out.println("Pour ajouter un lion à la liste des lions libres taper 1");
				System.out.println("Pour afficher les lions libres taper 2");
				System.out.println("Pour ajouter un groupe de lion taper 3");
				System.out.println("Pour afficher les groupes de lion taper 4");
				System.out.println("Pour ajouter un lion libre à un groupe taper 5");
				System.out.println("Pour supprimer un lion d'un groupe taper 6");
				System.out.println("Pour afficher les lions d'un groupe taper 7");
				System.out.println("Pour changer le couple dominant d'un groupe taper 8");
				System.out.println("Pour afficher le couple dominant d'un groupe taper 9");
				System.out.println("Pour lancer une reproduction taper 10");
				System.out.println("pour comprendre les rugissement d'un lion taper 11");
				System.out.println("pour afficher le menu taper 12");
				System.out.println("Pour quitter taper 0");
		   
		        break;
		        
		    
			}
		     
		        }  while(a!=0);
		

	}

}
