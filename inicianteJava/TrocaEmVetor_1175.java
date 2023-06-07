package inicianteJava;
import java.util.Scanner;

public class TrocaEmVetor_1175 {

	public static void main(String[] args) {
		
        Scanner leitor = new Scanner(System.in);

        int auxiliar;
        int[] N = new int[20];
        for (int i = 0; i < N.length; i++) {
            N[i] = leitor.nextInt();
        }
        for (int i = 0; i < (N.length / 2); i++) {
        	auxiliar = N[i];
        	N[i] = N[N.length - 1- i];
        	N[N.length - 1 -i] = auxiliar;
        }
        for (int i=0; i < N.length; i++) {
            System.out.println("N["+ i +"] = " + N[i]);
        }
        
        leitor.close();
    }

	}

