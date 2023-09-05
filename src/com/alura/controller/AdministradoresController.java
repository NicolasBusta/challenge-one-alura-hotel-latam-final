package com.alura.controller;

import java.sql.Connection;

import com.alura.dao.AdministradoresDAO;
import com.alura.factory.ConnectionFactory;
import com.alura.modelo.Administradores;

public class AdministradoresController {

	private ConnectionFactory connectionFactory;
    private AdministradoresDAO administradoresDAO;

    public AdministradoresController() {
        connectionFactory = new ConnectionFactory();
        Connection connection = connectionFactory.recuperarConexion();
        administradoresDAO = new AdministradoresDAO(connection);
    }

    public Administradores login(String usuario, String contrasena) {
        // Autenticar al usuario con la base de datos
        Administradores administrador = administradoresDAO.autenticar(usuario, contrasena);
        return administrador;
    }
}
