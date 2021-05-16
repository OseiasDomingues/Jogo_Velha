package com.uninter;

public class computador1 extends computadores{
	public computador1(int dificuldade) {
		super(dificuldade);
		
	}
	//Dificulade 1 : Coloca sempre na primeira posição disponivel
	public static void jogar() {
		for (int i = 0; i < 8; i++) {
			if (janela.botoesArray[i].quem == 0 && button.j_vez == computadores.jogador2) {
				janela.botoesArray[i].doClick();
				i = 7;								
			}
		}		
	}
}
