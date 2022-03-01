package cc.openhome;

import static java.lang.System.out;

public class SplitDemo {
    public static void main(String[] args) {
        // 根據逗號切割
        for(var token : "Justin,Monica,Irene".split(",")) {
            out.println(token);
        }
        // 根據Orz切割
        for(var token : "JustinOrzMonicaOrzIrene".split("Orz")) {
            out.println(token);
        }
        // 根據Tab字元切割
        for(var token : "Justin\tMonica\tIrene".split("\\t")) {
            out.println(token);
        }
    }
} 
