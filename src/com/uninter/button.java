package com.uninter;

import java.awt.*;
import javax.swing.*;

public class button extends JButton {
//CLASSE JOGADOR REQUISTADA NO TRABALHO
	int quem = 0;
	static int rodadas = 0;	
	boolean teste = false;
	static int test = 1;
	static int j_vez = computadores.jogador1;
	public button(){
		 setBackground(Color.WHITE);
		 //Ação quando acontecer uma ação no botão
		 addActionListener(e->{
				if(j_vez == computadores.jogador1 && quem == 0) {
						setIcon(new ImageIcon(getClass().getResource("circulo.png")));
						quem = computadores.jogador1;
						tabuleiro.mudarVez();
						
						//Há ação do primero botão desencadeia o segundo
						if(computadores.vJogar == 1) {
							computador1.jogar();
							}
						else if(computadores.vJogar == 2) {
							computador2.jogar();
							}
						else if(computadores.vJogar == 3) {
							if(test != 5) {
								computador3.jogar();
								}
							
							}
						}				
				else{
					setIcon(new ImageIcon(getClass().getResource("x.png")));
					quem = computadores.jogador2;
					tabuleiro.mudarVez();
					
				}
				//Testa vitoria
				if(tabuleiro.situacaoVitoria(quem)) {
					JOptionPane.showMessageDialog(null,"Jogador "+quem+" Venceu!");
					System.exit(0);
				}	
				//Testa velha
				rodadas++;
				if(rodadas==9) {
					JOptionPane.showMessageDialog(null,"Deu velha!");
					System.exit(0);
				}				
		 });
	}
}				
				
				
			
			
	
			
			
		
			

