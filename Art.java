import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.util.*;
import java.io.* ;
import java.net.* ;

//THIS IS A PLACEHOLDER FOR ARTWORKS. Real Art comes here later
/*
Source: https://stackoverflow.com/questions/21121859/how-to-paint-on-a-jpanel
*/
public class Art extends JPanel {

    private static final int DIM_WIDTH = 250;
    private static final int DIM_HEIGHT = 250;
    private static final int SQ_SIZE = 50;

    boolean black = true;
    /*
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for (int i = 0; i < DIM_HEIGHT; i += SQ_SIZE) {
            if (black) {
                black = false;
            } else {
                black = true;
            }
            for (int j = 0; j < DIM_WIDTH; j += SQ_SIZE) {
                if (black) {
                    g.setColor(Color.WHITE);
                    g.fillRect(j, i, SQ_SIZE, SQ_SIZE);
                    black = false;
                } else {
                    g.setColor(Color.BLACK);
                    g.fillRect(j, i, SQ_SIZE, SQ_SIZE);
                    black = true;
                }
            }
        }
    }
    */

    //put the monalisa picture
    
  }
