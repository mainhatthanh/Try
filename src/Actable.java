import java.awt.*;

public interface Actable {
    public void moveTo(Graphics g, int x1, int y1);
    public void draw(Graphics g);
    public void erase(Graphics g);
}
