package Aplicação;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculadora;

public class Program {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
			
		double s = 0;
		double su = 0;
		double m = 0;
		double d = 0;
		double ex = 0;		
		double num1 = 0;
		double num2 = 0;
		
		String operacao = "s";
		boolean valido = false;
		
		 do {
			 System.out.println("\nDeseja fazer uma nova operação ? S/N ");
			 operacao = sc.next();			
			 if(operacao.equalsIgnoreCase("s")) {
				 System.out.println("Digite o Primeiro numero: ");
				 num1 = sc.nextDouble();
				System.out.println("Digite o Segundo numero: ");
				 num2 = sc.nextDouble();
				 System.out.println("Escolha a opção: ");
					System.out.println("Numero 1 soma: ");
					System.out.println("Numero 2 subtração: ");
					System.out.println("Numero 3 multiplicação: ");
					System.out.println("Numero 4 divisão: ");
					System.out.println("Numero 5 Exponenciação: ");	
				 System.out.println("Digite o tipo de operação: ");
				 int n =sc.nextInt();
				 if(n == 1) {
					s = Calculadora.soma(num1,  num2); 
					System.out.printf("Valor = %.2f%n " ,s);
				 }
				 if(n == 2) {
					 su = Calculadora.subtração(num1,  num2); 
					 System.out.printf("Valor = %.2f%n " ,su);
				 }
				 if(n== 3) {
					m = Calculadora.multiplicacao(num1, num2); 
					 System.out.printf("Valor = %.2f%n " ,m);
				 }
				 if(n== 4) {
					d = Calculadora.divisao(num1, num2);
					 System.out.printf("Valor = %.2f%n " ,d);
				 }
				 if(n ==5) {
					ex = Calculadora.exponenciacao(num1, num2);
					 System.out.printf("Valor = %.2f%n " ,ex);
				 }
			 }
			 else {
				 valido = true;
			 }
			 
		 }while(!false);		 
		
		
		
	}

}
