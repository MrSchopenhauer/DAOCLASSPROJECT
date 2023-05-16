package mx.projectpre;

import java.util.*;
import mx.projectpre.otherpackage.*;
import java.sql.*;
//Driver manager and connection

public class Principal {

	public static void main(String[] args) {
		ArmasDAODerbyImp armasDAO;
		List<Arma> misArmas;
		Connection con;
		String url;
		
		//url = //"AQUI VA LO QUE ESCRIBE EN EL IJ "
		url = "jdbc:derby://localhost : 1527/lemuria";
		try {
		con = DriverManager.getConnection(url);
		armasDAO = new ArmasDAODerbyImp();
		armasDAO.setConexion(con);
		misArmas = armasDAO.read();
		//DEBEMOS INSERTAR ARMAS DESDE IJ, previamente (1,"nombrearma", 
		for(Arma a : misArmas) {
			System.out.println(a);
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
