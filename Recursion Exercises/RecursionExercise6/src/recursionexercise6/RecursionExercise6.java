/*
Roan Mason
04/20/23

*/
package recursionexercise6;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author roanm
 */
public class RecursionExercise6 extends JFrame{  
    /**
     * Default constructor
     */
    public RecursionExercise6() {
        //create the User interface
        initUI();
    }

    
    /**
     * Create the custom JFrame and set some options
     */
    private void initUI() {        
        //set title of the JFrame
        setTitle("Square Recursive Thing");
        //add a custom JPanel to draw on
        add(new DrawingSurface());
        //set the size of the window
        setSize(500, 500);
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
                RecursionExercise6 windowFrame = new RecursionExercise6();
                //make sure it can be seen
                windowFrame.setVisible(true);
            }
        });
    }
    
}
