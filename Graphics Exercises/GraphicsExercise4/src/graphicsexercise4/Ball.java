/*
Roan Mason
05/12/23
Ball class capable of moving around with listeners
 */
package graphicsexercise4;

import java.awt.Color;
import java.awt.Graphics2D;


/**
 *
 * @author roanm
 */
public class Ball {
    
    protected int x, y, width, height;
    
    
    public Ball() {
       x = 0;
       y = 0;
    }
    
    public Ball(int xPos, int yPos, int width, int height) {
        this();
        x = xPos;
        y = yPos;
        this.width = width;
        this.height = height;
    }
    
    // Getter for x
    public int getX() {
        return x;
    }

    // Setter for x
    public void setX(int x) {
        this.x = x;
    }

    // Getter for y
    public int getY() {
        return y;
    }

    // Setter for y
    public void setY(int y) {
        this.y = y;
    }
    
    // Getter for width
    public int getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(int width) {
        this.width = width;
    }

    // Getter for height
    public int getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(int height) {
        this.height = height;
    }
    
    public void draw(Graphics2D g) {
        g.setColor(Color.red);
        g.fillOval(x, y, width, height);
    }
    
    public void update(int deltaX, int deltaY) {
        x += deltaX;
        y += deltaY;
        
    }
    
}
