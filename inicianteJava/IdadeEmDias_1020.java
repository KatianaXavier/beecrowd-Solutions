package inicianteJava;

import java.io.IOException;
import java.util.Scanner;

public class IdadeEmDias_1020 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int idadeEmDias = sc.nextInt();
		
		int ano = idadeEmDias / 365;
		idadeEmDias = idadeEmDias - ano * 365;
		
		int mes = idadeEmDias / 30;
		idadeEmDias = idadeEmDias - mes * 30;
		
		int dia = idadeEmDias;
		
		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");
		
		sc.close();

	}

}
