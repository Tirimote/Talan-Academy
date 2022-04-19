import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	
	    public static void main(String[] args) throws NumberFormatException, IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Insert a number:");
	        int c = Integer.parseInt(br.readLine());
	        first(c);
	    }

	        private static void first(int a) {
	            second(a);
	        }

	        private static void second(int b) {
	            Exception propagate = new Exception("The value is too small.");
	            try {
	            if (b < 10) {
	                throw propagate;
	            }else{
		            
		            System.out.println("OK");
		            }
	            }catch(Exception e) {
	            	System.out.println("There is a problem"+e);
	            }
	   
	}
}


