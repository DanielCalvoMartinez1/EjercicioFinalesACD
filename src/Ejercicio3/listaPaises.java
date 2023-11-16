package Ejercicio3;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class listaPaises {
	public static void main(String[] args) {
		// Crear instancia de XStream
		XStream xstream = new XStream(new DomDriver());

		// Configurar permisos para la clase Paises
		XStream.setupDefaultSecurity(xstream);
		xstream.allowTypes(new Class[] { Paises.class });

		// Alias para que coincida con el nombre del elemento XML
		xstream.alias("Paises", List.class);
		xstream.alias("Pais", Paises.class);

		try {
			// Leer el archivo XML y convertirlo en una lista de objetos Paises
			FileInputStream fileInputStream = new FileInputStream("C:\\Users\\34636\\Desktop\\DAM 2\\ACCESO A DATOS\\ArchivosEjerFinales\\paises.xml");
			@SuppressWarnings("unchecked")
			List<Paises> paisesList = (List<Paises>) xstream.fromXML(fileInputStream);

			// Mostrar la información
			for (Paises pais : paisesList) {
				System.out.println(pais.toString());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
