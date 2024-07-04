package pg1;

import javax.swing.*;
import java.awt.*;

import static pg1.ImageLoader.*;

public class Draw<DerHandler> extends JLabel {
    private static long serialVersionUID = 1L;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        //Draw Image

        g.drawImage(img, 0, 0, 1400,1400, this); //Draw Backround
        g.drawImage(imgne, -25, 648, 450, 400, this); //Draw playerlayout
        g.drawImage(imgvs, -30, -40, 250, 250, this); //Draw VS
        g.drawImage(imgre, 500, 805, 400, 70, this); //Draw Reset
        g.drawImage(imgdr, 900, 130, 200, 660, this); //Draw Dragon
        g.drawImage(imgdr2, -25, 130, 220, 600, this); //Draw Dragon2


        //Draw in Window

        g.setColor(new Color(0,0,0,200));
        g.setFont(new Font("Nuance", Font.BOLD, 50));
        g.drawString("P1", 63, 798);

        g.setColor(new Color(0,0,0,200));
        g.setFont(new Font("Nuance", Font.BOLD, 50));
        g.drawString("P2", 63, 932);

        g.setColor(Color.BLUE);
        g.setFont(new Font("Nuance", Font.BOLD, 25));
        g.drawString("", 20, 40);

        g.setColor(new Color(200,1,1,200));
        g.setFont(new Font("Nuance", Font.BOLD, 25));
        g.drawString("", 20, 110);

        //vertikale

        g.setColor(new Color(250, 220, 0, 200));
        g.drawLine(200, 150, 200, 750);
        g.drawLine(300, 150, 300, 750);
        g.drawLine(400, 150, 400, 750);
        g.drawLine(500, 150, 500, 750);
        g.drawLine(600, 150, 600, 750);
        g.drawLine(700, 150, 700, 750);
        g.drawLine(800, 150, 800, 750);
        g.drawLine(900, 150, 900, 750);

        //horizontal

        g.drawLine(200, 150, 900, 150);
        g.drawLine(200, 250, 900, 250);
        g.drawLine(200, 350, 900, 350);
        g.drawLine(200, 450, 900, 450);
        g.drawLine(200, 550, 900, 550);
        g.drawLine(200, 650, 900, 650);
        g.drawLine(200, 750, 900, 750);

        // Draw Player

        g.setColor(Color.BLUE);
        if (pg1.Gui.player == 0) {
            g.setFont(new Font("Nuance", Font.BOLD, 80));
            g.drawString(Gui.Eingabe.getText() + " setze ein X!", 190,100 );
        } else if (pg1.Gui.player == 1) {
            g.setFont(new Font("Nuance", Font.BOLD, 80));
            g.setColor(new Color(200, 2, 2, 200));
            g.drawString(Gui.Eingabe2.getText() + " setze ein O!", 190,100 );
        }

        // Draw Gewinner

        if (pg1.Gui.Gewinner == 1) {
            g.setFont(new Font("Nuance", Font.BOLD, 180));
            g.setColor(Color.BLUE);
            g.drawString(Gui.Eingabe.getText() + ",", 300, 250);
            g.drawString("   YOU", 150, 450);
            g.drawString("     WIN", 25, 650);
        } else if (pg1.Gui.Gewinner == 2) {
            g.setFont(new Font("Nuance", Font.BOLD, 180));
            g.setColor(new Color(200, 2, 2, 200));
            g.drawString(Gui.Eingabe2.getText() + ",", 300, 250);
            g.drawString("   YOU", 150, 450);
            g.drawString("     WIN", 25, 650);
        }

        // Reihe 1

