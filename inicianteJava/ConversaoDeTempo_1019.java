package inicianteJava;

import java.io.IOException;
import java.util.Scanner;

public class ConversaoDeTempo_1019 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int duracaoEmSegundos = sc.nextInt();
		
		int horas = duracaoEmSegundos / 3600;
		duracaoEmSegundos -= horas * 3600;
		
		int minutos = duracaoEmSegundos / 60;
		duracaoEmSegundos -= minutos * 60;
		
		int segundos = duracaoEmSegundos;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		sc.close();

	}

}
