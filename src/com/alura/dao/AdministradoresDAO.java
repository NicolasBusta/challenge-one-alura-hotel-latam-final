package com.alura.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.alura.modelo.Administradores;

public class AdministradoresDAO {

final private Connection con;
	
	
	public AdministradoresDAO(Connection con) {
		this.con = con;
	}
	
	public Administradores autenticar(String nombreUsuario, String contrasena) {
        // Crear una consulta SQL para verificar si el nombre de usuario y la contraseña son válidos
        String sql = "SELECT * FROM administradores WHERE nombre = ? AND contraseña = ?";
        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setString(1, nombreUsuario);
            statement.setString(2, contrasena);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    // El nombre de usuario y la contraseña son válidos
                    Administradores administrador = new Administradores(nombreUsuario, contrasena);
                    administrador.setId(resultSet.getInt("id"));
                    return administrador;
                } else {
                    // El nombre de usuario o la contraseña no son válidos
                    return null;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
	
}
