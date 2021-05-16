package com.uninter;

import java.util.Random;

public class computador3 extends computadores{
	public computador3(int dificuldade) {
		super(dificuldade);
		
	}
	//Dificulade 3 : Aleatoriza um numero
	static Random gerador = new Random();
	public static void jogar() {
		int i = 0;
		while(i < 9) {
			i = gerador.nextInt(9); 
			if (janela.botoesArray[i].quem == 0 && button.j_vez == computadores.jogador2) {
				janela.botoesArray[i].doClick();
				i = 9;
				button.test++;
			}
		}		
	}
}
