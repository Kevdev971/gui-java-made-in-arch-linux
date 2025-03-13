import javax.swing.*;

class Main {
    public static void main(String[] a) {
        JFrame jframe = new JFrame();
        jframe.add(new JButton("click"));
        jframe.setResizable(false);
        jframe.setSize(500,400);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
