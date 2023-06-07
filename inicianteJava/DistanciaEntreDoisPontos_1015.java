package inicianteJava;

import java.io.IOException;
import java.util.Scanner;

public class DistanciaEntreDoisPontos_1015 {

	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);
		
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		double distancia = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		
		System.out.printf("%.4f\n", distancia);
		
		sc.close();

	}

}
