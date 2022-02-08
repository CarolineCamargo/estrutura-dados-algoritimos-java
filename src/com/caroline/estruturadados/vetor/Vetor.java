package com.caroline.estruturadados.vetor;

import com.sun.xml.internal.txw2.IllegalAnnotationException;

public class Vetor {

	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new String [capacidade];
		this.tamanho = 0;
	}

	public boolean adiciona (String elemento) {
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} 
		return false;
	}

	public boolean adiciona (int posicao, String elemento) {
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

	public int tamanho() {
		return this.tamanho;
	}

	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			String[] elementosNovos = new String [this.elementos.length * 2];
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


	public String busca (int posicao){
		this.validarPosicaoExistente(posicao);
		return this.elementos[posicao];
	}

	public int busca (String elemento) {
		for (int i=0; i<this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public void remove(int posicao) {
		this.validarPosicaoExistente(posicao);
		
		for (int i=posicao; i<this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}
	
	public void validarPosicaoExistente (int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalAnnotationException("Posição Inválida");
		}
	}
}
