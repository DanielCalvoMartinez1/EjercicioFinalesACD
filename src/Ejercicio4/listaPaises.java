package Ejercicio4;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class listaPaises {
	public static void main(String[] args) throws IOException {
		XStream xstream = new XStream(new DomDriver());
		// ESTA LINEA SE LA HE PEDIDO AL CHAT GPT PARA RESOLVER EL ERROR QUE ME DABA QUE ERA ALGO DE PERMISOS DE XSTREAM
		XStream.setupDefaultSecurity(xstream);
		xstream.allowTypes(new Class[] { Paises.class });

		xstream.alias("Paises", List.class);
		xstream.alias("Pais", Paises.class);

		try {
			FileInputStream fileInputStream = new FileInputStream("C:\\Users\\34636\\Desktop\\DAM 2\\ACCESO A DATOS\\ArchivosEjerFinales\\paises.xml");
			@SuppressWarnings("unchecked")
			List<Paises> paisesList = (List<Paises>) xstream.fromXML(fileInputStream);

			for (Paises pais : paisesList) {
				System.out.println(pais.toString());
			}
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\34636\\Desktop\\DAM 2\\ACCESO A DATOS\\ArchivosEjerFinales\\Paises.dat"));
            objectOutputStream.writeObject(paisesList);
            objectOutputStream.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
