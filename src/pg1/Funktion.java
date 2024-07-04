package pg1;

public class Funktion {
    public static void reset() {
        for (int i = 0; i < pg1.Gui.state.length; i++) {
            pg1.Gui.state[i] = 0;
        }
        pg1.Gui.player = 0;
        pg1.Gui.Gewinner = 0;
    }
    public static void setText(String text) {
    }
}