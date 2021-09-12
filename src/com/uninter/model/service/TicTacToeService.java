package com.uninter.model.service;

import com.uninter.model.entities.GameMatch;
import com.uninter.model.entities.Maquina;
import com.uninter.model.entities.Tabuleiro;

import javax.swing.*;

public class TicTacToeService {

    private Tabuleiro tabuleiro;
    private Maquina maquina;

    public TicTacToeService(Tabuleiro tabuleiro, Maquina maquina) {
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
        if (tabuleiro.getBotoesArray()[0].getQuemJogou() == jog && tabuleiro.getBotoesArray()[1].getQuemJogou() == jog && tabuleiro.getBotoesArray()[2].getQuemJogou() == jog) {
            return true;
        }
        if (tabuleiro.getBotoesArray()[3].getQuemJogou() == jog && tabuleiro.getBotoesArray()[4].getQuemJogou() == jog && tabuleiro.getBotoesArray()[5].getQuemJogou() == jog) {
            return true;
        }
        if (tabuleiro.getBotoesArray()[6].getQuemJogou() == jog && tabuleiro.getBotoesArray()[7].getQuemJogou() == jog && tabuleiro.getBotoesArray()[8].getQuemJogou() == jog) {
            return true;
        }
        if (tabuleiro.getBotoesArray()[0].getQuemJogou() == jog && tabuleiro.getBotoesArray()[3].getQuemJogou() == jog && tabuleiro.getBotoesArray()[6].getQuemJogou() == jog) {
            return true;
        }
        if (tabuleiro.getBotoesArray()[1].getQuemJogou() == jog && tabuleiro.getBotoesArray()[4].getQuemJogou() == jog && tabuleiro.getBotoesArray()[7].getQuemJogou() == jog) {
            return true;
        }
        if (tabuleiro.getBotoesArray()[2].getQuemJogou() == jog && tabuleiro.getBotoesArray()[5].getQuemJogou() == jog && tabuleiro.getBotoesArray()[8].getQuemJogou() == jog) {
            return true;
        }
        if (tabuleiro.getBotoesArray()[0].getQuemJogou() == jog && tabuleiro.getBotoesArray()[4].getQuemJogou() == jog && tabuleiro.getBotoesArray()[8].getQuemJogou() == jog) {
            return true;
        }
        if (tabuleiro.getBotoesArray()[2].getQuemJogou() == jog && tabuleiro.getBotoesArray()[4].getQuemJogou() == jog && tabuleiro.getBotoesArray()[6].getQuemJogou() == jog) {
            return true;
        }
        return false;

    }





    }

