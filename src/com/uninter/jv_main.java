package com.uninter;

import javax.swing.JOptionPane;

public class jv_main {
	static int nivel;
	public static void main(String[] args) {
		//Escolha de nivel da maquina
		 Object[] options = { "Um", "Dois","Três" };
	     nivel = JOptionPane.showOptionDialog(null, "Selecione a Dificuldade desejada", "Jogo da Velha",
	    		  JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
	              null, options, options[0]);  
	     
	     nivel++;
	     JOptionPane.showMessageDialog(null, "Você Escolheu o nível : " + nivel);
	     computadores.definirDif(nivel);
	     //Chamada da janela
		 new janela();
		
	}

}
