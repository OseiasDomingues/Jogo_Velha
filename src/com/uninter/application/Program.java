package com.uninter.application;

import com.uninter.model.entities.*;

import javax.swing.JOptionPane;

public class Program {
	static int nivel;
	public static void main(String[] args) {
		//Escolha de nivel da maquina
		 Object[] options = { "Um", "Dois","Três" };
	     nivel = JOptionPane.showOptionDialog(null, "Selecione a Dificuldade desejada", "Jogo da Velha",
	    		  JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
	              null, options, options[0]);  
	     
	     nivel++;
	     JOptionPane.showMessageDialog(null, "Você Escolheu o nível : " + nivel);
	     //Chamada da janela


		GameMatch gameMatch = new GameMatch(nivel);

		
	}

}
