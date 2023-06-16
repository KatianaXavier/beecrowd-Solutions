package inicianteJava;

import java.io.IOException;
import java.util.Scanner;

public class GastoDeCombustivel_1017 {

	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		int tempoGasto = sc.nextInt();
		int velMedia = sc.nextInt();
		
		double litrosNecessarios = (tempoGasto * velMedia) / 12.0;
		
		System.out.printf("%.3f\n", litrosNecessarios);
		
		sc.close();

	}

}
