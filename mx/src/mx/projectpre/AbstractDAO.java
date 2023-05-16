package mx.projectpre;

import java.sql.*;

public class AbstractDAO {
	protected Connection conexion;
	
	public AbstractDAO() {
		this.conexion = null;
	}
	
	public AbstractDAO(Connection c) {
		this.conexion = c;
	}
	
	

}
