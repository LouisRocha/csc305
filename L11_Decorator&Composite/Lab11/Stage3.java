package Lab11;

import java.awt.*;
import java.util.LinkedList;

public class Stage3 extends Stage2{
    public void draw(Graphics g, int value){
        super.draw(g, value);
        g.setColor(Color.gray);
        LinkedList<Point> values = Board.getInstance().getValues();
        for (int i = 0; i<values.size() - 1; i++){

        }
    }
}
