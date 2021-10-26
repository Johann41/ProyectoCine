
package modelo;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Practica_u2 extends JFrame implements ActionListener{
    
    private JButton peliculas,asientos, boletos;
    
    public Practica_u2 (){
        super("Cine");
        setLayout(null);
        getContentPane().setBackground(new Color(0,0,0));
        
        peliculas = new JButton("Cartelera");
        peliculas.setBounds(50,60,150,50);
        add(peliculas);
        asientos = new JButton("Asientos");
        asientos.setBounds(280,60,150,50);
        add(asientos);
        boletos = new JButton("Boletos");
        boletos.setBounds(500,60,150,50);
        add(boletos);
        
        peliculas.addActionListener(this);
        asientos.addActionListener(this);
        boletos.addActionListener(this);
    }
    
    public static void main(String[] args) {
        Practica_u2 vp = new Practica_u2();
        vp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vp.setSize(700, 400);
        vp.setLocation(650,300);
        vp.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == peliculas ){
            Peliculas peli = new Peliculas(this,true);
            setVisible(false);
            peli.setVisible(true);
            setVisible(true);
        }
    }
    
}
