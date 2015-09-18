package br.edu.utfpr.trabalho;

public class CalculadoraCorredores {
	
	public int calcularFrequenciaLimiteMaffetone(int idade, String categoria) {
		
		int frequenciaMaxima = 0;
		
		switch (categoria) {
		case "A":
			frequenciaMaxima = 180 - idade - 10;
			break;
		
		case "B":
			frequenciaMaxima = 180 - idade - 5;
			break;
			
		case "C":
			frequenciaMaxima = 180 - idade;
			break;
			
		case "D":
			frequenciaMaxima = 180 - idade + 5;
			break;

		default:
			break;
		}
		return frequenciaMaxima;
	}
	
	public int calcularFrequenciaInicialMaffetone(int idade, String categoria){
		return calcularFrequenciaLimiteMaffetone(idade, categoria) - 10;
	}

}
