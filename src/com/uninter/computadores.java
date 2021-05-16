package com.uninter;

public class computadores {
	static int jogador1 = 1; //Humano
	static int jogador2 = 2; //Máquina
	int dificuldade;
	static int vJogar;
	
	//Construtor
	public computadores(int dificuldade) {
		this.dificuldade = dificuldade;
	}
	//Define qual sera a dificuldade da maquina
	public static void definirDif(int dificuldade){
		if(dificuldade == 1) 
		{
			vJogar = 1;
		}
		if(dificuldade == 2) 
		{
			vJogar = 2;
		}
		if(dificuldade == 3) 
		{
			vJogar = 3;
		}
	}
}
	



	
