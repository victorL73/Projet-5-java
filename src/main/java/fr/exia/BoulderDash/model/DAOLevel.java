package fr.exia.BoulderDash.model;

import com.mysql.jdbc.CallableStatement;
import fr.exia.BoulderDash.entity.EntityFactory;
import fr.exia.BoulderDash.entity.Map;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
/**the class DAOLevel is used for the connection with the database
 * @author  Mathéo NOEL
 * @version 1.0
 */
public class DAOLevel{
    /** findMapOnDataBase is used for the connection in the database and take the txt map*/
    public Map findMapOnDataBase(final int id) {
        Map map = new Map();
        String urlString = "jdbc:mysql://127.0.0.1/jpublankjavaproject?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String loginString = "root";
        String passwordString = "";
        Connection cConnection = null;
        CallableStatement stStatement = null;
        ResultSet resultSet = null;
        String sqlRequestString = "{call LevelBDById(?)}";
        try {
            cConnection = DriverManager.getConnection(urlString, loginString, passwordString);
            stStatement = (CallableStatement) cConnection.prepareCall(sqlRequestString);
            stStatement.setInt(1, id);
            stStatement.execute();
            resultSet = stStatement.getResultSet();
            if (resultSet.first()) {
                int width = resultSet.getInt("width");
                int height = resultSet.getInt("height");
                map = new Map(width, height);
                String TEMP_map_FromSQL = resultSet.getString("message");
                TEMP_map_FromSQL = TEMP_map_FromSQL.replaceAll("\r\n", "");
                for (int y = 0; y < height; y++) {
                    for (int x = 0; x < height; x++) {
                        map.setOnTheMapXY(EntityFactory.getFromFileSymbol(TEMP_map_FromSQL.charAt(y * width + x)), x, y);
                    }

                }
            } else {
                System.out.println("<MAP NOT FOUND>");
            }

        }catch (final SQLException e){
            e.printStackTrace();
        }finally {
            try{
                cConnection.close();
                stStatement.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return map;
        }
    }