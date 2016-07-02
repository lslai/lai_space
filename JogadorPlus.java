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
public class JogadorPlus  extends Jogador{// o static não reinicia toda vez q ocorre uma atualização de valor ou movimentação
    //movimentação de um laço
    private static int jogadoresCont = 0;
    private static double totalDeMedias = .000;
    private static DecimalFormat decFormat = new DecimalFormat();
    
    static{
        decFormat.setMaximumIntegerDigits(0);
        decFormat.setMaximumFractionDigits(3);
        decFormat.setMinimumFractionDigits(3);
    }
    public JogadorPlus(String nome, double media){
        super(nome, media);// Entre os parenteses da variavel super estão as variaveis do CONTRUTOR Da classe mae
        // o super "invoca" os construtores (não é herdado espontaneamente) na classe filha
        jogadoresCont++;
        totalDeMedias += media;
    }
    public static double calcMediaTime() {
        return totalDeMedias/jogadoresCont;
        
    }
    public static String calcMediaTimeString(){
        return decFormat.format(totalDeMedias/jogadoresCont);
    }
}
