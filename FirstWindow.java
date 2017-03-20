/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;


public class FirstWindow extends JFrame
{
    public static final int WIDTH = 300; 
    public static final int HEIGHT = 200;

    public FirstWindow( )
    {
        super( );
        setSize(WIDTH, HEIGHT);

        setTitle("First Window Class");

        setDefaultCloseOperation(
                              JFrame.DO_NOTHING_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton endButton = new JButton("Click to end program.");
        endButton.addActionListener(new EndingListener( ));
        add(endButton);
    }
    
    public static void main(String[] args) 
    {
        FirstWindow w = new FirstWindow( );
        w.setVisible(true);
    }
}


