package PROVA;
import java.util.Scanner;
public class ProvaQ5 {

	public static void main(String[] args) {
		
		String a [] = new String [6];
		
		Scanner ler = new Scanner (System.in);
		for (int i = 0; i<6; i++) {
			System.out.println("informe o modelo do carro");
			a[i] = ler.next();
		}
		for (int i = 0; i<6; i++) {
			System.out.println(a[i]);
		}
		
		
	}

}
//neste codido temos 6 "vagas que seram utilizadas para guardas os carros dentro do vetor que seram informados pelo usuario que apos isso le dara as possicoes dos mesmos "