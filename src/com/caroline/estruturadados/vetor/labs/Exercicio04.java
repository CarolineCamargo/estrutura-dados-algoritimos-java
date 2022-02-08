package com.caroline.estruturadados.vetor.labs;

import com.caroline.estruturadados.vetor.Lista;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista (5);

		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		
		System.out.println(lista.obtem(3));
		System.out.println(lista.obtem(0));
	}

}