        if (pg1.Gui.state[0] == 1) {
            g.drawImage(ImageLoader.imgX, 225, 665, 50, 70, null);
        } else if (pg1.Gui.state[0] == 2) {
            g.drawImage(ImageLoader.imgO, 225, 665, 50, 70, null);
        }
        if (pg1.Gui.state[1] == 1) {
            g.drawImage(ImageLoader.imgX, 325, 665, 50, 70, null);
        } else if (pg1.Gui.state[1] == 2) {
            g.drawImage(ImageLoader.imgO, 325, 665, 50, 70, null);
        }
        if (pg1.Gui.state[2] == 1) {
            g.drawImage(ImageLoader.imgX, 425, 665, 50, 70, null);
        } else if (pg1.Gui.state[2] == 2) {
            g.drawImage(ImageLoader.imgO, 425, 665, 50, 70, null);
        }
        if (pg1.Gui.state[3] == 1) {
            g.drawImage(ImageLoader.imgX, 525, 665, 50, 70, null);
        } else if (pg1.Gui.state[3] == 2) {
            g.drawImage(ImageLoader.imgO, 525, 665, 50, 70, null);
        }
        if (pg1.Gui.state[4] == 1) {
            g.drawImage(ImageLoader.imgX, 625, 665, 50, 70, null);
        } else if (pg1.Gui.state[4] == 2) {
            g.drawImage(ImageLoader.imgO, 625, 665, 50, 70, null);
        }
        if (pg1.Gui.state[5] == 1) {
            g.drawImage(ImageLoader.imgX, 725, 665, 50, 70, null);
        } else if (pg1.Gui.state[5] == 2) {
            g.drawImage(ImageLoader.imgO, 725, 665, 50, 70, null);
        }
        if (pg1.Gui.state[6] == 1) {
            g.drawImage(ImageLoader.imgX, 825, 665, 50, 70, null);
        } else if (pg1.Gui.state[6] == 2) {
            g.drawImage(ImageLoader.imgO, 825, 665, 50, 70, null);
        }

        // Reihe 2

        if (pg1.Gui.state[7] == 1) {
            g.drawImage(ImageLoader.imgX, 225, 565, 50, 70, null);
        } else if (pg1.Gui.state[7] == 2) {
            g.drawImage(ImageLoader.imgO, 225, 565, 50, 70, null);
        }
        if (pg1.Gui.state[8] == 1) {
            g.drawImage(ImageLoader.imgX, 325, 565, 50, 70, null);
        } else if (pg1.Gui.state[8] == 2) {
            g.drawImage(ImageLoader.imgO, 325, 565, 50, 70, null);
        }
        if (pg1.Gui.state[9] == 1) {
            g.drawImage(ImageLoader.imgX, 425, 565, 50, 70, null);
        } else if (pg1.Gui.state[9] == 2) {
            g.drawImage(ImageLoader.imgO, 425, 565, 50, 70, null);
        }
        if (pg1.Gui.state[10] == 1) {
            g.drawImage(ImageLoader.imgX, 525, 565, 50, 70, null);
        } else if (pg1.Gui.state[10] == 2) {
            g.drawImage(ImageLoader.imgO, 525, 565, 50, 70, null);
        }
        if (pg1.Gui.state[11] == 1) {
            g.drawImage(ImageLoader.imgX, 625, 565, 50, 70, null);
        } else if (pg1.Gui.state[11] == 2) {
            g.drawImage(ImageLoader.imgO, 625, 565, 50, 70, null);
        }
        if (pg1.Gui.state[12] == 1) {
            g.drawImage(ImageLoader.imgX, 725, 565, 50, 70, null);
        } else if (pg1.Gui.state[12] == 2) {
            g.drawImage(ImageLoader.imgO, 725, 565, 50, 70, null);
        }
        if (pg1.Gui.state[13] == 1) {
            g.drawImage(ImageLoader.imgX, 825, 565, 50, 70, null);
        } else if (pg1.Gui.state[13] == 2) {
            g.drawImage(ImageLoader.imgO, 825, 565, 50, 70, null);
        }

        // Reihe 3

