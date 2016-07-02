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
import java.text.DecimalFormat;

public class Jogador {
    private String nome;
    private double media;
    public Jogador(String nome, double media){
        this.nome = nome;
        this.media = media;
    }
    public String getNome(){// metodos de retorno para variaveis privada
        return nome;    
    }
    public double getMedia(){
        return media;
    }
    public String getMediaString(){
        DecimalFormat decFormat = new DecimalFormat();
        decFormat.setMaximumIntegerDigits(0);
        decFormat.setMaximumFractionDigits(3);
        decFormat.setMinimumFractionDigits(3);
        return decFormat.format(media);
    
    }
}
