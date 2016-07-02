/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
____________________________________________________
Alguem poderia me ajudar com o seguinte codigo:

Preciso tranformar exemplo 15000 (quinze mil reais) dessa forma
R$ 15.000,00
____________________________________________________
 */
package dummies2;

import java.text.DecimalFormat;

/**
 *
 * @author Asus-Augusto
 */
public class DecimalFormatStringFormat {
    
    public static void main(String[] args) {  
        double valor = 15000;  
        String formato = "R$ #,##0.00";  
        DecimalFormat d = new DecimalFormat(formato);  
        System.out.println(d.format(valor));  
    }  
} 

