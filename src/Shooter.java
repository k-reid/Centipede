import java.awt.*;
public class Shooter {
    Color player;
    int x,y;
    public Shooter(Color choice){
        player = choice;
        x = 300;
        y = 550;
    }

    public void setX(int X){
        this.x = X;
    }
    public void setY(int Y){
        this.y = Y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void draw(Graphics g) {
        g.drawOval(x, y, 10, 10);
        g.fillOval(x, y, 10, 10);
        g.setColor(Color.RED);
    }




}
