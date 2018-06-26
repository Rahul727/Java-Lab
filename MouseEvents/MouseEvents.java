
package Applet;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class MouseEvents extends Frame implements MouseListener{

    void createFrame()
    {
        setSize(300, 400);
        setLayout(null);
        setVisible(true);
        this.addMouseListener(this);
    }

    public static void main(String[] args) {
        MouseEvents m = new MouseEvents();
        m.createFrame();
    }

    public void mouseClicked(MouseEvent e) {
       
        this.setBackground(Color.pink);
    }

    public void mousePressed(MouseEvent e) {
        
          this.setBackground(Color.yellow);
    }

    public void mouseReleased(MouseEvent e) {
       
          this.setBackground(Color.green);
    }

    public void mouseEntered(MouseEvent e) {
       
          this.setBackground(Color.red);
    }

    public void mouseExited(MouseEvent e) {
       
          this.setBackground(Color.blue);
    }
}
