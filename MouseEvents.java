import java.awt.*;
import java.awt.event.*;
class MouseEvents extends Frame
{
        TextField statusBar;
        public static void main(String []args)
        {
                new MouseEvents();
        }
        MouseEvents()
        {
                addMouseListener(new MouseAdapter()
                {
                        public void mouseClicked(MouseEvent e)
                        {
                                statusBar.setText("Clicked at (" + e.getX() + "," + e.getY() + ")");
                                repaint();
                        }
                public void mouseEntered(MouseEvent e)
                        {
                                statusBar.setText("Entered at (" + e.getX() + "," + e.getY() + ")");
                                repaint();
                        }
               }
);
                addWindowListener(new WindowAdapter()
                {
                        public void windowClosing(WindowEvent e)
                        {
                                System.exit(0);
                        }
                });
                setLayout(new FlowLayout());
                setSize(275,300);
                setTitle("Mouse Click Position");
                statusBar = new TextField(20);
                add(statusBar);
                setVisible(true);
        } 
}
