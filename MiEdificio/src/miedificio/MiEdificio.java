package miedificio;

import datos.Conexion;
import java.sql.Connection;
import java.sql.SQLException;

public class MiEdificio {

    public static void main(String[] args) {
        try (Connection con = Conexion.conectar()) {
            System.out.println("Conexión exitosa a la base miedificio");
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
    }

}
