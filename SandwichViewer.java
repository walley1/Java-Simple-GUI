import javax.swing.*;
public class SandwichViewer {
    public static void main (String[] args)
    {
        JFrame frame = new SandwichOrderFrame();
        frame.setTitle("Eddy's Sandwich Shop");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}