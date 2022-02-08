package com.caroline.estruturadados.pilha.labs;

import java.util.Scanner;

import com.caroline.estruturadados.pilha.Pilha;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

		Pilha<Integer> pilha = new Pilha<Integer>();

		for (int i=1; i<=10; i++) {
			System.out.println("Entre com um número:");

			int num = scan.nextInt();

			if (num % 2 ==0) {
				System.out.println("Empilhando número " + num);
				pilha.empilha(num);
			} else {
				Integer desempilhado = pilha.desempilha();

				if (desempilhado == null) {
					System.out.println("Pilha está vazia");
				} else {
					System.out.println("Número ímpar, desempilhando o elemento " + desempilhado + " da pilha.");
				}
			}

		}

		System.out.println("Todos os números foram lidos, desempilhando números da pilha");
		while (!pilha.estaVazia()) {
			System.out.println("Desempilhando o elemento " + pilha.desempilha());
		}

		System.out.println("Todos elementos foram desempilhados");
	}
}
