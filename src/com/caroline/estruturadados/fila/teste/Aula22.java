package com.caroline.estruturadados.fila.teste;

import com.caroline.estruturadados.fila.Fila;

public class Aula22 {

	public static void main(String[] args) {

		Fila <Integer> fila = new Fila <Integer>();

		fila.enfileira(1);
		fila.enfileira(2);
		fila.enfileira(3);

		System.out.println(fila);

		fila.desenfileira();

		System.out.println(fila);

		fila.desenfileira();

		System.out.println(fila);

	}

}
