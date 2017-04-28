/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author david jimenez - duvan poveda
 */
public class Ventanacorreo extends JFrame implements ActionListener{
    
    private JMenuBar menu;
    private JMenu principal;
    private JMenu ver;
    private JMenuItem ayuda;
    private JMenuItem us;
    private JMenuItem informacion;
    private JMenuItem salir;
    
    private Panel1 panel1;
    
    private Panel2 panel2;
   
    private static final String AYUDA = "AYUDA";
    private static final String US = "US";
    private static final String INFORMACION = "INFORMACION";
    private static final String SALIR = "SALIR";
   
    public Ventanacorreo(){
        
        setSize(800, 700);
        setTitle(" VALIDACION CORREO ELECTRONICO");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        
        panel1 = new Panel1(this);
        panel1.setBounds(0, 0, 800, 350);
        panel1.setBackground(Color.ORANGE);
        add(panel1);
        
        panel2 = new Panel2(this);
        panel2.setBounds(0, 350, 800, 400);
        panel2.setBackground(Color.WHITE);
        add(panel2);
        
        
        menu = new JMenuBar();
        setJMenuBar(menu);
        
        
        principal = new JMenu("principal");
        ayuda = new JMenuItem("ayuda");
        ayuda.setActionCommand(AYUDA);
        ayuda.addActionListener(panel1);
        us = new JMenuItem ("us");
        us.setActionCommand(US);
        us.addActionListener(panel1);
        salir = new JMenuItem ("salir");
        salir.setActionCommand(SALIR);
        salir.addActionListener(panel1);
        
        principal.add(ayuda);
        principal.add(us);
        principal.add(salir);
        menu.add(principal);
        
        ver = new JMenu("ver");
        informacion = new JMenuItem ("informacion");
        informacion.setActionCommand(INFORMACION);
        informacion.addActionListener(panel1);
         
        ver.add(informacion);
        menu.add(ver);
        
       setVisible(true);

   
}

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
        
        
}
    


