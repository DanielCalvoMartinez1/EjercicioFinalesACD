package Ejercicio5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDeDatos {
	public static void main(String[] args) {
		String url = "jdbc:sqlite:C:\\\\Users\\\\34636\\\\Desktop\\\\DAM 2\\\\ACCESO A DATOS\\\\ArchivosEjerFinales\\\\base.bd";

		try (Connection connection = DriverManager.getConnection(url);
				Statement statement = connection.createStatement()) {

			String sql2 = "Drop table paises";
			statement.execute(sql2);
			String sql = "CREATE TABLE IF NOT EXISTS paises (\n" + "nombre TEXT PRIMARY KEY,\n" + "presidente TEXT,\n"
					+ "pib INTEGER,\n" + "gini REAL\n" + ");";
			statement.execute(sql);

			Paises pais1 = new Paises("Belice", "Froyla Tzalam", 1987, 48.3);
			Paises pais2 = new Paises("El salvador", "Nayib Bukele", 74818, 48.3);
			Paises pais3 = new Paises("Guatemala", "Alejandro Giammattei", 185473, 48.3);
			Paises pais4 = new Paises("Honduras", "Xiomara Castro", 85625, 48.3);
			Paises pais5 = new Paises("Nicaragua", "Daniel Ortega", 47770, 48.3);
			Paises pais6 = new Paises("Mexico", "Andrés Manuel López Obrador", 2890685, 48.3);
			Paises pais7 = new Paises("Panama", "Laurentino Cortizo", 128500, 48.3);
			Paises Pais8 = new Paises("Costa Rica", "Rodrigo Chaves", 129950, 48.3);
			DAOPaises daoPaises = new DAOPaises();
			daoPaises.insertarPais(pais1);
			daoPaises.insertarPais(pais2);
			daoPaises.insertarPais(pais3);
			daoPaises.insertarPais(pais4);
			daoPaises.insertarPais(pais5);
			daoPaises.insertarPais(pais6);
			daoPaises.insertarPais(pais7);
			daoPaises.insertarPais(Pais8);

			Paises paisEncontrado = daoPaises.buscarPais("Guatemala");
			System.out.println("País encontrado: " + paisEncontrado);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
