package inicianteJava;

import java.io.IOException;
import java.util.Scanner;

public class Salario_1008 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int nFuncionario = sc.nextInt();
		int nHorasTrabalhadas = sc.nextInt();
		double valorHora = sc.nextDouble();
		
		double salario = nHorasTrabalhadas * valorHora;
		
		System.out.println("NUMBER =  " + nFuncionario);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		sc.close();

	}

}
