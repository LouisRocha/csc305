package Lab11;

import java.awt.*;

public class Genius implements Runnable{
    @Override
    public void run() {
        while (true){
            Board.getInstance().addValue(new Point((int) ((Math.random() * 180) + 10), (int) ((Math.random() * 180) + 10)));
            try{
                Thread.sleep(500);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
