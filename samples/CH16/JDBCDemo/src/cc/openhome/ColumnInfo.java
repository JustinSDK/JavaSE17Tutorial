package cc.openhome;

public record ColumnInfo(
    String name, 
    String type, 
    int size, 
    boolean nullable, 
    String def) {}