        if (pg1.Gui.state[14] == 1) {
            g.drawImage(ImageLoader.imgX, 225, 465, 50, 70, null);
        } else if (pg1.Gui.state[14] == 2) {
            g.drawImage(ImageLoader.imgO, 225, 465, 50, 70, null);
        }
        if (pg1.Gui.state[15] == 1) {
            g.drawImage(ImageLoader.imgX, 325, 465, 50, 70, null);
        } else if (pg1.Gui.state[15] == 2) {
            g.drawImage(ImageLoader.imgO, 325, 465, 50, 70, null);
        }
        if (pg1.Gui.state[16] == 1) {
            g.drawImage(ImageLoader.imgX, 425, 465, 50, 70, null);
        } else if (pg1.Gui.state[16] == 2) {
            g.drawImage(ImageLoader.imgO, 425, 465, 50, 70, null);
        }
        if (pg1.Gui.state[17] == 1) {
            g.drawImage(ImageLoader.imgX, 525, 465, 50, 70, null);
        } else if (pg1.Gui.state[17] == 2) {
            g.drawImage(ImageLoader.imgO, 525, 465, 50, 70, null);
        }
        if (pg1.Gui.state[18] == 1) {
            g.drawImage(ImageLoader.imgX, 625, 465, 50, 70, null);
        } else if (pg1.Gui.state[18] == 2) {
            g.drawImage(ImageLoader.imgO, 625, 465, 50, 70, null);
        }
        if (pg1.Gui.state[19] == 1) {
            g.drawImage(ImageLoader.imgX, 725, 465, 50, 70, null);
        } else if (pg1.Gui.state[19] == 2) {
            g.drawImage(ImageLoader.imgO, 725, 465, 50, 70, null);
        }
        if (pg1.Gui.state[20] == 1) {
            g.drawImage(ImageLoader.imgX, 825, 465, 50, 70, null);
        } else if (pg1.Gui.state[20] == 2) {
            g.drawImage(ImageLoader.imgO, 825, 465, 50, 70, null);
        }

        // Reihe 4

        if (pg1.Gui.state[21] == 1) {
            g.drawImage(ImageLoader.imgX, 225, 365, 50, 70, null);
        } else if (pg1.Gui.state[21] == 2) {
            g.drawImage(ImageLoader.imgO, 225, 365, 50, 70, null);
        }
        if (pg1.Gui.state[22] == 1) {
            g.drawImage(ImageLoader.imgX, 325, 365, 50, 70, null);
        } else if (pg1.Gui.state[22] == 2) {
            g.drawImage(ImageLoader.imgO, 325, 365, 50, 70, null);
        }
        if (pg1.Gui.state[23] == 1) {
            g.drawImage(ImageLoader.imgX, 425, 365, 50, 70, null);
        } else if (pg1.Gui.state[23] == 2) {
            g.drawImage(ImageLoader.imgO, 425, 365, 50, 70, null);
        }
        if (pg1.Gui.state[24] == 1) {
            g.drawImage(ImageLoader.imgX, 525, 365, 50, 70, null);
        } else if (pg1.Gui.state[24] == 2) {
            g.drawImage(ImageLoader.imgO, 525, 365, 50, 70, null);
        }
        if (pg1.Gui.state[25] == 1) {
            g.drawImage(ImageLoader.imgX, 625, 365, 50, 70, null);
        } else if (pg1.Gui.state[25] == 2) {
            g.drawImage(ImageLoader.imgO, 625, 365, 50, 70, null);
        }
        if (pg1.Gui.state[26] == 1) {
            g.drawImage(ImageLoader.imgX, 725, 365, 50, 70, null);
        } else if (pg1.Gui.state[26] == 2) {
            g.drawImage(ImageLoader.imgO, 725, 365, 50, 70, null);
        }
        if (pg1.Gui.state[27] == 1) {
            g.drawImage(ImageLoader.imgX, 825, 365, 50, 70, null);
        } else if (pg1.Gui.state[27] == 2) {
            g.drawImage(ImageLoader.imgO, 825, 365, 50, 70, null);
        }

        // Reihe 5

