package pg1;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class ImageLoader {
    static Image imgX, imgO, img, imgne, imgvs, imgre, imgdr, imgdr2;
    static ImageIcon icon;
    public ImageLoader() {
        try {
            imgX = ImageIO.read(this.getClass().getClassLoader().getResourceAsStream("res/X.png"));
            imgO = ImageIO.read(this.getClass().getClassLoader().getResourceAsStream("res/O.png"));
            img = ImageIO.read(this.getClass().getClassLoader().getResourceAsStream("res/src/bg.jpg"));
            imgne = ImageIO.read(this.getClass().getClassLoader().getResourceAsStream("res/src/ne.png"));
            imgvs = ImageIO.read(this.getClass().getClassLoader().getResourceAsStream("res/src/vs.png"));
            imgre = ImageIO.read(this.getClass().getClassLoader().getResourceAsStream("res/src/re.jpg"));
            imgdr = ImageIO.read(this.getClass().getClassLoader().getResourceAsStream("res/src/dr.png"));
            imgdr2 = ImageIO.read(this.getClass().getClassLoader().getResourceAsStream("res/src/dr2.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
