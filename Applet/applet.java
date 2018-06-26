
package prctl22org;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.*;

public class applet extends Applet implements ActionListener  {

    Button sqr, sqrt;
    Label l;
    TextField t;
    Label ans;

    public void init() {
        setLayout(null);

        l = new Label("Enter no : ");
        l.setBounds(10, 50, 80, 20);

        t = new TextField();
        t.setBounds(110, 50, 80, 20);

        sqr = new Button("Sqr");
        sqr.setBounds(10, 90, 80, 20);

        sqr.addActionListener(this);

        sqrt = new Button("Sqrt");
        sqrt.setBounds(100, 90, 80, 20);

        sqrt.addActionListener(this);

        ans = new Label("");
        ans.setBounds(10, 150, 200, 20);

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