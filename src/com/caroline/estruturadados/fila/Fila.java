package com.caroline.estruturadados.fila;
import com.caroline.estruturadados.base.EstruturaEstatica;


public class Fila <T> extends EstruturaEstatica<T> {
	
	public Fila() {
		super();
	}
	
	public Fila(int capacidade) {
		super(capacidade);
	}
	
	public void enfileira(T elemento) {
		super.adiciona(elemento);
	}
	
	public T incioFila(){
		if (this.estaVazia()) {
			return null;
		}
		return this.elementos[0];
	}
	
	public T desenfileira() {
		if (this.estaVazia()) {
			return null;
		}
		
		final int POS = 0;
		
		T elementoRemovido = this.elementos[POS];
		
		this.remove(POS);
		
		return elementoRemovido;
	}
}
