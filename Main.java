import javax.swing.*;

public class Main {
    public static void main(String args[]) {
        JFrame jframe = new JFrame();
        jframe.add(new JLabel("Hello World"));
        jframe.add(new JButton("click"));
        jframe.setResizable(false);
        jframe.setSize(500,400);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
