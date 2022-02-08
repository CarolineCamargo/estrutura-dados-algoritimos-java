package com.caroline.estruturadados.pilha.labs;

import java.util.Scanner;

import com.caroline.estruturadados.pilha.Pilha;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

		Pilha<Integer> pilhaPar = new Pilha<Integer>();
		Pilha<Integer> pilhaImpar = new Pilha<Integer>();

		for (int i=1; i<=10; i++) {
			System.out.println("Entre com um número:");

			int num = scan.nextInt();

			if (num % 2 == 0 && num != 0) {
				System.out.println("Empilhando o número " + num + " na pilha PAR");
				pilhaPar.empilha(num);

			} else if (num % 2 == 1){			
				System.out.println("Empilhando o número " + num + " na pilha ÍMPAR");
				pilhaImpar.empilha(num);

			} else {
				if (pilhaPar.estaVazia()) {
					System.out.println("A pilha PAR está vazia, não é possível desempilhar");					
				} else {
					System.out.println("Desempilhando o número " + pilhaPar.desempilha() + " da pilha PAR");
				}

				if (pilhaImpar.estaVazia()) {
					System.out.println("A pilha ÍMPAR está vazia, não é possível desempilhar");
				} else {
					System.out.println("Desempilhando o número " + pilhaImpar.desempilha() + " da pilha ÍMPAR");	
				}			
			}
		}

		System.out.println("----Todos os números foram lidos----");


		System.out.println("\nDesempilhando números da pilha PAR");
		while (!pilhaPar.estaVazia()) {
			System.out.println("Desempilhando o elemento "  + pilhaPar.desempilha());
		}

		System.out.println("\nDesempilhando números da pilha ÍMPAR");
		while (!pilhaImpar.estaVazia()) {
			System.out.println("Desempilhando o número " + pilhaImpar.desempilha());
		}

		System.out.println("----Todos elementos foram desempilhados----");
	}
}
