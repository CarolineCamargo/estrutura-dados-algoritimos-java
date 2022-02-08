package com.caroline.estruturadados.pilha.labs;

import com.caroline.estruturadados.pilha.Pilha;

public class Exercicio03 {

	public static void main(String[] args) {

		Pilha<Livro> livros = new Pilha<Livro> (20);

		Livro livro1 = new Livro();
		livro1.setNome("Primeirolivro");
		livro1.setIsbn("12345");
		livro1.setAnoLancamento("2022");
		livro1.setAutor("primeiro autor");

		Livro livro2 = new Livro();
		livro2.setNome("Segundo livro");
		livro2.setIsbn("23456");
		livro2.setAnoLancamento("2022");
		livro2.setAutor("segundo autor");

		Livro livro3 = new Livro();
		livro3.setNome("Terceiro livro");
		livro3.setIsbn("24567");
		livro3.setAnoLancamento("2022");
		livro3.setAutor("Terceiro autor");
		
		System.out.println("Pilha de livros criada, a pilha está vazia? \n" + livros.estaVazia());

		livros.empilha(livro1);
		livros.empilha(livro2);
		livros.empilha(livro3);
		
		System.out.println("\n" + livros.tamanho() + " livros foram empilhados:");
		
		System.out.println(livros);
		
		System.out.println("\nO livro que está no topo da pilha é o: " + livros.topo());
		
		System.out.println("\nDesempilhando o livro: " + livros.desempilha() + "\n");
		
		System.out.println(livros);
	}

}
