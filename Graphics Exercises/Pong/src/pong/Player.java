/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pong;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

/**
 *
 * @author roanm
 */
public class Player{
    
    private int xPos, yPos, width, height;
    private boolean upPressed, downPressed;
    private boolean isPlayer1;
    
    public Player(boolean isPlayer1) {
        this.isPlayer1 = isPlayer1;
        width = 5;
        height = 50;
        yPos = Pong.getScreenHeight()/2 - 50;
        if (!isPlayer1) {
            xPos = Pong.getScreenWidth()-5;
        } else {
            xPos = 0;
        }
    }
    
    public Player(boolean isPlayer1, int xPos, int yPos) {
        this(isPlayer1);
        this.xPos = xPos;
        this.yPos = yPos;
        this.isPlayer1 = isPlayer1;
    }
    
    public void draw(Graphics2D g2d) {
        
        g2d.fillRect(xPos, yPos, width, height);
        
    }
    
    public void update() {
        if (upPressed) {
            yPos -= 5;
        }
        if (downPressed) {
            yPos += 5;
        }

    }
    
    // Getter for x
    public int getX() {
        return xPos;
    }

    // Setter for x
    public void setX(int x) {
        this.xPos = x;
    }

    // Getter for y
    public int getY() {
        return yPos;
    }

    // Setter for y
    public void setY(int y) {
        this.yPos = y;
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

    public void keyPressed(KeyEvent e) {
        if (isPlayer1) {
            if (e.getKeyCode() == KeyEvent.VK_W) {
                upPressed = true;
            }
            if (e.getKeyCode() == KeyEvent.VK_S) {
                downPressed = true;
            } 
        } else {
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                upPressed = true;
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                downPressed = true;
            }
        }
    }

    public void keyReleased(KeyEvent e) {
        if (isPlayer1) {
            if (e.getKeyCode() == KeyEvent.VK_W) {
                upPressed = false;
            }
            if (e.getKeyCode() == KeyEvent.VK_S) {
                downPressed = false;
            } 
        } else {
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                upPressed = false;
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                downPressed = false;
            }
        }
    }

    public void keyTyped(KeyEvent e) {
        // do nothing
    }
    
}
