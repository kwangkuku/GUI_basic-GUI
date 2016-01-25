/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Kwanrudee
 */
public class BasicGUI extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BasicGUI framTable = new BasicGUI();
        framTable.setVisible(true);
    }
    
    public BasicGUI(){
        //JFrame Property
        super("KWANGkuku"); //Title
        setSize(300,200);
        setLocation(500,200);
        
        //Text Label
        JLabel welcome = new JLabel ("welcome GUI");
        welcome.setBounds(70, 50, 150, 60);
        
        //Pane1
        JPanel pane1 = new JPanel();
        pane1.setLayout(null);
        pane1.add(welcome);
        
        getContentPane().add(pane1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
}
