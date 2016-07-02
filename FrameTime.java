/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummies2;

/**
 *
 * @author Asus-Augusto
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;// Adicionar Textos no JFRAME
import java.awt.GridLayout;//Organiza em colunas e linhas

@SuppressWarnings("serial")
public class FrameTime  extends JFrame{
    public FrameTime() throws IOException{// METODO CONSTRUTOR !!
        JogadorPlus jogador;// objeto
        Scanner kappa = new Scanner(new File("D:\\Arquivos NetBeans\\Hankees.txt"));
        
        
        for (int num = 1; num <=9; num++){
            jogador = new JogadorPlus (kappa.nextLine(), kappa.nextDouble());// inicialização objeto com parametros
            // Esses parametros percorrem o arquivo txt, cada laço ocorre um NextLine e Um nexDouble; ou seja, vamos avançand
            // gradativamente ao longo do txt.
            
            kappa.nextLine();// esse nextLine é importante pq quando fazemos um nextDouble, nós aind anão percorremos a 
            // "quebra de linha"; precisamos percorrer a quebra de linha para que o kappa.nextLine pegue o nome seguinte, caso 
            // agente não faça isso ele vai pegar a "quebra de linha" em vez do nome.
            
            addJogadorInfo(jogador);// Parametro para o OBJETO (({JLabel}))
            
            
        }
        add(new JLabel( ));
        add(new JLabel("-------"));
        add(new JLabel("Média de Rebatimento do time:"));
        add(new JLabel(JogadorPlus.calcMediaTimeString()));




// Janelita
        setTitle("Os Hankees");
        
        setLayout(new GridLayout(11, 2, 20, 3));// Como funfa os parametros?
        
  // setLayout(new GridLayout( NumeroLinhas, Numero Colunas, Distancia Horizontal Colunas, Distancia vertical Linhas)
 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        pack();// Organiza o tamanho da janelinha, considerando o conteudo a ser exibido!!
        
        setVisible(true);
        
    }
    void addJogadorInfo(JogadorPlus jogador){// objetos adicionados dentro do JFrame
    add(new JLabel (" " + jogador.getNome()));
    add(new JLabel(jogador.getMediaString()));
    }
}
