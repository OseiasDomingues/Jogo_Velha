package com.uninter.model.entities;

import com.uninter.model.service.TicTacToeService;

public class GameMatch {
    public final static int PLAYER_01 = 1;
    public final static int PLAYER_02 = 2;

    private Player player;
    private Maquina maquina;
    private TicTacToeService ticTacToeService;


    public GameMatch(int nivel) {
        Tabuleiro tabuleiro = new Tabuleiro();
        Player player = new Player("João");
        Maquina maquina = new Maquina(nivel,tabuleiro);
        TicTacToeService ticTacToeService = new TicTacToeService(tabuleiro, maquina);
        tabuleiro.addBotoes(ticTacToeService);
        startGame();
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player1) {
        this.player = player;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    public void startGame(){
        //....
    }
}
