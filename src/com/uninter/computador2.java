package com.uninter;

public class computador2 extends computadores{
	public computador2(int dificuldade) {
		super(dificuldade);
		
	}
	//Dificulade 2 : Coloca sempre na ultima posição disponivel
	public static void jogar() {
		for (int i = 8; i > 0; i--) {
			if (janela.botoesArray[i].quem == 0 && button.j_vez == computadores.jogador2) {
				janela.botoesArray[i].doClick();
				i = 1;								
			}
		}		
	}
}
