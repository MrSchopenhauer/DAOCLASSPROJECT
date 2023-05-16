package mx.projectpre.otherpackage;

import java.util.*;
import java.sql.*;

import mx.projectpre.Arma;
import mx.projectpre.ArmasDAO;
import mx.projectpre.otherpackage.error.PersistenciaException;
import mx.projectpre.AbstractDAO;

public class ArmasDAODerbyImp extends AbstractDAO implements ArmasDAO {
	

	@Override
	public void create(Arma a) {
		// TODO Auto-generated method stub

	}

	@Override
	public Arma read(Arma s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Arma> read() {
		List<Arma> resultado;
		Statement stmt;
		resultado = new ArrayList<Arma>();
		ResultSet rs;
		int id;
		int nivel;
		String nombre;
		Arma arma;
		String imagen;
		
		try {
			//TODO conexion pertenece a AbstractDAO 
			stmt = this.conexion.createStatement();
			rs = stmt.executeQuery("select * from armas");
			while(rs.next()) {
				arma = new Arma();
				id = rs.getInt("id");
				//TODO Id es un atributo de arma
				arma.setId(id);
				nombre = rs.getString("nombre");
				arma.setNombre(nombre);
				nivel = rs.getInt("Poder");
				arma.setNivel(nivel);
				imagen = rs.getString("Imagen");
				arma.setImagen(imagen);
				resultado.add(arma);
				
			}
			
		} catch (SQLException e) {
			throw new PersistenciaException();
		}
	
		return resultado;
	}

	@Override
	public void update(Arma s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Arma s) {
		// TODO Auto-generated method stub

	}
	//REVISAR SI ESTO DEBE COLOCARSE AQUÍ 
	public void setConexion(Connection con) {
		// TODO Auto-generated method stub
		
	}

}
