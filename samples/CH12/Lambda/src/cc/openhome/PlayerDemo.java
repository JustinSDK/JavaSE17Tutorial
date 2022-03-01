package cc.openhome;

import static java.lang.System.out;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class PlayerDemo {
    public static void main(String[] args) {
        var players = List.of(
                new Player("Justin", 39),
                new Player("Monica", 36),
                new Player("Irene", 6)
        );
        players.stream()
                .filter(player -> player.age() > 15)
                .map(Player::name)
                .map(String::toUpperCase)
                .collect(toList())
                .forEach(out::println);
    }
}

record Player(String name, Integer age) {}