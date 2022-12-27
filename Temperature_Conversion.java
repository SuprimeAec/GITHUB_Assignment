import java.util.ArrayList;
import java.util.Scanner;

public class Temperature_Conversion {

	public static void main(String[] args) {
	    
		ArrayList<Double> F = new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> C = new ArrayList<Double>();
        
        System.out.println("How many data you want to enter ? : ");
        int n = sc.nextInt();
        System.out.println("Enter The value of tempreature in Fahrenheit:");
            for ( int i = 0; i < n; i++)
            {
            	F.add(sc.nextDouble());
            	C.add((0.55*(F.get(i)-32)));
            	

         	}
            System.out.println("The values of temp in Fahrenheit are : ");
            for ( int i = 0; i < n; i++)
            {
            	System.out.println(F.get(i));
            	
            }
            System.out.println("The values of temp in Celcius are : ");

            for ( int i = 0; i < n; i++) {
            	
            	  System.out.println(C.get(i));
            }
	}
}
