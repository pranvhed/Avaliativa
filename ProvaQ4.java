package PROVA;
import java.util.Scanner;
public class ProvaQ4 {

	public static void main(String[] args) {          
		
		        Scanner scanner = new Scanner(System.in);
		        int[] numeros = new int[15];
		        int soma = 0;

		        System.out.println("Digite 15 números:");
		        for (int i = 0; i < 15; i++) {
		            numeros[i] = scanner.nextInt();
		            soma += numeros[i];
		        }

		        System.out.println("A soma dos números é: " + soma);
		    
		
	}

}
//neste codigo temos o vetor que ira organizar os valores separadamente  ate sua capacidade maxima sendo 15 apos isso sera realizada a soma dos mesmos para serem apresentados ao usuario
