package inicianteJava;

import java.util.Locale;
import java.util.Scanner;

public class AreaDoCirculo_1002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		// locale is not accepted on beecrowd

		Scanner sc = new Scanner(System.in);
        
        double raio = sc.nextDouble();
        
        double area = 3.14159 * Math.pow(raio, 2);
            
        System.out.printf("A=%.4f\n", area);
        
        sc.close();

	}

}
