import javax.swing.*;
import java.awt.*;

public class Main {
    public void run(){
        JFrame frame = new JFrame();
        BackgroundRunner panel = new BackgroundRunner();
        frame.add(panel);
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        Main g = new Main();
        g.run();
    }
}