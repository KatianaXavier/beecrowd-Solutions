package inicianteJava;

import java.io.IOException;
import java.util.Scanner;

public class Consumo_1014 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		double Y = sc.nextDouble();
		
		double consumo = X / Y;
		
		System.out.printf("%.3f km/l\n", consumo);
		
		sc.close();

	}

}
