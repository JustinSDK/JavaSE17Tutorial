package cc.openhome;

import static java.lang.System.out;
import java.nio.file.*;

public class Roots {
    public static void main(String[] args) {
        var dirs = FileSystems.getDefault().getRootDirectories();
        dirs.forEach(out::println);
    }
} 
