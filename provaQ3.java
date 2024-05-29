package PROVA;
import java.util.Scanner;
public class provaQ3 {

		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			int dia;
			System.out.println("informe um numero para um dia da semana: ");
			dia=ler.nextInt();
			
			switch (dia){
			case 1:
				System.out.println ("domingo");
				break;
			case 2:
				System.out.println ("segunda");
				break;
			case 3:
				System.out.println ("terça");
				break;
			case 4:
				System.out.println ("quarta");
				break;
			case 5:
				System.out.println ("quinta");
				break;
			case 6:
				System.out.println ("sexta");
				break;
			case 7:
				System.out.println ("sabado");
				break;
				
				default:
					System.out.println("informe um numero de 1 a 7!: ");
			}
			

	}

}
// neste codigo temos scanner LER  para que seja posivel a intrerpretaçao do pc sobre os codigos e logo apos  temos a variavel utilizando int
//um valor inteiro em seguida o usuario devera dugitar um numero de 1 a 7 que dependendo do numero selecionado  avera a switc case onde avera a verificaçao de valor 
// ate que seja enontrado a valor apresetado onde o break tera papel de freio para o codigo nao fica em loop
//caso nenhum valor seja encontrado o default entrara em açao para apresenta a System.out.println("informe um numero de 1 a 7!: ") onde apos a interaçao do usuario sera rodado novamente o codigo