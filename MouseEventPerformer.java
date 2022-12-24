import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MouseEventPerformer extends JFrame implements MouseListener {
    JLabel l1;

    public MouseEventPerformer() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        l1 = new JLabel();
        Font f = new Font("Verdana", Font.BOLD, 20);
        l1.setFont(f);
        l1.setForeground(Color.BLUE);
        add(l1);
        addMouseListener(this);
        setVisible(true);
    }

    public void mouseExited(MouseEvent m) {
        l1.setText("Mouse Exited");
    }

    public void mouseEntered(MouseEvent m) {
        l1.setText("Mouse Entered");
    }

    public void mouseReleased(MouseEvent m) {
        l1.setText("Mouse Released");
    }

    public void mousePressed(MouseEvent m) {
        l1.setText("Mouse Pressed");
    }

    public void mouseClicked(MouseEvent m) {
        l1.setText("Mouse Clicked");
    }

    public static void main(String[] args) {
        MouseEventPerformer mep = new MouseEventPerformer();
    }
}