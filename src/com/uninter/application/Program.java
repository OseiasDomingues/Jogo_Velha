package com.uninter.application;

import com.uninter.model.entities.*;

import javax.swing.JOptionPane;

public class Program {
	static int nivel;
	public static void main(String[] args) {
		//Escolha de nivel da maquina
		 Object[] options = { "Um", "Dois","Tr�s" };
	     nivel = JOptionPane.showOptionDialog(null, "Selecione a Dificuldade desejada", "Jogo da Velha",
	    		  JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
	              null, options, options[0]);  
	     
	     nivel++;
	     JOptionPane.showMessageDialog(null, "Voc� Escolheu o n�vel : " + nivel);
	     //Chamada da janela


		GameMatch gameMatch = new GameMatch(nivel);

		
	}

}
