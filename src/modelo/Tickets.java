
package modelo;

import javax.swing.JFrame;


public class Tickets {
    
    public static void main(String[] args) {
         compraTick();
    }
    
     public static void compraTick(){
      CompraTick compra = new CompraTick();     
      compra.setLocation(500,250); //localizacion en medio
      compra.setSize(600,275); // tamaÃ±o de la ventana
      compra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      compra.setVisible(true);
    }

}
