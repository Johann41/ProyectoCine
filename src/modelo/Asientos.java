package asientos;

import javax.swing.JFrame;

public class Asientos {
public static void main(String[] args) {
         lugar();
    }
    
     public static void lugar(){
      Lugar lg = new Lugar();     
      lg.setLocation(410,50); //localizacion en medio
      lg.setSize(600,620); // tamaño de la ventana
      lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      lg.setVisible(true);
    }
}
