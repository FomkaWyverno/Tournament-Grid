package sample;

import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class TGrid {
    private static TextField nickFlied = Controller.getNickWriter();
    private static ImageView greenMark = Controller.getMarkGreen();
    private static ImageView redMark = Controller.getMarkRed();
    private static String[] players = new String[16];
    private static int sizePlayers = 0;
    private static boolean isFull;

    protected static boolean isFull() {
        return isFull;
    }
    protected static void addPlayer(String player) {
        if (sizePlayers < 16) {
            players[sizePlayers] = player;
            sizePlayers++;
            if (sizePlayers == 16) {
                nickFlied.setEditable(false);
                redMark.setVisible(false);
                greenMark.setVisible(true);
                isFull = true;
                for (int i = 0; i < players.length; i++) {
                    System.out.println(players[i]);
                }
            }
        }
    }
}
