package PROVA;
import java.util.Scanner;
public class PROVAQ2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); //temos  scanner LER  para que seja posivel a intrerpretaçao do pc sobre os codigos exemplo ler.nextDouble() 
		
		double valA, valB, valC; // temos a decclaraçao das variaveis e double para demontra numeros com virgulas e valores mais exatos
		
		 System.out.println("informe o valor da base:"); //System.out.println fara com que a mensagem informada a sua frente apareça ao o usuario
		 valB= ler.nextDouble(); // temos  aqui interpretaçao do texto escrito e apos issi a especificaçao do valor da variavel
		 System.out.println("informe a altura");//System.out.println fara com que a mensagem informada a sua frente apareça ao o usuario
		 valC= ler.nextDouble();// temos  aqui interpretaçao do texto escrito e apos issi a especificaçao do valor da variavel
		 valA= (valB*valC)/2; //aqui temos a especificaçao da ultima variavel apartir do resultado da seguinte operaçao (valB*valC)/2 
		 
		 System.out.println("a area apresentada é:"+valA); //System.out.println fara com que a mensagem informada a sua frente apareça ao o usuario com o acressimo do resultado a aperaçap 

	}

}
