package cc.openhome;

import java.sql.*;
import java.util.*;
import javax.sql.DataSource;

public class MessagesInfo {
    private DataSource dataSource;
    
    public MessagesInfo(DataSource dataSource) {
        this.dataSource = dataSource;        
    }
    
    public List<ColumnInfo> getAllColumnInfo() {
        List<ColumnInfo> infos = null;
        try(var conn = dataSource.getConnection()) {
            var meta = conn.getMetaData();
            var crs = meta.getColumns(null, null, "MESSAGES", null);
            infos =  new ArrayList<>();
            while(crs.next()) {
                ColumnInfo info = toColumnInfo(crs);
                infos.add(info);
            }
        } 
        catch(SQLException ex) {
            throw new RuntimeException(ex);
        }
        return infos;
    }

    private ColumnInfo toColumnInfo(ResultSet crs) throws SQLException {
        return new ColumnInfo(
            crs.getString("COLUMN_NAME"),
            crs.getString("TYPE_NAME"),
            crs.getInt("COLUMN_SIZE"),
            crs.getBoolean("IS_NULLABLE"),
            crs.getString("COLUMN_DEF")
        );
    }
} 
