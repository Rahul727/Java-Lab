package Applet;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.*;

public class CalculatorApplet extends Applet implements ActionListener {

    Button sqr, sqrt;
    Label l;
    TextField t;
    Label ans;

    public void init() {
        setLayout(null);

     // create label to display enter no
        l = new Label("Enter no : ");
        l.setBounds(10, 50, 80, 20);

     // create textbox for entering number
        t = new TextField();
        t.setBounds(110, 50, 80, 20);

     // create button for finding sqr
        sqr = new Button("Sqr");
        sqr.setBounds(10, 90, 80, 20);

     // add the action listner on this button
        sqr.addActionListener(this);

     // create button for finding sqr root
        sqrt = new Button("Sqrt");
        sqrt.setBounds(100, 90, 80, 20);

     // add the action listener on this button
        sqrt.addActionListener(this);

     // create label for answer
        ans = new Label("");
        ans.setBounds(10, 150, 200, 20);

     // add all the components to the frame
        add(l);
        add(t);
        add(sqr);
        add(sqrt);
        add(ans);
    }

    public void actionPerformed(ActionEvent e) {

        String num = t.getText();

        double no = 0;

        if (e.getSource() == sqr) {
            try {
                no = Double.parseDouble(num);
                ans.setText("Sqr of " + num + " is  :" + 
                                String.valueOf(no * no));
            } catch (NumberFormatException n) {
                ans.setText("Enter number only");
            }

        } else if (e.getSource() == sqrt) {
            try {
                no = Integer.parseInt(num);
                no =  Math.sqrt(no);
                ans.setText("Sqr root of " + num + " is  :" + 
                                   String.valueOf(no));
            } catch (NumberFormatException n) {
                ans.setText("Enter number only");

            }
        }
    }
}

