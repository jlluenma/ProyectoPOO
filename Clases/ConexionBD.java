package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:sqlserver://LAPTOP-LBTTUPNM:1433;database=Prueba";
    private static final String USER = "sa";
    private static final String PSWRD = "123456";
    private Connection conexion;

    public ConexionBD()  {
        try {
            conexion = DriverManager.getConnection(URL, USER, PSWRD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public  Connection getConexion() {
        return conexion;
    }

}
