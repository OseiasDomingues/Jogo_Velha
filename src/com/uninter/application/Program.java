package com.uninter.application;

import com.uninter.model.entities.*;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {

	     //Chamada da janela
		Menu menu = new Menu();
		GameMatch gameMatch = new GameMatch(menu.criarMenu());
		
	}

	//TODO Update ao clickar em botao já clickado
	//TODO Menu Inicial
	//TODO Procurar outras melhorias

}
