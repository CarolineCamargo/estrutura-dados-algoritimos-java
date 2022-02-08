package com.caroline.estruturadados.vetor;

import com.sun.xml.internal.txw2.IllegalAnnotationException;

public class Lista <T> {
	
	private T[] elementos;
	private int tamanho;
	
	@SuppressWarnings("unchecked")
	public Lista(int capacidade) {
		this.elementos = (T[]) new Object [capacidade];
		this.tamanho = 0;
	}
	
	public Lista() {
		this(10);
	}
	
	public int tamanho() {
		return this.tamanho;
	}

	public boolean adiciona (T elemento) {
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} 
		return false;
	}

	public boolean adiciona (int posicao, T elemento) {
		this.validarPosicaoExistente(posicao);
		this.aumentaCapacidade();

		//mover todos os elementos
		for (int i=this.tamanho-1; i>=posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
	}
		
	@SuppressWarnings("unchecked")
	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new String [this.elementos.length * 2];
			for (int i=0; i<this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i=0; i<this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(",");
		}

		if (this.tamanho>0) {
			s.append(this.elementos[this.tamanho-1]);
		}

		s.append("]");

		return s.toString();
	}


	public T busca (int posicao){
		this.validarPosicaoExistente(posicao);
		return this.elementos[posicao];
	}
	
	public T obtem(int posicao) {
		return this.busca(posicao);
	}

	public int busca (Object elemento) {
		for (int i=0; i<this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean contem(T elemento) {
		for (int i=0; i<this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return true;
			}
		}
		return false; 
		
		/*
		 * resolução Loiane
		 * public boolean contem(T elemento) {
		 * return busca(elemento) > -1; 
		 * }
		 */
	}
	
	
	
	
	public void remove(int posicao) {
		this.validarPosicaoExistente(posicao);
		
		for (int i=posicao; i<this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}
	
	public void remove(T elemento){
		int pos = this.busca(elemento);
		if (pos > -1) {
			this.remove(pos);
		}
	}

	public void limpar() {
		for (int i=this.tamanho-1; i> -1; i--) {
			this.remove(i);
		}
		
		/*
		 * opção 1 Loiane
		 * this.elementos = (T[]) new Object[this.elementos.length];
		 * 
		 * opção 2 Loiane 
		 * this.tamanho = 0;
		 * 
		 * opção 3 Loiane
		 * for (int i = 0; 1<this.tamanho; i++) {
		 * this.elementos [] = null; 
		 * } 
		 * this.tamanho = 0
		 */
	}
	
	public void validarPosicaoExistente (int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalAnnotationException("Posição Inválida");
		}
	}
	
	public int ultimoIndice (T elemento) {
		
		for (int i=this.tamanho-1; i>=0; i--) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
}
