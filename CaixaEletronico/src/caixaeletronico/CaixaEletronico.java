/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package caixaeletronico;

import javax.swing.JOptionPane;

/**
 *
 * @author marcelosiedler
 */
public class CaixaEletronico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Instancie um objeto da classe Conta
Abrir uma conta
Depositar, colocando R$ 10,00 na conta
Tente sacar R$ 20,00
Tente sacar R$ 5,00
Verifique o saldo restante

Em cada operação exibir mensagem para o usuário dizendo se foi possível realizar a operação.
 
        */
        Boolean deucerto;
        Conta c = new Conta();
        c.abrir("0001", "1234567", "Marcelo");
        deucerto = c.depositar(10.0);
        if(deucerto==true)
        {
            JOptionPane.showMessageDialog(null, "Depósito R$10,00");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Operação não realizada");
        }   
        deucerto = c.sacar(20.0);
        if(deucerto==true)
        {
            JOptionPane.showMessageDialog(null, "Saque R$20,00");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Operação não realizada");
        } 
        deucerto = c.sacar(5.0);
        if(deucerto==true)
        {
            JOptionPane.showMessageDialog(null, "Saque R$5,00");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Operação não realizada");
        } 
        
        JOptionPane.showMessageDialog(null, c.retornarSaldo());
        
    }
    
}
