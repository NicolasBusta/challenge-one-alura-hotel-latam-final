package com.alura.controller;

import java.sql.Connection;
import java.util.Date;
import java.util.List;

import com.alura.dao.HuespedDAO;
import com.alura.dao.ReservaDAO;
import com.alura.factory.ConnectionFactory;
import com.alura.modelo.Huesped;
import com.alura.modelo.Reserva;

public class ReservaController {
	
	private ConnectionFactory connectionFactory;
	private ReservaDAO reservaDAO;
	private HuespedDAO huespedDAO;
	
	public ReservaController() {
        connectionFactory = new ConnectionFactory();
        Connection connection = connectionFactory.recuperarConexion();
        reservaDAO = new ReservaDAO(connection);
    }

	public void guardar(Reserva reserva) {
		this.reservaDAO.guardar(reserva);
	}
	
	public List<Reserva> buscar() {
		return this.reservaDAO.buscar();
	}

	public List<Reserva> buscarId(String id) {
		return this.reservaDAO.buscarId(id);
	}
	
	public void actualizar(Date fechaE, Date fechaS, String valor, String formaPago, Integer id) {
		this.reservaDAO.Actualizar(fechaE, fechaS, valor, formaPago, id);
	}
	
	public void Eliminar(Integer id) {
		this.reservaDAO.Eliminar(id);
	}

	

}
