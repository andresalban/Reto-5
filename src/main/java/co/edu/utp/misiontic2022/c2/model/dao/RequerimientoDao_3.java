package co.edu.utp.misiontic2022.c2.model.dao;

import java.sql.*;
import java.util.ArrayList;

import co.edu.utp.misiontic2022.c2.model.vo.Requerimiento_3;
import co.edu.utp.misiontic2022.c2.util.JDBCUtilities;

public class RequerimientoDao_3 {

    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        ArrayList<Requerimiento_3> respuesta = new ArrayList<Requerimiento_3>();
        Connection connection = JDBCUtilities.getConnection();
        PreparedStatement preStmt = null;
        ResultSet rs = null;

        try {
            String sqlR3 = "SELECT SUBSTR(l.Nombre,1,3)|| SUBSTR(l.Primer_Apellido ,1,3)||SUBSTR(l.Segundo_Apellido ," +
                    "1,3) as 'Abrev.'FROM Lider l";
            preStmt = connection.prepareStatement(sqlR3);
            rs = preStmt.executeQuery();

            while (rs.next()) {
                Requerimiento_3 requerimiento_3 = new Requerimiento_3(rs.getString("Abrev."));
                respuesta.add(requerimiento_3);
            }
        } catch (SQLException e) {
            System.err.println("Error en la consulta SQL Requerimiento_3 -> " + e);
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (preStmt != null) {
                preStmt.close();
            }
            if (connection != null) {
                connection.close();
            }

        }
        return respuesta;
    }

}

