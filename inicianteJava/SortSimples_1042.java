package inicianteJava;

import java.util.Scanner;

public class SortSimples_1042 {

	public static void main(String[] args) {
		int A, B, C;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o 1º número: ");
		A = leia.nextInt();
		
		System.out.println("Digite o 2º número: ");
		B = leia.nextInt();
		
		System.out.println("Digite o 3º número: ");
		C = leia.nextInt();
		
		leia.close();
		
		System.out.println(A + B);
		
		System.out.println("\n" + A + "\n"+ B + "\n" + C);

	}

}
