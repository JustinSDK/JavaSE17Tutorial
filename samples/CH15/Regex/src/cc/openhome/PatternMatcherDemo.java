package cc.openhome;

import static java.lang.System.out;
import java.util.regex.*;

public class PatternMatcherDemo {
    public static void main(String[] args) {
        String[] regexs = {".*foo", ".*?foo", "x*+foo", ".*+foo"};
        for(var regex : regexs) {
            var pattern = Pattern.compile(regex);
            var matcher = pattern.matcher("xfooxxxxxxfoo");
            out.printf("%s find ", pattern.pattern());
            while(matcher.find()) {
                out.printf(" \"%s\"", matcher.group());
            }
            out.println(" in \"xfooxxxxxxfoo\".");
        }
    }
}
