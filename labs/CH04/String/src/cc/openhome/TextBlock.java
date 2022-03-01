package cc.openhome;

public class TextBlock {
    public static void main(String[] args) {
        String html = 
            """
            <!DOCTYPE html>
            <html lang="zh-tw">
            <head>
                <title>%s</title>
            </head>
            <body>
                %s
            </html>
            """;
        
    	String title = "Java Tutorial";
    	String content = "<b>Hello, World</b>";
    	
        System.out.println(html.formatted(title, content));
    }
}
