package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double a,b;		
		
		System.out.println("Qual o primeiro número? ");
		a= scan.nextInt();
		System.out.println("Qual o segundo número? ");
		b= scan.nextInt();
		
		double soma = soma(a,b);
		double subtracao = subtracao(a,b);
		double multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println("O total da soma é: " + soma);
		System.out.println("O total subtração é: " + subtracao);
		System.out.println("O total da multiplicação é: " + multiplicacao);
		System.out.println("O total da divisão é: " + divisao);
		
		
	}

	public static double soma (double a, double b) {
		return a + b;
	}
	
	public static double subtracao (double a, double b) {
		return a - b;
	}
	
	public static double multiplicacao (double a, double b) {
		return a * b;
	}
	public static double divisao (double a, double b) {
		return a / b;
	}
}
