import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		File texte1 = new File("C:\\Users\\obensalha\\eclipse-workspace\\Act.2.2.7\\Texte 1.txt");
		File texte2 = new File("C:\\Users\\obensalha\\eclipse-workspace\\Act.2.2.7\\Texte 2.txt");
		File texte3 = new File("C:\\Users\\obensalha\\eclipse-workspace\\Act.2.2.7\\Texte 3.txt");
		FileReader fr1 = new FileReader(texte1);
		FileReader fr2 = new FileReader(texte2);
		FileWriter fw = new FileWriter(texte3);
		try (BufferedReader br1 = new BufferedReader(fr1)) {
			try (BufferedReader br2 = new BufferedReader(fr2)) {
				try (BufferedWriter bw = new BufferedWriter(fw)) {
					String line1,line2;
					while ((line1=br1.readLine())!=null) {
						String[] tab1=line1.split(" ");
						List<String> al = new ArrayList<String>();
						al = Arrays.asList(tab1);
						list1.addAll(al);	
					}
					while ((line2=br2.readLine())!=null) {
						String[] tab2=line2.split(" ");
						List<String> al = new ArrayList<String>();
						al = Arrays.asList(tab2);
						list2.addAll(al);
					

					}
					for (int i =0; i<list1.size() && i<list2.size();i++){
						
							bw.write(" "+list1.get(i)+" "+list2.get(i));
						
						
					}
				}
			}
		}
		File texte4 = new File("C:\\Users\\obensalha\\eclipse-workspace\\Act.2.2.7\\Texte 4.txt");
		FileWriter fw1 = new FileWriter(texte4);
		try (BufferedWriter bw1 = new BufferedWriter(fw1)) {
			for (int i =0; i<list1.size() ;i++){
				for(int j=0;j<list2.size() ;j++) {
					if(list1.get(i).compareTo(list2.get(j))==0) {
						bw1.write("Le mot <<"+list1.get(i)+">> appartient aux textes 1 et 2\n");
					}
				}
			}
				
				
			
		}

	
	}
}
