package Lab11;

import java.awt.*;
import java.beans.PropertyChangeSupport;
import java.util.LinkedList;

public class Board extends PropertyChangeSupport {
    private LinkedList<Point> values;
    private static Board instance = null;
    private Board(){
        super(new Object());
        values = new LinkedList<>();
    }
    public static Board getInstance(){
        if (instance == null){
            instance = new Board();
        }
        return instance;
    }
    public LinkedList<Point> getValues(){
        return values;
    }
    public void addValue(Point p ){
        values.add(p);
        if (values.size() > 4){
            values.removeFirst();
            firePropertyChange("values", null, values.getLast());
        }
    }
}
