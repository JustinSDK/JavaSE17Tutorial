package cc.openhome;

import java.io.*;

record Member2(String id, String name, int age) implements Serializable {
    public void save() throws IOException {
        try(var output = new ObjectOutputStream(new FileOutputStream(id))) {
            output.writeObject(this);
        } 
    }
    
    public static Member2 load(String id) 
                    throws IOException, ClassNotFoundException {
        try(var input = new ObjectInputStream(new FileInputStream(id))) {
            return (Member2) input.readObject(); 
        } 
    }
}
