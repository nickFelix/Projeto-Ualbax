/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ualbax;

import javax.swing.JFrame;

/**
 *
 * @author Nicolas
 */
public class ProgramaPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TelaInicial contato1 = new TelaInicial();
        
        contato1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contato1.setSize(520,280);
        contato1.setVisible(true);
        
    }
    
}
