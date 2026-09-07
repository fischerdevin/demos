//Creates the window, text fields, buttons, and layout
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GraphGUI {
    JFrame frame = new JFrame("Graphing GUI");
    JLabel label = new JLabel("enter equation: ");
    JPanel panel = new JPanel();
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    public GraphGUI() {
        int width = screenSize.width / 2;
        int height = screenSize.height / 2;
        panel.add(label);

        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
