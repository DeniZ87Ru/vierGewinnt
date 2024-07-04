package pg1;

import java.util.Timer;
import java.util.TimerTask;

public class Logik {
    Timer time;
    public Logik() {
        time = new Timer();
        time.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                if (pg1.Gui.Gewinner == 0) {

                    //Reihe 1 für Spieler: X, Horizontal

                    if (pg1.Gui.state[0] == 1 && pg1.Gui.state[1] == 1 && pg1.Gui.state[2] == 1 && pg1.Gui.state[3] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[6] == 1 && pg1.Gui.state[5] == 1 && pg1.Gui.state[4] == 1 && pg1.Gui.state[3] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[2] == 1 && pg1.Gui.state[3] == 1 && pg1.Gui.state[4] == 1 && pg1.Gui.state[5] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[3] == 1 && pg1.Gui.state[4] == 1 && pg1.Gui.state[5] == 1 && pg1.Gui.state[6] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }

                    // Reihe 2 für Spieler: X, Horizontal

                    else if (pg1.Gui.state[7] == 1 && pg1.Gui.state[8] == 1 && pg1.Gui.state[9] == 1 && pg1.Gui.state[10] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[13] == 1 && pg1.Gui.state[12] == 1 && pg1.Gui.state[11] == 1 && pg1.Gui.state[10] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[8] == 1 && pg1.Gui.state[9] == 1 && pg1.Gui.state[10] == 1 && pg1.Gui.state[11] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[9] == 1 && pg1.Gui.state[10] == 1 && pg1.Gui.state[11] == 1 && pg1.Gui.state[12] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[10] == 1 && pg1.Gui.state[11] == 1 && pg1.Gui.state[12] == 1 && pg1.Gui.state[13] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }

                    // Reihe 3 für Spieler: X, Horizontal

                    else if (pg1.Gui.state[14] == 1 && pg1.Gui.state[15] == 1 && pg1.Gui.state[16] == 1 && pg1.Gui.state[17] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[20] == 1 && pg1.Gui.state[19] == 1 && pg1.Gui.state[18] == 1 && pg1.Gui.state[17] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[15] == 1 && pg1.Gui.state[16] == 1 && pg1.Gui.state[17] == 1 && pg1.Gui.state[18] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[16] == 1 && pg1.Gui.state[17] == 1 && pg1.Gui.state[18] == 1 && pg1.Gui.state[19] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }

                    // Reihe 4 für Spieler: X, Horizontal

                    else if (pg1.Gui.state[21] == 1 && pg1.Gui.state[22] == 1 && pg1.Gui.state[23] == 1 && pg1.Gui.state[24] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[27] == 1 && pg1.Gui.state[26] == 1 && pg1.Gui.state[25] == 1 && pg1.Gui.state[24] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[22] == 1 && pg1.Gui.state[23] == 1 && pg1.Gui.state[24] == 1 && pg1.Gui.state[25] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[23] == 1 && pg1.Gui.state[24] == 1 && pg1.Gui.state[25] == 1 && pg1.Gui.state[26] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }

                    // Reihe 5 für Spieler: X, Horizontal

                    else if (pg1.Gui.state[28] == 1 && pg1.Gui.state[29] == 1 && pg1.Gui.state[30] == 1 && pg1.Gui.state[31] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[34] == 1 && pg1.Gui.state[33] == 1 && pg1.Gui.state[32] == 1 && pg1.Gui.state[31] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[29] == 1 && pg1.Gui.state[30] == 1 && pg1.Gui.state[31] == 1 && pg1.Gui.state[32] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[30] == 1 && pg1.Gui.state[31] == 1 && pg1.Gui.state[32] == 1 && pg1.Gui.state[33] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }

                    // Reihe 6 für Spieler: X, Horizontal

                    else if (pg1.Gui.state[35] == 1 && pg1.Gui.state[36] == 1 && pg1.Gui.state[37] == 1 && pg1.Gui.state[38] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[41] == 1 && pg1.Gui.state[40] == 1 && pg1.Gui.state[39] == 1 && pg1.Gui.state[38] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[36] == 1 && pg1.Gui.state[37] == 1 && pg1.Gui.state[38] == 1 && pg1.Gui.state[39] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[37] == 1 && pg1.Gui.state[38] == 1 && pg1.Gui.state[39] == 1 && pg1.Gui.state[40] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }

                    // Reihe 1 für Spieler: X, Vertikal

                    else if (pg1.Gui.state[0] == 1 && pg1.Gui.state[7] == 1 && pg1.Gui.state[14] == 1 && pg1.Gui.state[21] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[35] == 1 && pg1.Gui.state[28] == 1 && pg1.Gui.state[21] == 1 && pg1.Gui.state[14] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[7] == 1 && pg1.Gui.state[14] == 1 && pg1.Gui.state[21] == 1 && pg1.Gui.state[28] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }

                    // Reihe 2 für Spieler: X, Vertikal

                    else if (pg1.Gui.state[1] == 1 && pg1.Gui.state[8] == 1 && pg1.Gui.state[15] == 1 && pg1.Gui.state[22] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[36] == 1 && pg1.Gui.state[29] == 1 && pg1.Gui.state[22] == 1 && pg1.Gui.state[15] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[8] == 1 && pg1.Gui.state[15] == 1 && pg1.Gui.state[22] == 1 && pg1.Gui.state[29] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }

                    // Reihe 3 für Spieler: X, Vertikal

                    else if (pg1.Gui.state[2] == 1 && pg1.Gui.state[9] == 1 && pg1.Gui.state[16] == 1 && pg1.Gui.state[23] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[37] == 1 && pg1.Gui.state[30] == 1 && pg1.Gui.state[23] == 1 && pg1.Gui.state[16] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[9] == 1 && pg1.Gui.state[16] == 1 && pg1.Gui.state[23] == 1 && pg1.Gui.state[30] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }

                    // Reihe 4 für Spieler: X, Vertikal

                    else if (pg1.Gui.state[3] == 1 && pg1.Gui.state[10] == 1 && pg1.Gui.state[17] == 1 && pg1.Gui.state[24] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[38] == 1 && pg1.Gui.state[31] == 1 && pg1.Gui.state[24] == 1 && pg1.Gui.state[17] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[10] == 1 && pg1.Gui.state[17] == 1 && pg1.Gui.state[24] == 1 && pg1.Gui.state[31] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }

                    // Reihe 5 für Spieler: X, Vertikal

                    else if (pg1.Gui.state[4] == 1 && pg1.Gui.state[11] == 1 && pg1.Gui.state[18] == 1 && pg1.Gui.state[25] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[39] == 1 && pg1.Gui.state[32] == 1 && pg1.Gui.state[25] == 1 && pg1.Gui.state[18] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[11] == 1 && pg1.Gui.state[18] == 1 && pg1.Gui.state[25] == 1 && pg1.Gui.state[32] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }

                    // Reihe 6 für Spieler: X, Vertikal

                    else if (pg1.Gui.state[5] == 1 && pg1.Gui.state[12] == 1 && pg1.Gui.state[19] == 1 && pg1.Gui.state[26] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[40] == 1 && pg1.Gui.state[33] == 1 && pg1.Gui.state[26] == 1 && pg1.Gui.state[19] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[12] == 1 && pg1.Gui.state[19] == 1 && pg1.Gui.state[26] == 1 && pg1.Gui.state[33] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }

                    // Reihe 7 für Spieler: X, Vertikal

                    else if (pg1.Gui.state[6] == 1 && pg1.Gui.state[13] == 1 && pg1.Gui.state[20] == 1 && pg1.Gui.state[27] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[41] == 1 && pg1.Gui.state[34] == 1 && pg1.Gui.state[27] == 1 && pg1.Gui.state[20] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[13] == 1 && pg1.Gui.state[20] == 1 && pg1.Gui.state[27] == 1 && pg1.Gui.state[34] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }

                    // Quer für Spieler: X

                    else if (pg1.Gui.state[0] == 1 && pg1.Gui.state[8] == 1 && pg1.Gui.state[16] == 1 && pg1.Gui.state[24] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[1] == 1 && pg1.Gui.state[9] == 1 && pg1.Gui.state[17] == 1 && pg1.Gui.state[25] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[2] == 1 && pg1.Gui.state[10] == 1 && pg1.Gui.state[18] == 1 && pg1.Gui.state[26] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[3] == 1 && pg1.Gui.state[11] == 1 && pg1.Gui.state[19] == 1 && pg1.Gui.state[27] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[6] == 1 && pg1.Gui.state[12] == 1 && pg1.Gui.state[18] == 1 && pg1.Gui.state[24] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[5] == 1 && pg1.Gui.state[11] == 1 && pg1.Gui.state[17] == 1 && pg1.Gui.state[23] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[4] == 1 && pg1.Gui.state[10] == 1 && pg1.Gui.state[16] == 1 && pg1.Gui.state[22] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[3] == 1 && pg1.Gui.state[9] == 1 && pg1.Gui.state[15] == 1 && pg1.Gui.state[21] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }


                    else if (pg1.Gui.state[7] == 1 && pg1.Gui.state[15] == 1 && pg1.Gui.state[23] == 1 && pg1.Gui.state[31] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[8] == 1 && pg1.Gui.state[16] == 1 && pg1.Gui.state[24] == 1 && pg1.Gui.state[32] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[9] == 1 && pg1.Gui.state[17] == 1 && pg1.Gui.state[25] == 1 && pg1.Gui.state[33] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[10] == 1 && pg1.Gui.state[18] == 1 && pg1.Gui.state[26] == 1 && pg1.Gui.state[34] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[13] == 1 && pg1.Gui.state[19] == 1 && pg1.Gui.state[25] == 1 && pg1.Gui.state[31] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[12] == 1 && pg1.Gui.state[18] == 1 && pg1.Gui.state[24] == 1 && pg1.Gui.state[30] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[11] == 1 && pg1.Gui.state[17] == 1 && pg1.Gui.state[23] == 1 && pg1.Gui.state[29] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[10] == 1 && pg1.Gui.state[16] == 1 && pg1.Gui.state[22] == 1 && pg1.Gui.state[28] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }


                    else if (pg1.Gui.state[14] == 1 && pg1.Gui.state[22] == 1 && pg1.Gui.state[30] == 1 && pg1.Gui.state[38] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[15] == 1 && pg1.Gui.state[23] == 1 && pg1.Gui.state[31] == 1 && pg1.Gui.state[39] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[16] == 1 && pg1.Gui.state[24] == 1 && pg1.Gui.state[32] == 1 && pg1.Gui.state[40] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[17] == 1 && pg1.Gui.state[25] == 1 && pg1.Gui.state[33] == 1 && pg1.Gui.state[41] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[20] == 1 && pg1.Gui.state[26] == 1 && pg1.Gui.state[32] == 1 && pg1.Gui.state[38] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[19] == 1 && pg1.Gui.state[25] == 1 && pg1.Gui.state[31] == 1 && pg1.Gui.state[37] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[18] == 1 && pg1.Gui.state[24] == 1 && pg1.Gui.state[30] == 1 && pg1.Gui.state[36] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }
                    else if (pg1.Gui.state[17] == 1 && pg1.Gui.state[23] == 1 && pg1.Gui.state[29] == 1 && pg1.Gui.state[35] == 1) {
                        pg1.Gui.Gewinner = 1;
                    }

                    ///////////////////////////////////////////////////////////////////////////////////////////////////

                    //Reihe 1 für Spieler: O, Horizontal

                    if (pg1.Gui.state[0] == 2 && pg1.Gui.state[1] == 2 && pg1.Gui.state[2] == 2 && pg1.Gui.state[3] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[6] == 2 && pg1.Gui.state[5] == 2 && pg1.Gui.state[4] == 2 && pg1.Gui.state[3] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[2] == 2 && pg1.Gui.state[3] == 2 && pg1.Gui.state[4] == 2 && pg1.Gui.state[5] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[3] == 2 && pg1.Gui.state[4] == 2 && pg1.Gui.state[5] == 2 && pg1.Gui.state[6] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }

                    // Reihe 2 für Spieler: O, Horizontal

                    else if (pg1.Gui.state[7] == 2 && pg1.Gui.state[8] == 2 && pg1.Gui.state[9] == 2 && pg1.Gui.state[10] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[13] == 2 && pg1.Gui.state[12] == 2 && pg1.Gui.state[11] == 2 && pg1.Gui.state[10] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[8] == 2 && pg1.Gui.state[9] == 2 && pg1.Gui.state[10] == 2 && pg1.Gui.state[11] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[9] == 2 && pg1.Gui.state[10] == 2 && pg1.Gui.state[11] == 2 && pg1.Gui.state[12] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[10] == 2 && pg1.Gui.state[11] == 2 && pg1.Gui.state[12] == 2 && pg1.Gui.state[13] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }

                    // Reihe 3 für Spieler: O, Horizontal

                    else if (pg1.Gui.state[14] == 2 && pg1.Gui.state[15] == 2 && pg1.Gui.state[16] == 2 && pg1.Gui.state[17] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[20] == 2 && pg1.Gui.state[19] == 2 && pg1.Gui.state[18] == 2 && pg1.Gui.state[17] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[15] == 2 && pg1.Gui.state[16] == 2 && pg1.Gui.state[17] == 2 && pg1.Gui.state[18] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[16] == 2 && pg1.Gui.state[17] == 2 && pg1.Gui.state[18] == 2 && pg1.Gui.state[19] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }

                    // Reihe 4 für Spieler: O, Horizontal

                    else if (pg1.Gui.state[21] == 2 && pg1.Gui.state[22] == 2 && pg1.Gui.state[23] == 2 && pg1.Gui.state[24] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[27] == 2 && pg1.Gui.state[26] == 2 && pg1.Gui.state[25] == 2 && pg1.Gui.state[24] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[22] == 2 && pg1.Gui.state[23] == 2 && pg1.Gui.state[24] == 2 && pg1.Gui.state[25] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[23] == 2 && pg1.Gui.state[24] == 2 && pg1.Gui.state[25] == 2 && pg1.Gui.state[26] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }

                    // Reihe 5 für Spieler: O, Horizontal

                    else if (pg1.Gui.state[28] == 2 && pg1.Gui.state[29] == 2 && pg1.Gui.state[30] == 2 && pg1.Gui.state[31] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[34] == 2 && pg1.Gui.state[33] == 2 && pg1.Gui.state[32] == 2 && pg1.Gui.state[31] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[29] == 2 && pg1.Gui.state[30] == 2 && pg1.Gui.state[31] == 2 && pg1.Gui.state[32] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[30] == 2 && pg1.Gui.state[31] == 2 && pg1.Gui.state[32] == 2 && pg1.Gui.state[33] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }

                    // Reihe 6 für Spieler: O, Horizontal

                    else if (pg1.Gui.state[35] == 2 && pg1.Gui.state[36] == 2 && pg1.Gui.state[37] == 2 && pg1.Gui.state[38] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[41] == 2 && pg1.Gui.state[40] == 2 && pg1.Gui.state[39] == 2 && pg1.Gui.state[38] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[36] == 2 && pg1.Gui.state[37] == 2 && pg1.Gui.state[38] == 2 && pg1.Gui.state[39] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[37] == 2 && pg1.Gui.state[38] == 2 && pg1.Gui.state[39] == 2 && pg1.Gui.state[40] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }

                    // Reihe 1 für Spieler: O, Vertikal

                    else if (pg1.Gui.state[0] == 2 && pg1.Gui.state[7] == 2 && pg1.Gui.state[14] == 2 && pg1.Gui.state[21] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[35] == 2 && pg1.Gui.state[28] == 2 && pg1.Gui.state[21] == 2 && pg1.Gui.state[14] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[7] == 2 && pg1.Gui.state[14] == 2 && pg1.Gui.state[21] == 2 && pg1.Gui.state[28] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }

                    // Reihe 2 für Spieler: O, Vertikal

                    else if (pg1.Gui.state[1] == 2 && pg1.Gui.state[8] == 2 && pg1.Gui.state[15] == 2 && pg1.Gui.state[22] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[36] == 2 && pg1.Gui.state[29] == 2 && pg1.Gui.state[22] == 2 && pg1.Gui.state[15] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[8] == 2 && pg1.Gui.state[15] == 2 && pg1.Gui.state[22] == 2 && pg1.Gui.state[29] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }

                    // Reihe 3 für Spieler: O, Vertikal

                    else if (pg1.Gui.state[2] == 2 && pg1.Gui.state[9] == 2 && pg1.Gui.state[16] == 2 && pg1.Gui.state[23] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[37] == 2 && pg1.Gui.state[30] == 2 && pg1.Gui.state[23] == 2 && pg1.Gui.state[16] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[9] == 2 && pg1.Gui.state[16] == 2 && pg1.Gui.state[23] == 2 && pg1.Gui.state[30] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }

                    // Reihe 4 für Spieler: O, Vertikal

                    else if (pg1.Gui.state[3] == 2 && pg1.Gui.state[10] == 2 && pg1.Gui.state[17] == 2 && pg1.Gui.state[24] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[38] == 2 && pg1.Gui.state[31] == 2 && pg1.Gui.state[24] == 2 && pg1.Gui.state[17] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[10] == 2 && pg1.Gui.state[17] == 2 && pg1.Gui.state[24] == 2 && pg1.Gui.state[31] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }

                    // Reihe 5 für Spieler: O, Vertikal

                    else if (pg1.Gui.state[4] == 2 && pg1.Gui.state[11] == 2 && pg1.Gui.state[18] == 2 && pg1.Gui.state[25] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[39] == 2 && pg1.Gui.state[32] == 2 && pg1.Gui.state[25] == 2 && pg1.Gui.state[18] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[11] == 2 && pg1.Gui.state[18] == 2 && pg1.Gui.state[25] == 2 && pg1.Gui.state[32] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }

                    // Reihe 6 für Spieler: O, Vertikal

                    else if (pg1.Gui.state[5] == 2 && pg1.Gui.state[12] == 2 && pg1.Gui.state[19] == 2 && pg1.Gui.state[26] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[40] == 2 && pg1.Gui.state[33] == 2 && pg1.Gui.state[26] == 2 && pg1.Gui.state[19] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[12] == 2 && pg1.Gui.state[19] == 2 && pg1.Gui.state[26] == 2 && pg1.Gui.state[33] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }

                    // Reihe 7 für Spieler: O, Vertikal

                    else if (pg1.Gui.state[6] == 2 && pg1.Gui.state[13] == 2 && pg1.Gui.state[20] == 2 && pg1.Gui.state[27] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[41] == 2 && pg1.Gui.state[34] == 2 && pg1.Gui.state[27] == 2 && pg1.Gui.state[20] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[13] == 2 && pg1.Gui.state[20] == 2 && pg1.Gui.state[27] == 2 && pg1.Gui.state[34] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }

                    // Quer für Spieler: O

                    else if (pg1.Gui.state[0] == 2 && pg1.Gui.state[8] == 2 && pg1.Gui.state[16] == 2 && pg1.Gui.state[24] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[1] == 2 && pg1.Gui.state[9] == 2 && pg1.Gui.state[17] == 2 && pg1.Gui.state[25] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[2] == 2 && pg1.Gui.state[10] == 2 && pg1.Gui.state[18] == 2 && pg1.Gui.state[26] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[3] == 2 && pg1.Gui.state[11] == 2 && pg1.Gui.state[19] == 2 && pg1.Gui.state[27] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[6] == 2 && pg1.Gui.state[12] == 2 && pg1.Gui.state[18] == 2 && pg1.Gui.state[24] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[5] == 2 && pg1.Gui.state[11] == 2 && pg1.Gui.state[17] == 2 && pg1.Gui.state[23] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[4] == 2 && pg1.Gui.state[10] == 2 && pg1.Gui.state[16] == 2 && pg1.Gui.state[22] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[3] == 2 && pg1.Gui.state[9] == 2 && pg1.Gui.state[15] == 2 && pg1.Gui.state[21] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }


                    else if (pg1.Gui.state[7] == 2 && pg1.Gui.state[15] == 2 && pg1.Gui.state[23] == 2 && pg1.Gui.state[31] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[8] == 2 && pg1.Gui.state[16] == 2 && pg1.Gui.state[24] == 2 && pg1.Gui.state[32] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[9] == 2 && pg1.Gui.state[17] == 2 && pg1.Gui.state[25] == 2 && pg1.Gui.state[33] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[10] == 2 && pg1.Gui.state[18] == 2 && pg1.Gui.state[26] == 2 && pg1.Gui.state[34] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[13] == 2 && pg1.Gui.state[19] == 2 && pg1.Gui.state[25] == 2 && pg1.Gui.state[31] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[12] == 2 && pg1.Gui.state[18] == 2 && pg1.Gui.state[24] == 2 && pg1.Gui.state[30] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[11] == 2 && pg1.Gui.state[17] == 2 && pg1.Gui.state[23] == 2 && pg1.Gui.state[29] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[10] == 2 && pg1.Gui.state[16] == 2 && pg1.Gui.state[22] == 2 && pg1.Gui.state[28] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }


                    else if (pg1.Gui.state[14] == 2 && pg1.Gui.state[22] == 2 && pg1.Gui.state[30] == 2 && pg1.Gui.state[38] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[15] == 2 && pg1.Gui.state[23] == 2 && pg1.Gui.state[31] == 2 && pg1.Gui.state[39] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[16] == 2 && pg1.Gui.state[24] == 2 && pg1.Gui.state[32] == 2 && pg1.Gui.state[40] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[17] == 2 && pg1.Gui.state[25] == 2 && pg1.Gui.state[33] == 2 && pg1.Gui.state[41] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[20] == 2 && pg1.Gui.state[26] == 2 && pg1.Gui.state[32] == 2 && pg1.Gui.state[38] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[19] == 2 && pg1.Gui.state[25] == 2 && pg1.Gui.state[31] == 2 && pg1.Gui.state[37] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[18] == 2 && pg1.Gui.state[24] == 2 && pg1.Gui.state[30] == 2 && pg1.Gui.state[36] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                    else if (pg1.Gui.state[17] == 2 && pg1.Gui.state[23] == 2 && pg1.Gui.state[29] == 2 && pg1.Gui.state[35] == 2) {
                        pg1.Gui.Gewinner = 2;
                    }
                }
            }
        },0, 150);
    }
}
