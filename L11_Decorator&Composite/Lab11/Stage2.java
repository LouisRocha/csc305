package Lab11;

import java.awt.*;

public class Stage2 extends Stage1{
    protected Stage1 stage1;
    public void add(Stage1 d){
        stage1 = d;
    }
    @Override
    public void draw(Graphics g, int value){
        if (stage1 != null){
            stage1.draw(g, value);
        }
    }
}
