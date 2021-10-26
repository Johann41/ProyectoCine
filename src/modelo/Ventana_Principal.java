
package modelo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Ventana_Principal extends JFrame{   // Cambio :)
       
    private JPanel menu;
    CatalogoPeliculas panelCatalogoPeliculas;
    //JPanel altaPeliculas;
    //public JPanel ventaTickets;
    Lugar panelLugares;         
    JScrollPane scrollpaneles1;
    JScrollPane scrollpaneles2;
    public Ventana_Principal(){                                     
        
        super("CINEMA");       
        setLayout(new BorderLayout()); 
        menu = new JPanel(new GridLayout());
        add(menu,BorderLayout.NORTH); 
        menu();
        //catalogoPeliculas();
        Lugares();
        
                     
    }
    private void catalogoPeliculas(){                             
        panelCatalogoPeliculas = new CatalogoPeliculas();   
        scrollpaneles2 = new JScrollPane();        
        add(scrollpaneles2,BorderLayout.CENTER);
    }
    private void Lugares(){              
      panelLugares = new Lugar();
      scrollpaneles1 = new JScrollPane();     
      add(scrollpaneles1,BorderLayout.CENTER);
    }  
    private void definirPanelLugares(Lugar panel){
        scrollpaneles1.setViewportView(panel);
    }
    private void definirPanelPeli(CatalogoPeliculas panel){
        scrollpaneles1.setViewportView(panel);
    }
    private void menu(){
           
        //Botones
         JButton b1;
         JButton b2;
         JButton b3;
         JButton b4;     
         
         //Imagenes
         ImageIcon imag1 = new ImageIcon("movie.png");
         ImageIcon imag2 = new ImageIcon("tikect.png");
         ImageIcon imag3 = new ImageIcon("asiento.png");
         ImageIcon imag4 = new ImageIcon("catalogo.png");
           
         b1 = new JButton("Catalogo de películas");     
         b1.setBackground(new Color(236, 140, 9));
         b1.setFont(new Font("Agency FB",Font.BOLD,20)); 
         b1.setIcon(new ImageIcon(imag4.getImage().getScaledInstance
        (100, 40,Image.SCALE_SMOOTH)));         
         //catalogo
         menu.add(b1);
         
         b1.addActionListener(new ActionListener() {  //Muestra el panel cataloPeliculas
             @Override
             public void actionPerformed(ActionEvent event) {
               if(event.getSource()==b1){
                   definirPanelPeli(panelCatalogoPeliculas);
               }        
             }
         });
        
         b2 = new JButton("Alta de Películas");
         b2.setBackground(new Color(236, 140, 9));
         b2.setFont(new Font("Agency FB",Font.BOLD,20)); 
         b2.setIcon(new ImageIcon(imag1.getImage().getScaledInstance
         (100, 40,Image.SCALE_SMOOTH)));
         //movie
         menu.add(b2);
         
          b2.addActionListener(new ActionListener() {  //Muestra el panel altaPeliculas
             @Override
             public void actionPerformed(ActionEvent event) {
               if(event.getSource()==b2){
                 panelCatalogoPeliculas.setVisible(false);
               }    
             }
         });
         
         b3 = new JButton("Venta de Tikects");
         b3.setBackground(new Color(236, 140, 9));
         b3.setFont(new Font("Agency FB",Font.BOLD,20)); 
         b3.setIcon(new ImageIcon(imag2.getImage().getScaledInstance
        (100, 40,Image.SCALE_SMOOTH)));
         //tikets
         menu.add(b3);
         
           b3.addActionListener(new ActionListener() {  //Muestra el panel altaPeliculas
             @Override
             public void actionPerformed(ActionEvent event) {
               if(event.getSource()==b3){
                   panelCatalogoPeliculas.setVisible(false);
               }               
             }
         });
         
         b4 = new JButton("Selección de Lugares"); 
         b4.setBackground(new Color(236, 140, 9));
         b4.setFont(new Font("Agency FB",Font.BOLD,20)); 
         b4.setIcon(new ImageIcon(imag3.getImage().getScaledInstance
        (100, 40,Image.SCALE_SMOOTH)));
         //asiento
         menu.add(b4);
         
           b4.addActionListener(new ActionListener() {  //Muestra el panel altaPeliculas
             @Override
             public void actionPerformed(ActionEvent event) {
               if(event.getSource()==b4){
                   panelCatalogoPeliculas.setVisible(false);
                   definirPanelLugares(panelLugares);
               }      
             }
         });
 
    }
    
}
