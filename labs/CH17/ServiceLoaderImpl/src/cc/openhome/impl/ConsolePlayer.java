package cc.openhome.impl;

import cc.openhome.api.Player;

public class ConsolePlayer implements Player {
    @Override
    public void play(String video) {
        System.out.println("正在播放 " + video);
    }
}
