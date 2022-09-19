package entities;

public class Calculadora {

	public static double soma(double num1 , double num2) {
		return  num1 + num2;
	}
	public static double subtração(double num1 ,double num2) {
		return  num1 - num2;
	}
	public static double multiplicacao(double num1 ,double num2) {
		return  num1 * num2;
	}
	public static double divisao(double num1 ,double num2) {
		return  num1 / num2;
	}
	public static double exponenciacao(double num1 ,double num2) {
		return Math.pow(num1, num2);		
	}
	
}
