package com.uninter.model.entities;

import com.uninter.model.entities.levels.MaquinaUm;
import com.uninter.model.entities.levels.MaquinaDois;
import com.uninter.model.entities.levels.MaquinaTres;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonController extends JButton implements ActionListener {
//CLASSE JOGADOR REQUISTADA NO TRABALHO

	private Control control;

	static int playerJogando = GameMatch.PLAYER_01;
	int quemJogou = 0;
	static int rodadas = 0;

	static int test = 1;

	public ButtonController(Control control){
		setBackground(Color.WHITE);

		this.control = control;

		addActionListener(e->{

			if(playerJogando == GameMatch.PLAYER_01 && quemJogou == 0) {

				setIcon(new ImageIcon(getClass().getResource("../images/circulo.png")));
				quemJogou = playerJogando;
				playerJogando = control.mudarVez(playerJogando);
				//Há ação do primero botão desencadeia o segundo
				control.jogar(playerJogando);
			}
			else{

				setIcon(new ImageIcon(getClass().getResource("../images/x.png")));
				quemJogou = playerJogando;
				playerJogando = control.mudarVez(playerJogando);

			}
			rodadas++;
			System.out.println(rodadas);
			control.testarVitoria(quemJogou);
			control.testarVelha(rodadas);


		});
	}


	@Override
	public void actionPerformed(ActionEvent e) {



		//Ação quando acontecer uma ação no botão

		//TODO ;
		addActionListener(this);

	}
}
				
				
			
			
	
			
			
		
			

