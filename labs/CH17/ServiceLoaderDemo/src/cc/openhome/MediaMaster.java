package cc.openhome;

import cc.openhome.api.Player;
import java.util.Scanner;

public class MediaMaster {
    public static void main(String[] args) throws ReflectiveOperationException {
        String playerImpl = System.getProperty("cc.openhome.PlayerImpl");
        Player player = (Player) Class.forName(playerImpl)
                                      .getDeclaredConstructor().newInstance();
        System.out.print("輸入想播放的影片：");
        player.play(new Scanner(System.in).nextLine());
    }
}

