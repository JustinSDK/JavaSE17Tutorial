package cc.openhome;

import java.io.*;
import java.util.Scanner;

public class FileUtil {
    public static String readFile(String name) throws FileNotFoundException {
        var text = new StringBuilder();
        try {
            var console = new Scanner(new FileInputStream(name));
            while(console.hasNext()) {
                text.append(console.nextLine())
                    .append('\n');
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw ex;
        }
        return text.toString();
    }
}