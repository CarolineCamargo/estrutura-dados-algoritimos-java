package com.caroline.estruturadados.pilha.labs;

import java.util.Scanner;

import com.caroline.estruturadados.pilha.Pilha;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

		Pilha<Integer> pilha = new Pilha<Integer>();

		for (int i=1; i<=10; i++) {
			System.out.println("Entre com um n�mero:");

			int num = scan.nextInt();

			if (num % 2 ==0) {
				System.out.println("Empilhando n�mero " + num);
				pilha.empilha(num);
			} else {
				Integer desempilhado = pilha.desempilha();

				if (desempilhado == null) {
					System.out.println("Pilha est� vazia");
				} else {
					System.out.println("N�mero �mpar, desempilhando o elemento " + desempilhado + " da pilha.");
				}
			}

		}

		System.out.println("Todos os n�meros foram lidos, desempilhando n�meros da pilha");
		while (!pilha.estaVazia()) {
			System.out.println("Desempilhando o elemento " + pilha.desempilha());
		}

		System.out.println("Todos elementos foram desempilhados");
	}
}
