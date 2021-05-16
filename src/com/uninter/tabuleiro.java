package com.uninter;

public class tabuleiro {
	//Metodo para mudar vez
	public static void mudarVez() {
		if(button.j_vez == 1) {
			button.j_vez = 2;
		}
		else {
			button.j_vez = 1;
		}
		
	}
	//Teste de vitoria
	static public boolean situacaoVitoria(int jog){
		if(janela.botoesArray[0].quem==jog && janela.botoesArray[1].quem==jog && janela.botoesArray[2].quem==jog) {
			return true;
		}
		if(janela.botoesArray[3].quem==jog && janela.botoesArray[4].quem==jog && janela.botoesArray[5].quem==jog) {
			return true;
		}
		if(janela.botoesArray[6].quem==jog && janela.botoesArray[7].quem==jog && janela.botoesArray[8].quem==jog) {
			return true;
		}
		if(janela.botoesArray[0].quem==jog && janela.botoesArray[3].quem==jog && janela.botoesArray[6].quem==jog) {
			return true;
		}
		if(janela.botoesArray[1].quem==jog && janela.botoesArray[4].quem==jog && janela.botoesArray[7].quem==jog) {
			return true;
		}
		if(janela.botoesArray[2].quem==jog && janela.botoesArray[5].quem==jog && janela.botoesArray[8].quem==jog) {
			return true;
		}
		if(janela.botoesArray[0].quem==jog && janela.botoesArray[4].quem==jog && janela.botoesArray[8].quem==jog) {
			return true;
		}
		if(janela.botoesArray[2].quem==jog && janela.botoesArray[4].quem==jog && janela.botoesArray[6].quem==jog) {
			return true;
		}
		return false;
		
	}

}