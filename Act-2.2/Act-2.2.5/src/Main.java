import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

		static public void main(String[] args) throws FileNotFoundException, IOException {
			
			
			     File file = new File("C:\\Users\\obensalha\\eclipse-workspace\\Act-2.2.5\\src\\Main.java");
			     FileReader fr = new FileReader(file);
			 
			     
			     
			     try (BufferedReader br = new BufferedReader(fr)) {
					ArrayList<String> list = new ArrayList<>();
					String line;
					int a = 0;
					 while ((line=br.readLine())!=null) {
						a++;
						list.add(line);
						System.out.println(line);
						
					}
					 
					 for(int i = a;i>0;i--) {
						 System.out.println(list.get(i-1));
						 File file1 = new File("C:\\Users\\obensalha\\eclipse-workspace\\Act-2.2.5\\src\\monFichier_L"+i+".txt");
						 FileWriter fw = new FileWriter(file1);
						 try (BufferedWriter bw = new BufferedWriter(fw)) {
							bw.write(list.get(i-1));
						}
					 }
					 for(int i = a;i>0;i--) {
						 File file1 = new File("C:\\Users\\obensalha\\eclipse-workspace\\Act-2.2.5\\src\\monFichier_L"+i+".txt");
						 FileReader fr2 = new FileReader(file1);
						 try (BufferedReader br2 = new BufferedReader(fr2)) {
							 line=br2.readLine();		 
						 System.out.println(line);
						 line.stripIndent();
						 System.out.println("le nombre de lettres dans la ligne "+i+" est: "+line.length());
						}
					 }
								
							
					}
				
			     
		}
		
}
