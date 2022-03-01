package cc.openhome;

import static java.lang.System.out;

public class Game {
    public static void main(String[] args) {
        play(Action.RIGHT);
        play(Action.UP);
    }    

    public static void play(int action) {
    	out.println(
    	    switch(action) {
    	        case Action.STOP  -> "播放停止動畫";
    	        case Action.RIGHT -> "播放向右動畫";
    	        case Action.LEFT  -> "播放向左動畫";
    	        case Action.UP    -> "播放向上動畫";
    	        case Action.DOWN  -> "播放向下動畫";
    	        default           -> "不支援此動作";
    	    }
    	);
    }    
}