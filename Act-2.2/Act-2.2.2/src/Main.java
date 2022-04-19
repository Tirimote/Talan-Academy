import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
	       BufferedReader br = null;
		
			try {
				br = new BufferedReader(new FileReader("data.txt"));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
	        // could generate FileNotFoundException (checked)
	        int max = -1;
	        String line = null;
			try {
				line = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        // peut générer IOException
	        while (line != null) {
	            int n = Integer.parseInt(line);
	            // peut générer NumberFormatException
	            if (n > max) max = n;
	            try {
					line = br.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            // peut générer IOException
	        }
	        System.out.println("Maximum = " + max);

	}

}
