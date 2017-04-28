/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;




/**
 *
 * @author david jimenez - duvan poveda
 */
public class Validacion {
    
    private final String emailbuffer;
    private Panel2 correo;
    
    public Validacion(){
       
        emailbuffer = correo.getCorreoelectro();
        
    }
     
    
    public String validarcorreo(){
        
        String email = emailbuffer;
        Pattern pattern = Pattern.compile("^([^0-9!@#$%^&*/])+([\\\\w-][^!@#$%^&*/]){4,}+.*@([^0-9])[A-Za-z-]+(\\\\.[A-Za-z]+)*(\\\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(email);
        if (mather.find() == true) {
            System.out.println("el correo es valido");
        }
         
        
        return emailbuffer;    
    }
}