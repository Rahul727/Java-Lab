/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_MouseEvent_23;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Nikunj Gamit
 */
public class MyMouseListenerFrame extends Frame implements MouseListener {

    Button bt;

    public MyMouseListenerFrame() throws HeadlessException {

        setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));

        bt = new Button(" Button ");
        bt.addMouseListener(this);
        this.add(bt);
    }

    @Override
    public void mouseClicked(MouseEvent me) {

        this.setBackground(Color.yellow);
    }

    @Override
    public void mousePressed(MouseEvent me) {

        this.setBackground(Color.green);
    }

    @Override
    public void mouseReleased(MouseEvent me) {

        this.setBackground(Color.red);
    }

    @Override
    public void mouseEntered(MouseEvent me) {

        this.setBackground(Color.blue);
    }

    @Override
    public void mouseExited(MouseEvent me) {

        this.setBackground(Color.white);
    }
}
