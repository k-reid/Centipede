import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class BackgroundRunner extends JPanel {

    private BackgroundRunner panel;
    private Image backgroundImage;
    Shooter fir;
    public BackgroundRunner(){
        fir = new Shooter(Color.RED);
    }
    /@Override
    public void paintComponent(Graphics g) {
        //super.paintComponent(g);
        g.drawRect(0, 0, 600, 600);
        g.setColor(Color.BLACK);
        g.fillRect(0,0,600,600);

    }

    public static void main(String[] args) throws InterruptedException {

    }
    public void right(BackgroundRunner panel){
       panel.fir.setX(fir.getX()+10);
    }
    public void left(BackgroundRunner panel){
        panel.fir.setX(fir.getX()-10);
    }
    public void up(BackgroundRunner panel){
        panel.fir.setX(fir.getY()+10);
    }
    public void down(BackgroundRunner panel){
        panel.fir.setX(fir.getY()-10);
    }

    private void drawImage( Graphics window){
        Image img2 = Toolkit.getDefaultToolkit().getImage("Board Layout.jpg"); /*the image cannot be in the SRC folder*/
        window.drawImage(img2, 0, 0, 600, 600 , this);
    }



}

//			panel.drawImage(frame.getGraphics());




