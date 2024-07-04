package pg1;

import javax.sound.sampled.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        new Gui();
        new ImageLoader();
        new ImageIcon();
        new Logik();
        new JFrame();
        new JTextField();
        new JLabel();
        new JPanel();

        // Play Audio

        File file = new File("src/pg1/SF.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }
}
