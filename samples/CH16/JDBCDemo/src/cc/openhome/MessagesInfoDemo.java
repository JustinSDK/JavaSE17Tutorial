package cc.openhome;

import java.io.IOException;
import static java.lang.System.out;

public class MessagesInfoDemo {
    public static void main(String[] args) 
            throws IOException, ClassNotFoundException {
        MessagesInfo messagesInfo = 
                new MessagesInfo(new SimpleConnectionPoolDataSource());
        out.println("名稱\t型態\t為空\t預設");
        messagesInfo.getAllColumnInfo().forEach(info -> {
            out.printf("%s\t%s\t%s\t%s%n",
                    info.name(),
                    info.type(),
                    info.nullable(),
                    info.def());
        });
    }
}
