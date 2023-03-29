import java.awt.*;

public class Centipede {
    private int x;
    private int y;
    private int length;
    private Color col;

    public Centipede(int x, int y, int length, Color color) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.col = color;
    }

    public int getx(){
        return this.x;
    }
    public int gety(){
        return this.y;
    }
    public void draw(Graphics g) {
        for(int n =0;n<length;n++){
            g.drawOval(x+(n*10), y, 10, 10);
            g.fillOval(x+(n*10), y, 10, 10);
            g.setColor(col);
        }

    }

    public void move(int dx, int dy) {
        x = dx;
        y = dy;
    }
}
