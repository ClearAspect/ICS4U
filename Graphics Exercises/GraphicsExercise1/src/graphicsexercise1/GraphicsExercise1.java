/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graphicsexercise1;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author roanm
 */
public class GraphicsExercise1 extends JFrame {

    
    /**
     * Default constructor
     */
    public GraphicsExercise1() {
        //create the User interface
        initUI();
    }

    
    /**
     * Create the custom JFrame and set some options
     */
    private void initUI() {        
        //set title of the JFrame
        setTitle("Graphics Exercise 1");
        //add a custom JPanel to draw on
        add(new DrawingSurface());
        //set the size of the window
        setSize(300, 200);
        //tell the JFrame what to do when closed
        //this is important if our application has multiple windows
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        //make sure that all UI updates are concurrency safe (related to multi threading)
        //much more detailed http://www.javamex.com/tutorials/threads/invokelater.shtml
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                //instantiate the main window
                GraphicsExercise1 windowFrame = new GraphicsExercise1();
                //make sure it can be seen
                windowFrame.setVisible(true);
            }
        });
    }
    
}
