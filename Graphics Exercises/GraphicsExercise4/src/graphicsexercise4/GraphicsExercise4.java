/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graphicsexercise4;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author roanm
 */
public class GraphicsExercise4 extends JFrame {
    
    public static int SCREEN_WIDTH = 300;
    public static int SCREEN_HEIGHT = 200;
    
    /**
     * Default constructor
     */
    public GraphicsExercise4() {
        //create the User interface
        initUI();
    }
    
    public static int getScreenWidth() {
        return SCREEN_WIDTH;
    }
    
    public static int getScreenHeight() {
        return SCREEN_HEIGHT;
    }
    
    /**
     * Create the custom JFrame and set some options
     */
    private void initUI() {        
        //set title of the JFrame
        setTitle("Simple Java 2D example");
        //add a custom JPanel to draw on
        add(new DrawingSurface());
        //set the size of the window
        setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        //tell the JFrame what to do when closed
        //this is important if our application has multiple windows
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        //makes sure that GUI updates nicely with the rest of the OS
        EventQueue.invokeLater(() -> {
            JFrame ex = new GraphicsExercise4();
            ex.setVisible(true);
        });
    }
    
}
