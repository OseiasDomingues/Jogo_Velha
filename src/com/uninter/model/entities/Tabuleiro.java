package com.uninter.model.entities;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;


public class Tabuleiro extends JFrame {


    private Control control;
    private JPanel tela = new JPanel(new GridLayout(3, 3, 10, 10)); //Criando de uma tela 3x3
    private JLabel informacao = new JLabel("JOGO DA VELHA - Nivel : ");
    private ButtonController[] botoesArray = new ButtonController[9]; //Cria��o dos bot�es para colocar x ou o


    //Contrutor
    public Tabuleiro() {
        configurarJanela();
        configurarTela();
    }

    //Getters e setters
    public JPanel getTela() {
        return tela;
    }

    public void setTela(JPanel tela) {
        this.tela = tela;
    }

    public JLabel getInformacao() {
        return informacao;
    }

    public void setInformacao(JLabel informacao) {
        this.informacao = informacao;
    }

    public ButtonController[] getBotoesArray() {
        return botoesArray;
    }

    public void setBotoesArray(ButtonController[] botoesArray) {
        this.botoesArray = botoesArray;
    }

    //Cri��o da tela 3x3 + label de informa��es
    public void configurarTela() {
        add(BorderLayout.NORTH, informacao); //Label
        informacao.setFont(new Font("Arial", Font.BOLD, 35));
        informacao.setForeground(new Color(230, 150, 35));
        informacao.setHorizontalAlignment(SwingConstants.CENTER);
        //Botoes
        add(BorderLayout.CENTER, tela);
        tela.setBackground(Color.BLACK);

    }

    //Metodo de cria��o de uma janela
    public void configurarJanela() {
        setTitle("Jogo da Velha");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void addBotoes(Control control){
        for (int i = 0; i < 9; i++) {
            ButtonController objButton = new ButtonController(control);
            botoesArray[i] = objButton;  //objBotoes contem setBackground(color.white) + A��o;
            tela.add(objButton);
        }
    }
}



			


