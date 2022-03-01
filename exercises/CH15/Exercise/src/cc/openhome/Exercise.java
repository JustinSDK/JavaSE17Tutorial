package cc.openhome;

import java.io.IOException;
import static java.lang.System.out;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise {
    public static void main(String[] args) throws IOException {
        try(var console = new Scanner(System.in);) {
            out.print("檔案位置：");
            var file = Paths.get(console.nextLine());
            out.print("檔案編碼：");
            var encoding = console.nextLine();
            
            var html = new String(Files.readAllBytes(file), encoding);
            var pattern = Pattern.compile("<a.+>(<img.+>)</a>");
            var matcher = pattern.matcher(html);
            html = matcher.replaceAll("$1");
            Files.write(file, html.getBytes(encoding), StandardOpenOption.WRITE);
        }
    }
} 
