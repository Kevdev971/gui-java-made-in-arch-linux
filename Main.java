import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setLayout(new FlowLayout());
        jframe.add(new JLabel("Hello World"));
        jframe.setResizable(false);
        jframe.setSize(500,400);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
