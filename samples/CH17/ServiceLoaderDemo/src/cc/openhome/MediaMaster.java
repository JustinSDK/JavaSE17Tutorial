package cc.openhome;

import cc.openhome.api.PlayerProvider;
import java.util.Scanner;

public class MediaMaster {
    public static void main(String[] args)
                         throws ReflectiveOperationException {
        var player = PlayerProvider.providePlayer();
        System.out.print("輸入想播放的影片：");
        player.play(new Scanner(System.in).nextLine());
    }
}