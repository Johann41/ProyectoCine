
package modelo;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        
        Ventana_Principal ventana = new Ventana_Principal();
        ventana.pack();          
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        ventana.setVisible(true);        
        //cambio
    }
}
