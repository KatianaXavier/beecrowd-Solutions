package inicianteJava;

import java.io.IOException;
import java.util.Scanner;

public class Cedulas_1018 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		
		int valorAtual = valor;
		
		int notas100 = valorAtual / 100;
		valorAtual = valorAtual - notas100 * 100;
		
		int notas50 = valorAtual / 50;
		valorAtual = valorAtual - notas50 * 50;
		
		int notas20 = valorAtual / 20;
		valorAtual = valorAtual - notas20 * 20;
		
		int notas10 = valorAtual / 10;
		valorAtual = valorAtual - notas10 * 10;
		
		int notas5 = valorAtual / 5;
		valorAtual = valorAtual - notas5 * 5;
		
		int notas2 = valorAtual / 2;
		valorAtual = valorAtual - notas2 * 2;
		
		int notas1 = valorAtual / 1;
		valorAtual = valorAtual - notas1 * 1;
		
		System.out.println(valor);
		System.out.println(notas100 + " nota(s) de R$ 100,00");
		System.out.println(notas50 + " nota(s) de R$ 50,00");
		System.out.println(notas20 + " nota(s) de R$ 20,00");
		System.out.println(notas10 + " nota(s) de R$ 10,00");
		System.out.println(notas5 + " nota(s) de R$ 5,00");
		System.out.println(notas2 + " nota(s) de R$ 2,00");
		System.out.println(notas1 + " nota(s) de R$ 1,00");
		
		sc.close();
		
	}

}
