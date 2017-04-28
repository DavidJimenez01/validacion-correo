/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author david jimenez - duvan poveda
 */
public class Panel1 extends JPanel implements ActionListener {
    
   
    
    private Ventanacorreo ventana;
    
    private JLabel nombre1,nombre2,universidad;
    
    
    public Panel1 (Ventanacorreo ventana){
        
        this.ventana = ventana;
        
        setLayout(null);
        
        ImageIcon icono = new ImageIcon("C://Users//david//Pictures//Saved Pictures //logo.jpg");
        
        
        nombre1 = new JLabel("DUVAN POVEDA");
        nombre1.setBounds(400, 100, 100, 30);
        add(nombre1);
        nombre2 = new JLabel("DAVID JIMENEZ");
        nombre2.setBounds(400, 120, 100, 30);
        add(nombre2);
        universidad = new JLabel("UDEC");
        universidad.setBounds(400, 160, 100, 30);
        add(universidad);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
