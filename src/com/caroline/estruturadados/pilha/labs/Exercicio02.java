package com.caroline.estruturadados.pilha.labs;

import java.util.Scanner;

import com.caroline.estruturadados.pilha.Pilha;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

		Pilha<Integer> pilhaPar = new Pilha<Integer>();
		Pilha<Integer> pilhaImpar = new Pilha<Integer>();

		for (int i=1; i<=10; i++) {
			System.out.println("Entre com um n�mero:");

			int num = scan.nextInt();

			if (num % 2 == 0 && num != 0) {
				System.out.println("Empilhando o n�mero " + num + " na pilha PAR");
				pilhaPar.empilha(num);

			} else if (num % 2 == 1){			
				System.out.println("Empilhando o n�mero " + num + " na pilha �MPAR");
				pilhaImpar.empilha(num);

			} else {
				if (pilhaPar.estaVazia()) {
					System.out.println("A pilha PAR est� vazia, n�o � poss�vel desempilhar");					
				} else {
					System.out.println("Desempilhando o n�mero " + pilhaPar.desempilha() + " da pilha PAR");
				}

				if (pilhaImpar.estaVazia()) {
					System.out.println("A pilha �MPAR est� vazia, n�o � poss�vel desempilhar");
				} else {
					System.out.println("Desempilhando o n�mero " + pilhaImpar.desempilha() + " da pilha �MPAR");	
				}			
			}
		}

		System.out.println("----Todos os n�meros foram lidos----");


		System.out.println("\nDesempilhando n�meros da pilha PAR");
		while (!pilhaPar.estaVazia()) {
			System.out.println("Desempilhando o elemento "  + pilhaPar.desempilha());
		}

		System.out.println("\nDesempilhando n�meros da pilha �MPAR");
		while (!pilhaImpar.estaVazia()) {
			System.out.println("Desempilhando o n�mero " + pilhaImpar.desempilha());
		}

		System.out.println("----Todos elementos foram desempilhados----");
	}
}
