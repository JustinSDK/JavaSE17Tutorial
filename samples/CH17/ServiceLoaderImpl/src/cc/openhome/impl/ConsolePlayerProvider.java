package cc.openhome.impl;

import cc.openhome.api.Player;
import cc.openhome.api.PlayerProvider;

public class ConsolePlayerProvider implements PlayerProvider {
    @Override
    public Player player() {
        return new ConsolePlayer();
    }
}