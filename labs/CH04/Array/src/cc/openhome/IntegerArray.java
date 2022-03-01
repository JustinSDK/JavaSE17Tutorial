package cc.openhome;

public class IntegerArray {
    public static void main(String[] args) {
        Integer[] scores = new Integer[3];
        for(Integer score : scores) {
            System.out.println(score);
        }
        
        scores[0] = 99;
        scores[1] = 87;
        scores[2] = 66;
        
        for(Integer score : scores) {
            System.out.println(score);
        }
    }
}
