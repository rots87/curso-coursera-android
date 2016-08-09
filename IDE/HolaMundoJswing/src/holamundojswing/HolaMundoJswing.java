/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundojswing;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Rots87
 */


public class HolaMundoJswing extends JFrame implements ActionListener{
    private final JLabel label1;
    private final JButton boton1;
    
    public HolaMundoJswing(){
        setLayout(null);
        label1=new JLabel("Hola Mundo.");
        label1.setBounds(10,20,200,30);
        boton1 = new JButton();
        boton1.setBounds(10,40,200,30);
        boton1.setToolTipText("Clic para cerrar");
        add(label1);
        add(boton1);
        boton1.addActionListener(this);
      }
    
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
            if (e.getSource()==boton1) {
                System.exit(0);
            }
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