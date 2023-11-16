package Ejercicio5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOPaises {
	private static final String URL = "jdbc:sqlite:C:\\Users\\34636\\Desktop\\DAM 2\\ACCESO A DATOS\\ArchivosEjerFinales\\base.bd";

	public void insertarPais(Paises pais) throws SQLException {
	    Connection conexion = DriverManager.getConnection(URL);
	    String insertQuery = "INSERT INTO paises (nombre, presidente, pib, gini) VALUES (?, ?, ?, ?)";

	    try (PreparedStatement sentencia = conexion.prepareStatement(insertQuery)) {
	        sentencia.setString(1, pais.getPais());
	        sentencia.setString(2, pais.getPresidente());
	        sentencia.setInt(3, pais.getPib());
	        sentencia.setDouble(4, pais.getGini());
	        sentencia.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        if (conexion != null) {
	            conexion.close();
	        }
	    }
	}

	public Paises buscarPais(String nombre) throws SQLException {
		Connection conexion = DriverManager.getConnection(URL);
		String selectQuery = "SELECT * FROM paises WHERE nombre = ?";
		Paises pais = null;

		try (PreparedStatement sentencia = conexion.prepareStatement(selectQuery)) {
			sentencia.setString(1, nombre);
			ResultSet resultSet = sentencia.executeQuery();

			if (resultSet.next()) {
				pais = new Paises(resultSet.getString("nombre"), resultSet.getString("presidente"),
						resultSet.getInt("pib"), resultSet.getDouble("gini"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conexion.close();
		}

		return pais;
	}
}
