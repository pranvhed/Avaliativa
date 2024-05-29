package PROVA;
import java.util.Scanner;
public class provaQ1 {

	public static void main(String[] args) {   
		Scanner ler=new Scanner (System.in);     //temos  scanner LER  para que seja posivel a intrerpretaçao do pc sobre os codigos

		double val1, val2, soma,sub,vezes,div; 	 //temos a declaraçao de variaveis onde seram 6

		System.out.print("Informe o VALOR A: ");  //aqui temos a System.out.print para que a mensagem que apareça  texto especificado

		val1= ler.nextDouble(); //o usuario determina o valor da variavel

		System.out.print("Informe o VALOR B: ");  //aqui temos a System.out.print para que a mensagem que apareça  texto especificado

		val2= ler.nextDouble();  //o usuario determina o valor da variavel	 

		soma= val1+val2;  //temos especificaçao das variaveis citadas antoriormente onde a soma recebera o valor apartir da soma dos valres do usuario

		sub= val1-val2;  //temos a especificaçao da sub apartir das subtraçoes especificadas pelo usuario

		vezes= val1*val2; //temos a especificacao da vezes apartir da multiplicaçao dos valores dados pelo usuario

		div= val1/val2; //temos a especificaçao da divisao apartir da divisao feita pelos valores entregues pelo usuario
	 
		System.out.println("resultado da soma é: "+soma); //a mensagem especicada aparecera para usuario com o acrescimo do resultado da operaçao soma
		
		System.out.println("resultado da subtração: "+sub); //a mensagem especicada aparecera para usuario com o acrescimo do resultado da operaçao subtraçao
		
		System.out.println("resultado da multiplicação: "+vezes); //a mensagem especicada aparecera para usuario com o acrescimo do resultado da operaçao vezes
		
		System.out.println("resultado da divisão: "+div); //a mensagem especicada aparecera para usuario com o acrescimo do resultado da operaçao div

	} 
            
             }

