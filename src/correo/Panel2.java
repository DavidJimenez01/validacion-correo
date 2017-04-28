/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author david jimenez - duvan poveda
 */
public class Panel2 extends JPanel implements ActionListener{
    
    private Ventanacorreo ventana;
    
    private JLabel correo,validacion;
    private JTextField JTcorreo,JTvalidacion;
    private String correoelectro;
    
    Scanner teclado = new Scanner(System.in);

    
    
    
    
    public Panel2(Ventanacorreo ventana){
        
     
        correoelectro = teclado.nextLine();
        this.ventana = ventana;
        setLayout(null);
        
        correo = new JLabel("correo electronico: ");
        validacion = new JLabel ("validacion: ");
        
        correo.setBounds(150, 30, 150, 20);
        add(correo);
        validacion.setBounds(150, 80, 150, 20);
        add(validacion);
        
        JTcorreo = new JTextField ();
        JTcorreo.setBounds(310, 30, 250, 20);
        JTcorreo.setText(correoelectro);
        add(JTcorreo);
        JTvalidacion = new JTextField();
        JTvalidacion.setBounds(310, 80, 250, 40);
        add(JTvalidacion);
        
    
}

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCorreoelectro() {
        return correoelectro;
    }

    public void setCorreoelectro(String correoelectro) {
        this.correoelectro = correoelectro;
    }

    
    
    
    
}
