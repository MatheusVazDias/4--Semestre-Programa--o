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
public class TestandooBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Banco b = new Banco();
        b.buscarBanco1("001");
        JOptionPane.showMessageDialog(null, b.nome);
                
    }
    
}
