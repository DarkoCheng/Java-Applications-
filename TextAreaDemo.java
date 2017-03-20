/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


import javax.swing.JFrame;
//import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TextAreaDemo extends JFrame 
                          implements ActionListener
{
    public static final int WIDTH = 400;
    public static final int HEIGHT = 200;
    public static final int NUMBER_OF_CHAR = 30;

    private JTextArea name;


    public static void main(String[] args)
    {
        TextAreaDemo gui = new TextAreaDemo( );
        gui.setVisible(true);
    }


    public TextAreaDemo( )
    {
        super("Text Area Demo");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel namePanel = new JPanel( ); 
        namePanel.setLayout(new BorderLayout( )); 

        name = new JTextArea("John Smith", 20, 10);
        //name.setLineWrap(true);
        //name.setEditable(false);
        namePanel.add(name, BorderLayout.CENTER);
        
        JLabel nameLabel = new JLabel("Enter your name here:");
        namePanel.add(nameLabel, BorderLayout.NORTH);

        add(namePanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel( );
        buttonPanel.setLayout(new FlowLayout( ));
        buttonPanel.setBackground(Color.PINK); 
        JButton actionButton = new JButton("Click me"); 
        actionButton.addActionListener(this);
        buttonPanel.add(actionButton);

        JButton clearButton = new JButton("Clear"); 
        clearButton.addActionListener(this);
        buttonPanel.add(clearButton); 

        add(buttonPanel, BorderLayout.SOUTH);
    }


    public void actionPerformed(ActionEvent e) 
    {
        String actionCommand = e.getActionCommand( );

        if (actionCommand.equals("Click me"))
            name.setText("Hello " + name.getText( ));
        else if (actionCommand.equals("Clear"))
            name.setText("");
        else
            name.setText("Unexpected error.");
    } 

}
 