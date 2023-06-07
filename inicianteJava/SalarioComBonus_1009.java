package inicianteJava;

import java.io.IOException;
import java.util.Scanner;

public class SalarioComBonus_1009 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		String nome = sc.nextLine();
		double salarioFixo = sc.nextDouble();
		double totalVendas = sc.nextDouble();
		
		double comissao = totalVendas * 0.15;
		double total = salarioFixo + comissao;
		
		System.out.printf("TOTAL = R$ %.2f", total);

		sc.close();

	}

}
