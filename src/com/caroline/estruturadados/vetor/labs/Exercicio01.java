package com.caroline.estruturadados.vetor.labs;

import com.caroline.estruturadados.vetor.Lista;

public class Exercicio01 {
	
	public static void main(String[] args) {

		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("Elemento1");
		
		System.out.println(lista.contem("Elemento1"));
		System.out.println(lista.contem("Elemento2"));
	}

}
