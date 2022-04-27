package atividade;

public class Operacoes {
	
	public double mediaAritmetica(int somaVal, int qtd) {
		
		return somaVal/qtd;
	}
	
	public double mediaGeo(int multVal, int qtd) {
		
		return Math.exp((Math.log(multVal))/qtd);
	}
	
	public void pares(int v[], int qtd) {
		
		for(int i=0; i<qtd; i++) {
			if(v[i]%2==0) {
				System.out.print(v[i] + " | ");
			}
		}
		
	}
	

	public void impares(int v[], int qtd) {
		
		for(int i=0; i<qtd; i++) {
			if(v[i]%2!=0) {
				System.out.print(v[i] + " | ");
			}
		}
		
	}


}
