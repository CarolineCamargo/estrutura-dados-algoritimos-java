package com.caroline.estruturadados.base;

import com.sun.xml.internal.txw2.IllegalAnnotationException;

public class EstruturaEstatica<T> {

	protected T[] elementos;
	protected int tamanho;
	
	@SuppressWarnings("unchecked")
	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object [capacidade];
		this.tamanho = 0;
	}

	public EstruturaEstatica() {
		this(10);
	}

	public int tamanho() {
		return this.tamanho;
	}
	
	public boolean estaVazia() {
		return this.tamanho == 0;
	}

	protected boolean adiciona (T elemento) {
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} 
		return false;
	}

	protected boolean adiciona (int posicao, T elemento) {
		this.aumentaCapacidade();

		//mover todos os elementos
		for (int i=this.tamanho-1; i>=posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}
	
	public void remove(int posicao) {
		this.validarPosicaoExistente(posicao);
		
		for (int i=posicao; i<this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
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

	public void validarPosicaoExistente (int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalAnnotationException("Posi��o Inv�lida");
		}
	}
}
