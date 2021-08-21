package co.edu.utp.misiontic2022.c2.model.dao;

import java.sql.*;
import java.util.ArrayList;

import co.edu.utp.misiontic2022.c2.model.vo.Requerimiento_1;
import co.edu.utp.misiontic2022.c2.util.JDBCUtilities;

public class RequerimientoDao_1 {

    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        // Su código

        ArrayList<Requerimiento_1> respuesta = new ArrayList<Requerimiento_1>();
        Connection connection = JDBCUtilities.getConnection();
        PreparedStatement preStmt = null;
        ResultSet rs = null;

        try {

            var sqlR1 = "SELECT c.Fecha, c.ID_Compra, c.Proveedor, c.Pagado FROM Compra c ORDER BY c.ID_Compra DESC LIMIT 10";
            preStmt = connection.prepareStatement(sqlR1);
            rs = preStmt.executeQuery();

            while (rs.next()) {
                Requerimiento_1 requerimiento_1 = new Requerimiento_1();
                requerimiento_1.setFechaCompra(rs.getString("Fecha"));
                requerimiento_1.setCodCompra(rs.getInt("ID_Compra"));
                requerimiento_1.setNombreProveedor(rs.getString("Proveedor"));
                requerimiento_1.setPagado(rs.getString("Pagado"));
                respuesta.add(requerimiento_1);

            }

        } catch (SQLException e) {
            System.out.println("Error de consulta SQL Requerimiento 1 -> " + e);
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
