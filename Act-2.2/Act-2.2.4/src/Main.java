import java.io.File;
import java.io.FilenameFilter;

public class Main {
	

	public static void main(String[] args) {
		File repertoire = new File("C:/Users/obensalha/Desktop/TEST");
		afficher(repertoire);
		System.out.println("\n\n\n\n");
		afficherJava(repertoire);
		
		
		

	}
	static void afficher(File file) {
		String[] tab=file.list();
		System.out.println(file.toString()+" contient:");
		for(int i =0; i<tab.length;i++) {
			File file1 = new File(file.toString()+"/"+tab[i]);
			if(file1.isFile()) {
				System.out.println(tab[i]);
			}else {
				
				afficher(file1);
			}
		
		
		}

	}
	static void afficherJava(File file) {
		FilenameFilter ext = new Ext();
		String[] tab=file.list(ext);
		System.out.println(file.toString()+"contient les fichiers .java suivants:");
		for(int i =0; i<tab.length;i++) {
			if(tab[i].contains(".")) {
				System.out.println(tab[i]);
			}else {
				File file1 = new File(file.toString()+"/"+tab[i]);
				afficherJava(file1);
			}
		
		
		}

	}
}
