package com.uninter.model.entities;

import java.util.Random;

public class Maquina {

    private int nivel;
    private Tabuleiro tabuleiro;

    public Maquina(int nivel, Tabuleiro tabuleiro) {
        this.nivel = nivel;
        this.tabuleiro = tabuleiro;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void maquinaJogar(int playerJogando) {


        //NIVEL 01
        if (nivel == 1) {
            for (int i = 0; i < 8; i++) {
                if (tabuleiro.getBotoesArray()[i].quemJogou == 0 &&
                        ButtonController.playerJogando == GameMatch.PLAYER_02) {
                    tabuleiro.getBotoesArray()[i].doClick();
                    i = 7;
                }
            }
        }
        //NIVEL 02
        if (this.nivel == 2) {
            for (int i = 8; i > 0; i--) {
                if (tabuleiro.getBotoesArray()[i].quemJogou == 0 &&
                        ButtonController.playerJogando == GameMatch.PLAYER_02) {
                    tabuleiro.getBotoesArray()[i].doClick();
                    i = 1;
                }
            }
        }
        //NIVEL 03
        if (this.nivel == 3 && ButtonController.test != 5) {
            Random gerador = new Random();
            int i = 0;
            while (i < 9) {
                i = gerador.nextInt(9);
                if (tabuleiro.getBotoesArray()[i].quemJogou == 0 &&
                        ButtonController.playerJogando == GameMatch.PLAYER_02) {
                    tabuleiro.getBotoesArray()[i].doClick();
                    i = 9;
                    ButtonController.test++;
                }
            }

        }


    }
}


	



	
