import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Student implements ActionListener {
    JLabel l, l1, l2, l3, l4, l5, l6;
    JTextField t1, t2, t3, t4, t5, t6;
    JFrame f;
    JButton b1;
    JButton b2, b3, b4;
    JOptionPane o;
    String branches[] = { "EnTC", "CS", "IT" };
    final JComboBox c, c1, c2, c3;
    String div1[] = { "Div 1", "Div 2", "Div 3", "Div 4" };
    String div2[] = { "Div 5", "Div 6", "Div 7", "Div 8" };
    String div3[] = { "Div 9", "Div 10", "Div 11"
    };
    String dept = "";
    String division = "";

    public void actionPerformed(ActionEvent e) {
        String s1, s2, s3, s4;
        if (e.getSource() == b3) {
            dept = (String) c.getItemAt(c.getSelectedIndex());
            if (dept == "EnTC") {
                c2.setVisible(true);
                l1.setText("AJP");
                l2.setText("PDC");
                l3.setText("CN");
                l4.setText("PM");
            }
            if (dept == "CS") {
                c1.setVisible(true);
                l1.setText("AI");
                l2.setText("CN");
                l3.setText("OS");
                l4.setText("SE");
            }
            if (dept == "IT") {
                c3.setVisible(true);
                l1.setText("DSA");
                l2.setText("OOP");
                l3.setText("DM");
                l4.setText("DBM");
            }
        }
        if (e.getSource() == b4) {
            if (dept == "EnTC") {
                division = (String) c2.getItemAt(c2.getSelectedIndex());
            }

            if (dept == "CS") {
                division = (String) c1.getItemAt(c1.getSelectedIndex());
            }
            if (dept == "IT") {
                division = (String) c3.getItemAt(c3.getSelectedIndex());
            }
        }
        if (e.getSource() == b1) {
            s1 = t1.getText();
            s2 = t2.getText();
            s3 = t3.getText();
            s4 = t4.getText();
            float ans = Integer.parseInt(s1) + Integer.parseInt(s2) + Integer.parseInt(s3) +

                    Integer.parseInt(s4);

            ans = (ans / 400) * 100;
            JOptionPane.showMessageDialog(f, "Name : " + t5.getText() + "\nRoll No: " +

                    t6.getText() + "\nBranch : " + dept + "\nClass : " + division + "\nPercentage " + ans + "%");

        }
    }

    public void add_comp() {
        l1.setBounds(10, 60, 50, 50);
        f.add(l1);
        l5.setBounds(190, 60, 70, 50);
        f.add(l5);
        l6.setBounds(190, 110, 60, 50);
        f.add(l6);
        t5.setBounds(250, 60, 100, 50);
        f.add(t5);
        t6.setBounds(250, 110, 100, 50);
        f.add(t6);
        l2.setBounds(10, 110, 50, 50);
        f.add(l2);
        l3.setBounds(10, 160, 50, 50);
        f.add(l3);
        l4.setBounds(10, 220, 50, 50);
        f.add(l4);
        t1.setBounds(60, 60, 100, 50);
        f.add(t1);
        t2.setBounds(60, 110, 100, 50);
        f.add(t2);
        t3.setBounds(60, 160, 100, 50);
        f.add(t3);
        t4.setBounds(60, 220, 100, 50);
        f.add(t4);
        b1.setBounds(30, 280, 200, 30);
        f.add(b1);
        b2.setBounds(30, 330, 200, 30);
        f.add(b2);
        b3.setBounds(180, 10, 100, 30);
        f.add(b3);
        c1.setBounds(290, 10, 100, 30);

        c2.setBounds(290, 10, 100, 30);
        c3.setBounds(290, 10, 100, 30);
        b4.setBounds(400, 10, 100, 30);
        f.add(b4);
        c.setBounds(30, 10, 130, 30);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

    }

    Student() {
        l = new JLabel("Student marks");
        l1 = new JLabel("AJP");
        l2 = new JLabel("PDC");
        l3 = new JLabel("CN");
        l4 = new JLabel("PM");
        l5 = new JLabel("Name : ");
        l6 = new JLabel("RollNo : ");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t6 = new JTextField();
        f = new JFrame();
        f.setSize(600, 600);
        f.setVisible(true);
        f.setLayout(null);
        f.setTitle("32122_Kaushal");
        b1 = new JButton("Submit");
        b2 = new JButton("Percentage");
        b3 = new JButton("Select");
        b4 = new JButton("Select");
        b2.setVisible(false);
        c = new JComboBox(branches);
        c1 = new JComboBox(div1);
        c2 = new JComboBox(div2);
        c3 = new JComboBox(div3);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        c1.setVisible(false);
        c2.setVisible(false);
        c3.setVisible(false);
        f.add(c);
        add_comp();
    }

    public static void main(String[] args) {
        new Student();
    }

}