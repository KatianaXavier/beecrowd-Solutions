package inicianteJava;

import java.io.IOException;
import java.util.Scanner;

public class OMaior_1013 {

	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if (A > B && A > C) {
			System.out.println(A + " eh o maior");
		} else if (B > C) {
			System.out.println(B + " eh o maior");
		} else {
			System.out.println(C + " eh o maior");
		}
		
		sc.close();

	}

}
