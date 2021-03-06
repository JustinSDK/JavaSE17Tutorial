package cc.openhome;

import static java.lang.System.out;
import static java.lang.Integer.parseInt;

public class Exercise3 {                          
    public static void main(String[] args) {
        var knight = new Knight();
        
        if(knight.travel(parseInt(args[0]), parseInt(args[1]))) {
            out.println("遊歷完成！");
        }
        else {
            out.println("遊歷失敗！");
        }
        knight.print();
    }
}


class Knight {
    private int[][] board = new int[8][8];
    // 對應騎士可走的八個方向
    private int[] ktmove1 = {-2, -1, 1, 2, 2, 1, -1, -2};
    private int[] ktmove2 = {1, 2, 2, 1, -1, -2, -2, -1};
    // 下一步出路的位置
    private int[] nexti = new int[8];
    private int[] nextj = new int[8];
    
    void print() {
        for(var i = 0; i < board.length; i++) {
            for(var j = 0; j < board[0].length; j++) {
                System.out.printf("%2d ", board[i][j]);
            }
            System.out.println();
        }
    }
    
    boolean travel(int startX, int startY) {
        board[startX][startY] = 1;
        
        for(int m = 2, x = startX, y = startY; 
                m <= Math.pow(board.length, 2); m++) {
            // 計算可能的走法
            var count = possible(x, y);
            
            if(count == 0) {
                return false;
            }
            
            // 找最少出路的方向
            var min = min(count);
            
            // 走最少出路的方向
            x = nexti[min];
            y = nextj[min];
            board[x][y] = m;
        }
        
        return true;
    }
    
    int possible(int x, int y) {
        var count = 0;
        // 試探八個方向
        for(var k = 0; k < board.length; k++) {
            var tmpi = x + ktmove1[k];
            var tmpj = y + ktmove2[k];
                
            // 如果是邊界了，不可走
            if(tmpi < 0 || tmpj < 0 || 
               tmpi > 7 || tmpj > 7) {
                continue;
            }
                
            // 如果這個方向可走，記錄下來
            if(board[tmpi][tmpj] == 0) {
                nexti[count] = tmpi;
                nextj[count] = tmpj;
                // 可走的方向加一個
                count++;
            }
        }
        return count;
    }
    
    private int min(int count) {
        // 記錄出路的個數
        var exists = new int[8];
        var min = -1;
        if(count == 1) {
            min = 0;
        }
        else {
            // 找出下一個位置的出路數
            for(var l = 0; l < count; l++) {
                for(var k = 0; k < board.length; k++) {
                    var tmpi = nexti[l] + ktmove1[k];
                    var tmpj = nextj[l] + ktmove2[k];
                    if(tmpi < 0 || tmpj < 0 || 
                       tmpi > 7 || tmpj > 7) {
                        continue;
                    }
                    if(board[tmpi][tmpj] == 0)
                        exists[l]++;
                }
            }
            var tmp = exists[0];
            min = 0;

            // 從可走的方向中尋找最少出路的方向
            for(var l = 1; l < count; l++) {
                if(exists[l] < tmp) {
                    tmp = exists[l];
                    min = l;
                }
            }
        }
        return min;
    }
}