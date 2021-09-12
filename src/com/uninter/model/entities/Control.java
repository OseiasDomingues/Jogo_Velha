package com.uninter.model.entities;

import javax.swing.*;

public class Control {

    private Tabuleiro tabuleiro;
    private Maquina maquina;

    public Control(Tabuleiro tabuleiro, Maquina maquina) {
        this.tabuleiro = tabuleiro;
        this.maquina = maquina;
    }


    //Metodo para mudar vez
    public int mudarVez(int playerJogando) {
        if (playerJogando == GameMatch.PLAYER_01) {
            return GameMatch.PLAYER_02;
        } else {
            return GameMatch.PLAYER_01;
        }
    }

    public void jogar(int playerJogando){
        maquina.maquinaJogar(playerJogando);
    }



    //Testar Vitoria
    public void testarVitoria(int quemJogou) {
        if (situacaoVitoria(quemJogou)) {
            JOptionPane.showMessageDialog(null, "Jogador " + quemJogou + " Venceu!");
            System.exit(0);
        }
    }

    //Testa velha
	public void testarVelha(int rodadas){
        if(rodadas==9){
        JOptionPane.showMessageDialog(null, "Deu velha!");
        System.exit(0);
    }}


    //Teste de vitoria
    public boolean situacaoVitoria(int jog) {
        if (tabuleiro.getBotoesArray()[0].quemJogou == jog && tabuleiro.getBotoesArray()[1].quemJogou == jog && tabuleiro.getBotoesArray()[2].quemJogou == jog) {
            return true;
        }
        if (tabuleiro.getBotoesArray()[3].quemJogou == jog && tabuleiro.getBotoesArray()[4].quemJogou == jog && tabuleiro.getBotoesArray()[5].quemJogou == jog) {
            return true;
        }
        if (tabuleiro.getBotoesArray()[6].quemJogou == jog && tabuleiro.getBotoesArray()[7].quemJogou == jog && tabuleiro.getBotoesArray()[8].quemJogou == jog) {
            return true;
        }
        if (tabuleiro.getBotoesArray()[0].quemJogou == jog && tabuleiro.getBotoesArray()[3].quemJogou == jog && tabuleiro.getBotoesArray()[6].quemJogou == jog) {
            return true;
        }
        if (tabuleiro.getBotoesArray()[1].quemJogou == jog && tabuleiro.getBotoesArray()[4].quemJogou == jog && tabuleiro.getBotoesArray()[7].quemJogou == jog) {
            return true;
        }
        if (tabuleiro.getBotoesArray()[2].quemJogou == jog && tabuleiro.getBotoesArray()[5].quemJogou == jog && tabuleiro.getBotoesArray()[8].quemJogou == jog) {
            return true;
        }
        if (tabuleiro.getBotoesArray()[0].quemJogou == jog && tabuleiro.getBotoesArray()[4].quemJogou == jog && tabuleiro.getBotoesArray()[8].quemJogou == jog) {
            return true;
        }
        if (tabuleiro.getBotoesArray()[2].quemJogou == jog && tabuleiro.getBotoesArray()[4].quemJogou == jog && tabuleiro.getBotoesArray()[6].quemJogou == jog) {
            return true;
        }
        return false;

    }





    }

