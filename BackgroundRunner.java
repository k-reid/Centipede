import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class BackgroundRunner extends JPanel {

    private BackgroundRunner panel;
    private Image backgroundImage;
    private Map<Centipede, ArrayList<Integer>> m;

    Shooter fir;
    public BackgroundRunner(){
        fir = new Shooter(Color.RED);
        m = new HashMap<Centipede,ArrayList<Integer>>();
    }
    //@Override
    public void paintComponent(Graphics g) {

        //super.paintComponent(g);


        g.setColor(Color.BLACK);
        g.fillRect(0,0,600,600);
        g.fillRect(0,0,2000,2000);
        g.setColor(new Color(108, 236, 0, 179));
        Font title = new Font("Century", Font.BOLD,50);
        g.setFont(title);
        g.drawString("CENTIPEDE", 825,70);
        g.setColor(Color.WHITE);
        g.drawRect(500,100,1000,1000);

        ArrayList<Centipede> cs = new ArrayList<Centipede>();
        Centipede c1 = new Centipede(Color.WHITE,0);
        cs.add(c1);
        Centipede c2 = new Centipede(Color.WHITE,1);
        cs.add(c2);
        Centipede c3 = new Centipede(Color.WHITE,2);
        cs.add(c3);
        Centipede c4 = new Centipede(Color.WHITE,3);
        cs.add(c4);
        Centipede c5 = new Centipede(Color.WHITE,4);
        cs.add(c5);
        Centipede c6 = new Centipede(Color.WHITE,5);
        cs.add(c6);
        Centipede c7 = new Centipede(Color.WHITE,6);
        cs.add(c7);
        Centipede c8 = new Centipede(Color.WHITE,7);
        cs.add(c8);
        Centipede c9 = new Centipede(Color.WHITE,8);
        cs.add(c9);
        Centipede c0 = new Centipede(Color.WHITE,9);
        cs.add(c0);

        for(Centipede c : cs) {
            ArrayList<Integer> a = new ArrayList<Integer>();
            a.add(c.getX()); a.add(c.getY());
            m.put(c, a);
        }
        for(Centipede c : cs)
            c.draw(g);


        while(c1.getX() < 1500)
            for(Centipede c : cs) {
                c.move(c.getX() + 1, c.getY());
                repaint(g);
            }


    }

    public void repaint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0,0,1000,2000);
        g.fillRect(0,0,2000,2000);
        g.setColor(new Color(108, 236, 0, 179));
        Font title = new Font("Century", Font.BOLD,50);
        g.setFont(title);
        g.drawString("CENTIPEDE", 825,70);
        g.setColor(Color.WHITE);
        g.drawRect(500,100,1000,1000);
        for(Centipede c : m.keySet())
            c.draw(g,c.getX(),c.getY());
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