        if (pg1.Gui.state[28] == 1) {
            g.drawImage(ImageLoader.imgX, 225, 265, 50, 70, null);
        } else if (pg1.Gui.state[28] == 2) {
            g.drawImage(ImageLoader.imgO, 225, 265, 50, 70, null);
        }
        if (pg1.Gui.state[29] == 1) {
            g.drawImage(ImageLoader.imgX, 325, 265, 50, 70, null);
        } else if (pg1.Gui.state[29] == 2) {
            g.drawImage(ImageLoader.imgO, 325, 265, 50, 70, null);
        }
        if (pg1.Gui.state[30] == 1) {
            g.drawImage(ImageLoader.imgX, 425, 265, 50, 70, null);
        } else if (pg1.Gui.state[30] == 2) {
            g.drawImage(ImageLoader.imgO, 425, 265, 50, 70, null);
        }
        if (pg1.Gui.state[31] == 1) {
            g.drawImage(ImageLoader.imgX, 525, 265, 50, 70, null);
        } else if (pg1.Gui.state[31] == 2) {
            g.drawImage(ImageLoader.imgO, 525, 265, 50, 70, null);
        }
        if (pg1.Gui.state[32] == 1) {
            g.drawImage(ImageLoader.imgX, 625, 265, 50, 70, null);
        } else if (pg1.Gui.state[32] == 2) {
            g.drawImage(ImageLoader.imgO, 625, 265, 50, 70, null);
        }
        if (pg1.Gui.state[33] == 1) {
            g.drawImage(ImageLoader.imgX, 725, 265, 50, 70, null);
        } else if (pg1.Gui.state[33] == 2) {
            g.drawImage(ImageLoader.imgO, 725, 265, 50, 70, null);
        }
        if (pg1.Gui.state[34] == 1) {
            g.drawImage(ImageLoader.imgX, 825, 265, 50, 70, null);
        } else if (pg1.Gui.state[34] == 2) {
            g.drawImage(ImageLoader.imgO, 825, 265, 50, 70, null);
        }

        // Reihe 6

        if (pg1.Gui.state[35] == 1) {
            g.drawImage(ImageLoader.imgX, 225, 165, 50, 70, null);
        } else if (pg1.Gui.state[35] == 2) {
            g.drawImage(ImageLoader.imgO, 225, 165, 50, 70, null);
        }
        if (pg1.Gui.state[36] == 1) {
            g.drawImage(ImageLoader.imgX, 325, 165, 50, 70, null);
        } else if (pg1.Gui.state[36] == 2) {
            g.drawImage(ImageLoader.imgO, 325, 165, 50, 70, null);
        }
        if (pg1.Gui.state[37] == 1) {
            g.drawImage(ImageLoader.imgX, 425, 165, 50, 70, null);
        } else if (pg1.Gui.state[37] == 2) {
            g.drawImage(ImageLoader.imgO, 425, 165, 50, 70, null);
        }
        if (pg1.Gui.state[38] == 1) {
            g.drawImage(ImageLoader.imgX, 525, 165, 50, 70, null);
        } else if (pg1.Gui.state[38] == 2) {
            g.drawImage(ImageLoader.imgO, 525, 165, 50, 70, null);
        }
        if (pg1.Gui.state[39] == 1) {
            g.drawImage(ImageLoader.imgX, 625, 165, 50, 70, null);
        } else if (pg1.Gui.state[39] == 2) {
            g.drawImage(ImageLoader.imgO, 625, 165, 50, 70, null);
        }
        if (pg1.Gui.state[40] == 1) {
            g.drawImage(ImageLoader.imgX, 725, 165, 50, 70, null);
        } else if (pg1.Gui.state[40] == 2) {
            g.drawImage(ImageLoader.imgO, 725, 165, 50, 70, null);
        }
        if (pg1.Gui.state[41] == 1) {
            g.drawImage(ImageLoader.imgX, 825, 165, 50, 70, null);
        } else if (pg1.Gui.state[41] == 2) {
            g.drawImage(ImageLoader.imgO, 825, 165, 50, 70, null);
        }
        repaint();

    }
}
