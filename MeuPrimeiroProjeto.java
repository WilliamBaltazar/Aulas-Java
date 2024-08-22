/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.meuprimeiroprojeto;

/**
 *
 * @author CAMARGO
 */
public class MeuPrimeiroProjeto {

    public static void main(String[] args) {
    Pincel p = new Pincel();
    p.cor = "verde";
    p.espessura = "2.0";
    p.tipo = "Lousa";
    p.formato = "Redondo";
    
    p.desenhar();
    p.escrever();
    p.marcar();
    p.pintar();
    }
    
    
    
     
}
