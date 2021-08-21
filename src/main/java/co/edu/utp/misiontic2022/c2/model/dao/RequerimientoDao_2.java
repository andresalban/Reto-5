package co.edu.utp.misiontic2022.c2.model.dao;

import java.sql.*;
import java.util.ArrayList;

import co.edu.utp.misiontic2022.c2.model.vo.Requerimiento_2;
import co.edu.utp.misiontic2022.c2.util.JDBCUtilities;

public class RequerimientoDao_2 {

    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        ArrayList<Requerimiento_2> respuesta = new ArrayList<Requerimiento_2>();
        Connection connection = JDBCUtilities.getConnection();
        PreparedStatement preStmt = null;
        ResultSet rs = null;

        try {
            String sqlR2 ="SELECT p.Fecha_Inicio, p.Ciudad, p.Constructora, " +
                    "l.Nombre || ' ' || l.Segundo_Apellido as 'Nombre Lider', " +
                    "t.Codigo_Tipo, t.Estrato " +
                    "FROM Proyecto p  INNER JOIN Lider l ON p.ID_Lider = l.ID_Lider " +
                    "INNER JOIN Tipo t ON p.ID_Tipo = t.ID_Tipo " +
                    "WHERE (p.Fecha_Inicio >= '2019-09-01' AND p.Fecha_Inicio <= '2019-09-09' AND p.Ciudad = 'Pereira')";

            preStmt = connection.prepareStatement(sqlR2);
            rs = preStmt.executeQuery();

            while (rs.next()) {
                Requerimiento_2 requerimiento2 = new Requerimiento_2(
                        rs.getString("Fecha_Inicio"),
                        rs.getString("Ciudad"),
                        rs.getString("Constructora"),
                        rs.getString("Nombre Lider"),
                        rs.getInt("Codigo_Tipo"),
                        rs.getInt("Estrato")  );
                respuesta.add(requerimiento2);
            }

        } catch (SQLException e) {
            System.err.println("Error en la consulta SQL Requerimiento 2 -> " + e);
        }finally{
            if (rs!=null){
                rs.close();
            }if (preStmt != null){
                preStmt.close();
            }if(connection!=null){
                connection.close();
            }


        }
        // Su código
        return respuesta;
    }

}

