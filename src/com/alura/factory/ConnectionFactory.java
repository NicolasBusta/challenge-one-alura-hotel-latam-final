package com.alura.factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	
	private DataSource datadource;
	
	public ConnectionFactory() {
		
		var pooledDataSource = new ComboPooledDataSource();
		
		pooledDataSource.setJdbcUrl("jdbc:mysql://localhost/hotel_alura?useTimeZone=true&serverTimeZone=UTC");
		pooledDataSource.setUser("root");
		pooledDataSource.setPassword("7361017");
		pooledDataSource.setMaxPoolSize(5);//maximas cocnecciones.
		
		this.datadource = pooledDataSource;
	}
	
	public Connection recuperarConexion() {	
		try {

			return this.datadource.getConnection();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}

}
