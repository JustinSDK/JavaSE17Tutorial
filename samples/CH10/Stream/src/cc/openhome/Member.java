package cc.openhome;

import java.io.*;

record Member(String id, String name, int age) {
    public void save() throws IOException {
        try(var output = new DataOutputStream(new FileOutputStream(id))) {
            output.writeUTF(id);
            output.writeUTF(name);
            output.writeInt(age);
        } 
    }
    
    public static Member load(String id) throws IOException {
        try(var input = new DataInputStream(new FileInputStream(id))) {
            return new Member(input.readUTF(), input.readUTF(), input.readInt());
        } 
    }
} 
