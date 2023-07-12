package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Contador;

public class Main {

	public static void main(String[] args) {
		/*
		 * uso o locale para permitir a digitaçao com ponto , em vez de virgula que é o
		 * padrao
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("entre com o valor  , para o caixa processar as cedulas :");

		
		Double numero = sc.nextDouble();
		Contador contador = new Contador();
		contador.setNumero(numero);

		System.out.println(contador.verificador(numero));

		sc.close();
	}

}
