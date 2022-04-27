package atividade;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int qtd,soma=0,mult=1;
		Operacoes operacao = new Operacoes();

		System.out.print("Informe a quantidade de números: ");
		qtd = leitor.nextInt();

		int v[] = new int[qtd];

		for (int i=0; i<qtd; i++) {
			System.out.print("Informe o " + (i + 1) + "° valor: ");
			v[i] = leitor.nextInt();
			soma+=v[i];
			mult*=v[i];
		}
		
		System.out.println("\nMédia artimética: " + operacao.mediaAritmetica(soma, qtd));
		System.out.println("Média Geometrica: " + operacao.mediaGeo(mult, qtd));
		System.out.print("Números pares: ");
		operacao.pares(v, qtd);
		System.out.print("\nNúmeros impares: ");
		operacao.impares(v, qtd);
		

	}

}
