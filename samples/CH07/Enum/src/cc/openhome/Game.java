package cc.openhome;

import static java.lang.System.out;

public class Game {
    public static void main(String[] args) {
        play(Action.RIGHT);
        play(Action.UP);
    } 

    public static void play(Action action) {
    	out.println(
        	    switch(action) {
        	        case STOP  -> "播放停止動畫";
        	        case RIGHT -> "播放向右動畫";
        	        case LEFT  -> "播放向左動畫";
        	        case UP    -> "播放向上動畫";
        	        case DOWN  -> "播放向下動畫";
        	    }
        	);
    }   
}