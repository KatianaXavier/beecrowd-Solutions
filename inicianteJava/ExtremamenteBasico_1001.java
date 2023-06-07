package inicianteJava;

import java.io.IOException;
import java.util.Scanner;

public class ExtremamenteBasico_1001 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int X = A + B;
        
        System.out.println("X = " + X);

        sc.close();
	}

}
