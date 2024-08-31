package application;

import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Program {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		try {
			contar(parametroUm, parametroDois);
		} catch (RuntimeException e) {
			e.getMessage();
		}
		
		terminal.close();
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException("parametroUm deve ser menor que parametroDois.");
		}
		int contagem = parametroDois - parametroUm;

		for (int i = 1; i <= contagem; i++) {
			System.out.println(i);
		}

	}
	
}
