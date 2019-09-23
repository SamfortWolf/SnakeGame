package task2312;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Layer extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(Room.game.getWidth() * 10, 0, 15, Room.game.getHeight() * 10 + 10);
        g.fillRect(0, Room.game.getHeight() * 10, Room.game.getWidth() * 10 + 10, 15);

        g.setColor(Color.blue);
        g.fillRect(Room.game.getMouse().getX() * 10, Room.game.getMouse().getY() * 10, 10, 10);


        ArrayList<SnakeSection> getsection = Room.game.getSnake().getSections();
        for (int i = 0; i < getsection.size(); i++) {
            if (i==0){g.setColor(Color.RED);}
            else {
                g.setColor(Color.GREEN);}
            g.fillRect(getsection.get(i).getX() * 10, getsection.get(i).getY() * 10, 10, 10);

        }
    }
}
