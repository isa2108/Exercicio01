package atividade;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int qtd,soma=0,mult=1;
		Operacoes operacao = new Operacoes();

		System.out.print("Informe a quantidade de n�meros: ");
		qtd = leitor.nextInt();

		int v[] = new int[qtd];

		for (int i=0; i<qtd; i++) {
			System.out.print("Informe o " + (i + 1) + "� valor: ");
			v[i] = leitor.nextInt();
			soma+=v[i];
			mult*=v[i];
		}
		
		System.out.println("\nM�dia artim�tica: " + operacao.mediaAritmetica(soma, qtd));
		System.out.println("M�dia Geometrica: " + operacao.mediaGeo(mult, qtd));
		System.out.print("N�meros pares: ");
		operacao.pares(v, qtd);
		System.out.print("\nN�meros impares: ");
		operacao.impares(v, qtd);
		

	}

}
