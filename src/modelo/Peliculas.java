
package modelo;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JDialog;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPanel; //contenedor 
import javax.swing.JScrollPane; // contenedor de contenedores con barra de desplasamiento
public class Peliculas extends JDialog implements ActionListener{

    private JButton peliculas[];
    private String nombrep[] ={"poter.jpg","primer.jpg","joker.jpg","Chijiro.jpg","antrum.jpg"};
    private ImageIcon img,editor;
    private JLabel etiqueta;
    private JPanel panel;
    private JScrollPane scroll;
    String nombre;
    
    public Peliculas(Practica_u2 parent,boolean modal){
        super(parent,modal);
        setBounds(440,10,700,400);
        setLayout(null);
        getContentPane().setBackground(new Color(0,0,0));
        
        // Agrega el panel //
        panel = new JPanel();
        panel.setBounds(30,50,600,350); //se establece el panel a la ventana
        panel.setLayout(null); //el layout para que los componentes que se agregan al layout sean libres de poner
        panel.setBackground(Color.BLACK);
        panel.setPreferredSize(new Dimension(650,800)); //Dimencionar el panel para que se ajuste al Scroll 
        //y salga la barra
        
        // Agrega el scroll //
        scroll = new JScrollPane();
        scroll.setBounds(30,50,600,350); // Se declara el scroll a la venatana
        scroll.setViewportView(panel); //Se le aynede el panel para que se muestre en el scroll

      // Tituo de la pelicula //
      etiqueta = new JLabel("Peliculas disponibles");
      etiqueta.setBounds(260, 10, 400, 40);
      etiqueta.setFont(new Font("arial",Font.BOLD,20));
      etiqueta.setForeground(Color.BLUE);
      
      
      agregar(); //agrega los componentes restantes 
      //add(panel); // se aÃ±ade el panel a la venata pero como ya esta el scroll no es necesario ya que
      // el scroll tiene el panel
      add(scroll); // agrega el scroll y hace vicible el panel que contiene
      add(etiqueta);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == peliculas[0]){
            nombre = "Harry Poter";
        }
        if(e.getSource() == peliculas[1]){
            nombre = "Primer grado";
        }
        if(e.getSource() == peliculas[2]){
            nombre = "Harry Poter";
        }
        if(e.getSource() == peliculas[3]){
            nombre = "Harry Poter";
        }
        if(e.getSource() == peliculas[4]){
            nombre = "Harry Poter";
        }
    }
    
    public void agregar(){
        // Componentes que se agregan al panel // 
        peliculas = new JButton[nombrep.length];
        int x=50,y=20;
        for(int i = 0 ; i<peliculas.length ; ){
            img = new ImageIcon(nombrep[i]);
            editor = new ImageIcon(img.getImage().getScaledInstance(120,200, java.awt.Image.SCALE_SMOOTH));
            peliculas[i]= new JButton(editor);
            peliculas[i].setBounds(x, y, 120, 200);
            panel.add(peliculas[i]);
            i++;
            if(i%2==0){
                x=50;
                y+=250;
            }else{
                x+=350;
                y=y;
            }
        }
    }
    
    
}
