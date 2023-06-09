package inicianteJava;

import java.io.IOException;
import java.util.Scanner;

public class NotasEMoedas_1021 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		
		int notas = (int) valor;
		int moedas = (int) ((valor - notas) * 100);
		
		int notas100 = notas / 100;
		notas = notas - notas100 * 100;
		
		int notas50 = notas / 50;
		notas = notas - notas50 * 50;
		
		int notas20 = notas / 20;
		notas = notas - notas20 * 20;
		
		int notas10 = notas / 10;
		notas = notas - notas10 * 10;
		
		int notas5 = notas / 5;
		notas = notas - notas5 * 5;
		
		int notas2 = notas / 2;
		notas = notas - notas2 * 2;
		
		int moedas1 = notas;
		notas = notas - moedas1 * 1;
		
		int moedas050 = moedas / 50;
		moedas = moedas - moedas050 * 50;
		
		int moedas025 = moedas / 25;
		moedas = moedas - moedas025 * 25;
		
		int moedas010 = moedas / 10;
		moedas = moedas - moedas010 * 10;
		
		int moedas005 = moedas / 5;
		moedas = moedas - moedas005 * 5;
		
		int moedas001 = moedas;
		
		System.out.println("NOTAS:");
		System.out.println(notas100 + " nota(s) de R$ 100.00");
		System.out.println(notas50 + " nota(s) de R$ 50.00");
		System.out.println(notas20 + " nota(s) de R$ 20.00");
		System.out.println(notas10 + " nota(s) de R$ 10.00");
		System.out.println(notas5 + " nota(s) de R$ 5.00");
		System.out.println(notas2 + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(moedas1 + " moeda(s) de R$ 1.00");
		System.out.println(moedas050 + " moeda(s) de R$ 0.50");
		System.out.println(moedas025 + " moeda(s) de R$ 0.25");
		System.out.println(moedas010 + " moeda(s) de R$ 0.10");
		System.out.println(moedas005 + " moeda(s) de R$ 0.05");
		System.out.println(moedas001 + " moeda(s) de R$ 0.01");
		
		sc.close();

	}

}
