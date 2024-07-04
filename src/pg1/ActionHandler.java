package pg1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {
        @Override
    public void actionPerformed(ActionEvent e) {
        if (pg1.Gui.Gewinner == 0) {

            // Reihe 1

            if (e.getSource() == pg1.Gui.btn[0]) {
                if (pg1.Gui.state[0] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[0] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[0] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[0] = 2;
                    pg1.Gui.player = 0;
                }

            } else if (e.getSource() == pg1.Gui.btn[1]) {
                if (pg1.Gui.state[1] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[1] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[1] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[1] = 2;
                    pg1.Gui.player = 0;
                }
            } else if (e.getSource() == pg1.Gui.btn[2]) {
                if (pg1.Gui.state[2] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[2] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[2] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[2] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[3]) {
                if (pg1.Gui.state[3] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[3] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[3] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[3] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[4]) {
                if (pg1.Gui.state[4] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[4] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[4] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[4] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[5]) {
                if (pg1.Gui.state[5] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[5] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[5] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[5] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[6]) {
                if (pg1.Gui.state[6] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[6] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[6] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[6] = 2;
                    pg1.Gui.player = 0;
                }

                //Reihe 2

            }else if (e.getSource() == pg1.Gui.btn[7]) {
                if (pg1.Gui.state[7] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[7] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[7] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[7] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[8]) {
                if (pg1.Gui.state[8] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[8] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[8] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[8] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[9]) {
                if (pg1.Gui.state[9] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[9] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[9] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[9] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[10]) {
                if (pg1.Gui.state[10] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[10] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[10] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[10] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[11]) {
                if (pg1.Gui.state[11] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[11] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[11] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[11] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[12]) {
                if (pg1.Gui.state[12] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[12] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[12] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[12] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[13]) {
                if (pg1.Gui.state[13] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[13] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[13] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[13] = 2;
                    pg1.Gui.player = 0;
                }

                // Reihe 3

            }else if (e.getSource() == pg1.Gui.btn[14]) {
                if (pg1.Gui.state[14] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[14] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[14] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[14] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[15]) {
                if (pg1.Gui.state[15] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[15] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[15] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[15] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[16]) {
                if (pg1.Gui.state[16] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[16] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[16] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[16] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[17]) {
                if (pg1.Gui.state[17] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[17] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[17] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[17] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[18]) {
                if (pg1.Gui.state[18] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[18] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[18] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[18] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[19]) {
                if (pg1.Gui.state[19] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[19] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[19] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[19] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[20]) {
                if (pg1.Gui.state[20] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[20] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[20] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[20] = 2;
                    pg1.Gui.player = 0;
                }

                //Reihe 4

            }else if (e.getSource() == pg1.Gui.btn[21]) {
                if (pg1.Gui.state[21] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[21] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[21] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[21] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[22]) {
                if (pg1.Gui.state[22] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[22] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[22] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[22] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[23]) {
                if (pg1.Gui.state[23] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[23] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[23] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[23] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[24]) {
                if (pg1.Gui.state[24] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[24] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[24] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[24] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[25]) {
                if (pg1.Gui.state[25] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[25] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[25] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[25] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[26]) {
                if (pg1.Gui.state[26] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[26] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[26] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[26] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[27]) {
                if (pg1.Gui.state[27] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[27] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[27] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[27] = 2;
                    pg1.Gui.player = 0;
                }

                //Reihe 5

            }else if (e.getSource() == pg1.Gui.btn[28]) {
                if (pg1.Gui.state[28] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[28] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[28] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[28] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[29]) {
                if (pg1.Gui.state[29] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[29] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[29] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[29] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[30]) {
                if (pg1.Gui.state[30] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[30] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[30] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[30] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[31]) {
                if (pg1.Gui.state[31] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[31] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[31] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[31] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[32]) {
                if (pg1.Gui.state[32] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[32] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[32] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[32] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[33]) {
                if (pg1.Gui.state[33] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[33] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[33] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[33] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[34]) {
                if (pg1.Gui.state[34] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[34] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[34] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[34] = 2;
                    pg1.Gui.player = 0;
                }

                // Reihe 6

            }else if (e.getSource() == pg1.Gui.btn[35]) {
                if (pg1.Gui.state[35] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[35] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[35] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[35] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[36]) {
                if (pg1.Gui.state[36] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[36] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[36] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[36] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[37]) {
                if (pg1.Gui.state[37] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[37] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[37] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[37] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[38]) {
                if (pg1.Gui.state[38] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[38] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[38] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[38] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[39]) {
                if (pg1.Gui.state[39] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[39] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[39] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[39] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[40]) {
                if (pg1.Gui.state[40] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[40] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[40] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[40] = 2;
                    pg1.Gui.player = 0;
                }
            }else if (e.getSource() == pg1.Gui.btn[41]) {
                if (pg1.Gui.state[41] == 0 && pg1.Gui.player == 0) {
                    pg1.Gui.state[41] = 1;
                    pg1.Gui.player = 1;
                } else if (pg1.Gui.state[41] == 0 && pg1.Gui.player == 1) {
                    pg1.Gui.state[41] = 2;
                    pg1.Gui.player = 0;
                }
            }
        }
    }
}
