/*
Roan Mason
04/12/23
Graphics class exercises. Image on JFrame
 */
package graphicsexercise3;

import javax.swing.*;

/**
 *
 * @author roanm
 */
public class GraphicsExercise3 extends JFrame {

    /**
     * Default constructor
     */
    public GraphicsExercise3() {
        //create the User interface
        initUI();
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
        setSize(640, 640);
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
                GraphicsExercise3 windowFrame = new GraphicsExercise3();
                //make sure it can be seen
                windowFrame.setVisible(true);
            }
        });
    }
    
}
