/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package caixaeletronico;

/**
 *
 * @author marcelosiedler
 */
public class Banco {
    String numero;
    String nome;
    
    //SOLUÇÃO 1 - SEM RETORNO
    void buscarBanco1(String vnumero)
    {
        if(vnumero.equals("001"))
        {
            numero = vnumero;
            nome = "Banco do Brasil";
        } else if(vnumero.equals("047"))
        {
            numero = vnumero;
            nome = "Banco do Estado do Sergipe";
        } else if(vnumero.equals("037"))
        {
            numero = vnumero;
            nome = "Banco do estado do Pará";
        } else if(vnumero.equals("041"))
        {
            numero = vnumero;
            nome = "Banco do Estado do Rio Grande do Sul";
        } else if(vnumero.equals("004"))
        {
            numero = vnumero;
            nome = "Banco do Nordeste";
        } else
        {
            numero=null;
            nome = null;
        }
    }
    
}
