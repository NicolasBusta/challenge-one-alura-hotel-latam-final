package com.alura.controller;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

import com.alura.dao.HuespedDAO;
import com.alura.factory.ConnectionFactory;
import com.alura.modelo.Huesped;

public class HuespedController {
	
	private ConnectionFactory connectionFactory;
	 private HuespedDAO huespedDAO;
	 
	 public HuespedController() {
	        connectionFactory = new ConnectionFactory();
	        Connection connection = connectionFactory.recuperarConexion();
	        huespedDAO = new HuespedDAO(connection);
	    }

	 public void guardar(Huesped huesped) {
			this.huespedDAO.guardar(huesped);
		}
	 
	 public List<Huesped> listarHuespedes() {
			return this.huespedDAO.listarHuespedes();
		}
	 public List<Huesped> listarHuespedesId(String id) {
			return this.huespedDAO.buscarId(id);
		}
		
		
		public void Eliminar(Integer id) {
			this.huespedDAO.Eliminar(id);
		}

		public void actualizar(String nombre, String apellido, Date fechaN, String nacionalidad, String telefono,
				Integer idReserva, Integer id) {
			this.huespedDAO.Actualizar(nombre, apellido, fechaN, nacionalidad, telefono, idReserva, id);
			
		}
		



}
