import java.util.ArrayList;

public class GroupeLion extends GroupePredateur {
	private Lion[] coupleDominant= new Lion[2];
	private int puissance;
	ArrayList<Lion> listLion = new ArrayList<Lion>();

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	@Override
	void afficherElemCara() {
		// TODO Auto-generated method stub
		
	}


	
	void addElem(Lion lion) {
		listLion.add(lion);
		int[] a=getTaille();
		if(lion.getSexe().equals("Male")) {
			a[0]=a[0]+1;
		}else {
			a[1]=a[1]+1;
		}
		setTaille(a);
		
	}
;
	void supElem(int k) {
		
		int[] a=getTaille();
		if(listLion.get(k).getSexe().equals("Male")) {
			a[0]=a[0]-1;
		}else {
			a[1]=a[1]-1;
		}
		setTaille(a);
		listLion.remove(k);
		
	}
	void lancerReproduction() {
		int tab[]=getTaille();
		if(tab[0]!=0 && tab[1]!=0) {
			Lion h = new Lion();
			System.out.println("Reproduction effectuée !! un lionceau est né!!");
			h.sexe();h.domination();h.rang();h.impetiosite();h.setAge("Jeune");
			listLion.add(h);M
			
		}else {
			System.out.println("Reproduction impossible! (il faut avoir un male et une femelle dans le groupe");
		}
		
	}
	void declarerNonDominant() {
		
	}

	public Lion[] getCoupleDominant() {
		return coupleDominant;
	}

	public void constituerCouple(Lion lion,Lion lionne) {
		if(lion.domination.equals("Dominant")&&lion.getSexe().equals("Male")&&lionne.getSexe().equals("Femelle")||lionne.domination.equals("Dominant")&&lionne.getSexe().equals("Male")&&lion.getSexe().equals("Femelle")){
		this.coupleDominant[0] = lion;
		this.coupleDominant[1]=lionne;
	}

}

	@Override
	void addElem(Predateur pred) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void supElem(Predateur pred) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Lion> getListLion() {
		return listLion;
	}

	public void setListLion(ArrayList<Lion> listLion) {
		this.listLion = listLion;
	}
}
