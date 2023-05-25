import java.awt.*;
import java.awt.event.*;

public class MouseListener_Example extends WindowAdapter implements MouseListener {

    Frame f;
    Label l;

    MouseListener_Example() {
        f = new Frame();
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(300, 300);
        f.setTitle("Mouse_Listener");
        init();
        add_component();
    }

    public void init() {
        l = new Label();
        l.setFont(new Font("Courier", Font.BOLD, 20));
    }

    public void add_component() {
        l.setBounds(70, 140, 160, 30);
        l.setBackground(Color.white);
        f.add(l);
        f.addWindowListener(this);
        f.addMouseListener(this);
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
        f.setBackground(Color.red);
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
        f.setBackground(Color.orange);
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
        f.setBackground(Color.green);
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
        f.setBackground(Color.magenta);
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
        f.setBackground(Color.cyan);
    }

    public void windowClosing(WindowEvent e) {
        f.dispose();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new MouseListener_Example();
    }

}