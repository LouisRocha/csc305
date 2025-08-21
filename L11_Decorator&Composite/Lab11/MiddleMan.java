package Lab11;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class MiddleMan extends JPanel implements PropertyChangeListener {
    Stage1 stage1;
    public MiddleMan(Stage1 stage1){
        this.stage1 = stage1;
    }
    public void paintComponent(Graphics g){
        if (stage1 != null){
            for(int i = 0;i<Board.getInstance().getValues().size(); i++){
                stage1.draw(g, i);
            }
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt){
        repaint();
    }
}
