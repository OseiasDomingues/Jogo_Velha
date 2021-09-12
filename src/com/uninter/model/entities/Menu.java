package com.uninter.model.entities;

import javax.swing.JOptionPane;

public class Menu {

    private int nivel;

    public int criarMenu(){

    String[] options = {"Level 01", "Level 02", "Level 03"};
    nivel = JOptionPane.showOptionDialog(null,"Selecione a Dificuldade desejada","Jogo da Velha",
                JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
    nivel++;

    return nivel;

    }
}


