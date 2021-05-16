package com.uninter;

import java.awt.*;
import javax.swing.*;

public class janela extends JFrame{
			
		JPanel tela = new JPanel(new GridLayout(3,3,10,10)); //Criação de uma tela 3x3
		static JLabel informacao = new JLabel("JOGO DA VELHA - Nivel : " + jv_main.nivel);
		static button[] botoesArray = new button[9]; //Criação dos botões para colocar x ou o
	
		static boolean teste2 = false;
		
		//Contrutor
		public janela() {  		
			configurarJanela();
			configurarTela();
		}
		//Crição da tela 3x3 + label de informações
		public void configurarTela() { 
			add(BorderLayout.NORTH, informacao); //Label
			informacao.setFont(new Font("Arial", Font.BOLD,35));
			informacao.setForeground(new Color(230,150,35));
			informacao.setHorizontalAlignment(SwingConstants.CENTER);
			//Botoes
			add(BorderLayout.CENTER, tela); 
			tela.setBackground(Color.BLACK);
			for (int i = 0; i < 9; i++){
				button objButton = new button();
				botoesArray[i] = objButton;  //objBotoes contem setBackground(color.white) + Ação;
				tela.add(objButton);
			}
		}
		//Metodo de criação de uma janela
		public void configurarJanela() { 
			setTitle("Jogo da Velha");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setSize(600,600);
			setLocationRelativeTo(null);
			setVisible(true);
		}
	}



			


