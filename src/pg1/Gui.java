package pg1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class Gui {
    static JTextField Eingabe;
    static JTextField Eingabe2;
    JFrame jf;
    Draw draw;
    JButton btnReset;
    JButton btnRefresh;
    static JButton btn[] = new JButton[42];
    static int  state[] = new int[42];
    static int player = 0;
    static int Gewinner = 0;

    public Gui() {

        //Spielfenster

        jf = new JFrame();
        jf.setSize(1100, 1000);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);
        jf.setTitle("Willkommen zu 4 Gewinnt");

        //Namens Eingabe

        Eingabe = new JTextField("", 15);
        Eingabe.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                Funktion.setText(Eingabe.getText());
            }
        });
        Eingabe.setFont(new Font("Nuance", Font.BOLD, 25));
        Eingabe.setSize(170, 35);
        Eingabe.setLocation(180, 764);
        Eingabe.setBackground(Color.WHITE);
        Eingabe.setForeground(Color.BLUE);
        Eingabe.setVisible(true);
        jf.add(Eingabe);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Eingabe2 = new JTextField("",15);
        Eingabe2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                Funktion.setText(Eingabe2.getText());
            }
        });
        Eingabe2.setFont(new Font("Nuance", Font.BOLD, 25));
        Eingabe2.setSize(170, 35);
        Eingabe2.setLocation(180, 897);
        Eingabe2.setBackground(Color.WHITE);
        Eingabe2.setForeground(new Color(200, 2, 2, 200));
        Eingabe2.setVisible(true);
        jf.add(Eingabe2);

        //Button Refresh

        btnRefresh = new JButton("Refresh");
        btnRefresh.setFont(new Font("Nuance", Font.BOLD, 20));
        btnRefresh.setBounds(200, 825, 150, 35);
        btnRefresh.setVisible(true);
        btnRefresh.setBackground(new Color(0, 0, 0));
        btnRefresh.setForeground(Color.YELLOW);
        btnRefresh.setFocusPainted(false);
        btnRefresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Eingabe.setText("");
                Eingabe2.setText("");
            }
        });
        jf.add(btnRefresh);

        //Button Reset

        for (int i = 0; i < btn.length; i++) {
            btn[i] = new JButton();
            btn[i].setVisible(true);
            btn[i].addActionListener(new ActionHandler());
            btn[i].setFocusPainted(false);
            btn[i].setContentAreaFilled(false);
            btn[i].setBorder(null);
            jf.add(btn[i]);
        }
        Button.place();

        btnReset = new JButton("Reset");
        btnReset.setFont(new Font("Nuance", Font.BOLD, 20));
        btnReset.setBounds(625, 823, 150, 35);
        btnReset.setVisible(true);
        btnReset.setBackground(new Color(0, 0, 0));
        btnReset.setForeground(Color.RED);
        btnReset.setFocusPainted(false);
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Funktion.reset();
            }
        });
        jf.add(btnReset);

        draw = new Draw();
        draw.setBounds(0, 0, 800, 600);
        draw.setVisible(true);
        jf.add(draw);
        jf.setVisible(true);

    }
}
