
package modelo;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        
        Ventana_Principal vp = new Ventana_Principal();
        vp.pack();
        vp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vp.setVisible(true);
                
    }
}
