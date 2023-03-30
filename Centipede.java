import java.awt.*;

public class Centipede {


    private Color col;
    private int x;
    private int y;
    private int n;
    public Centipede(Color color,int n) {
        this.x = 500;
        this.y = 100;
        this.n = n;

        this.col = color;
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void draw(Graphics g) {

            g.drawOval(500+(n*50), 100, 50, 50);
            g.fillOval(500+(n*50), 100, 50, 50);
            g.setColor(col);


    }
    public void draw(Graphics g, int x, int y) {
        g.drawOval(x,y,50,50);
        g.fillOval(x,y,50,50);
        g.setColor(col);
    }

    public void move(int dx, int dy) {
        x = dx;
        y = dy;
    }
}
