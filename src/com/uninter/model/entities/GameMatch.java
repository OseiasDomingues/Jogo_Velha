package com.uninter.model.entities;

public class GameMatch {
    public final static int PLAYER_01 = 1;
    public final static int PLAYER_02 = 2;

    private Player player;
    private Maquina maquina;
    private Control control;


    public GameMatch(int nivel) {
        Tabuleiro tabuleiro = new Tabuleiro();
        Player player = new Player("João");
        Maquina maquina = new Maquina(nivel,tabuleiro);
        Control control = new Control(tabuleiro, maquina);
        tabuleiro.addBotoes(control);
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
