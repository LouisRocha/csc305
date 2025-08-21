package Lab11;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    int x1 = 0;
    int y1 = 0;
    int x2 = 100;
    int y2 = 100;
    int x3 = 50;
    int y3 = 70;
    public static void main(String[] args) {

        Main main = new Main();
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setSize(500, 500);
        main.setVisible(true);
    }
    public Main(){
        JPanel mainPanel = new JPanel();
        GridLayout gridLayout = new GridLayout(2, 2);
        mainPanel.setLayout(gridLayout);

//        Stage1 s1 = new Stage1(x1, y1);
//        Stage1 s2 = new Stage1(x1, y1);

        JPanel topLeft = new JPanel(new BorderLayout());
        topLeft.setBackground(Color.red);
//        topLeft.add(s1);

        JPanel topRight = new JPanel(new BorderLayout());
        topRight.setBackground(Color.BLUE);
//        topRight.add(s2);

        JPanel bottomLeft = new JPanel(new BorderLayout());
        bottomLeft.setBackground(Color.PINK);

        JPanel bottomRight = new JPanel(new BorderLayout());
        bottomRight.setBackground(Color.YELLOW);

        mainPanel.add(topLeft);
        mainPanel.add(topRight);
        mainPanel.add(bottomLeft);
        mainPanel.add(bottomRight);



        setContentPane(mainPanel);
    }
}
