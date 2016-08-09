/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundojswing;
import javax.swing.*;

/**
 *
 * @author Rots87
 */
public class HolaMundoJswing extends JFrame{
    private final JLabel label1;
    
    public HolaMundoJswing(){
        setLayout(null);
        label1=new JLabel("Hola Mundo.");
        label1.setBounds(10,20,200,30);
        add(label1);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HolaMundoJswing formulario1 = new HolaMundoJswing();
        formulario1.setBounds(10, 10, 400, 300);
        formulario1.setVisible(true);
    }
    
}
