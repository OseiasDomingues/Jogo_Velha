package com.uninter.model.entities;

import com.uninter.model.service.TicTacToeService;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ButtonController extends JButton implements ActionListener {
//CLASSE JOGADOR REQUISTADA NO TRABALHO

	private TicTacToeService ticTacToeService;

	static int playerJogando = GameMatch.PLAYER_01;
	private int quemJogou = 0;
	static int rodadas = 0;

	public int getQuemJogou() {
		return quemJogou;
	}

	static int test = 1;

	public ButtonController(TicTacToeService ticTacToeService){
		setBackground(Color.WHITE);

		this.ticTacToeService = ticTacToeService;

		addActionListener(e->{

			if(playerJogando == GameMatch.PLAYER_01 && quemJogou == 0) {

				setIcon(new ImageIcon(getClass().getResource("../images/circulo.png")));
				quemJogou = playerJogando;
				playerJogando = ticTacToeService.mudarVez(playerJogando);
				//Há ação do primero botão desencadeia o segundo
				ticTacToeService.jogar(playerJogando);
			}
			else{

				setIcon(new ImageIcon(getClass().getResource("../images/x.png")));
				quemJogou = playerJogando;
				playerJogando = ticTacToeService.mudarVez(playerJogando);

			}
			rodadas++;
			System.out.println(rodadas);
			ticTacToeService.testarVitoria(quemJogou);
			ticTacToeService.testarVelha(rodadas);


		});
	}


	@Override
	public void actionPerformed(ActionEvent e) {



		//Ação quando acontecer uma ação no botão

		//TODO ;
		addActionListener(this);

	}
}
				
				
			
			
	
			
			
		
			

