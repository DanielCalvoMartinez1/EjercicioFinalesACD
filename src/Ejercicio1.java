import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class Ejercicio1 {

	public static void main(String[] args) {
		try {
			DocumentBuilderFactory ins = DocumentBuilderFactory.newInstance();
			DocumentBuilder construir = ins.newDocumentBuilder();

			Document documento = construir.newDocument();

			Element raiz = documento.createElement("Paises");
			documento.appendChild(raiz);


			Element Pais1 = documento.createElement("Pais");
			Element PaisNombre = documento.createElement("Nombre");
			Element Presidente1 = documento.createElement("Presidente");
			Element PIB1 = documento.createElement("PIB");
			Element Coe1 = documento.createElement("Coeficiente_de_Gini");
			PaisNombre.appendChild(documento.createTextNode("Belice"));
			Presidente1.appendChild(documento.createTextNode("Froyla Tzalam"));
			PIB1.appendChild(documento.createTextNode("1987"));
			Coe1.appendChild(documento.createTextNode("53.3"));
			raiz.appendChild(Pais1);
			Pais1.appendChild(PaisNombre);
			Pais1.appendChild(Presidente1);
			Pais1.appendChild(PIB1);
			Pais1.appendChild(Coe1);

			Element Pais2 = documento.createElement("Pais");
			Element PaisNombre2 = documento.createElement("Nombre");
			Element Presidente2 = documento.createElement("Presidente");
			Element PIB2 = documento.createElement("PIB");
			Element Coe2 = documento.createElement("Coeficiente_de_Gini");
			PaisNombre2.appendChild(documento.createTextNode("El_salvador"));
			Presidente2.appendChild(documento.createTextNode("Nayib_Bukele"));
			PIB2.appendChild(documento.createTextNode("74818"));
			Coe2.appendChild(documento.createTextNode("38.8"));
			raiz.appendChild(Pais2);
			Pais2.appendChild(PaisNombre2);
			Pais2.appendChild(Presidente2);
			Pais2.appendChild(PIB2);
			Pais2.appendChild(Coe2);

			Element Pais3 = documento.createElement("Pais");
			Element PaisNombre3 = documento.createElement("Nombre");
			Element Presidente3 = documento.createElement("Presidente");
			Element PIB3 = documento.createElement("PIB");
			Element Coe3 = documento.createElement("Coeficiente_de_Gini");
			PaisNombre3.appendChild(documento.createTextNode("Guatemala"));
			Presidente3.appendChild(documento.createTextNode("Alejandro Giammattei"));
			PIB3.appendChild(documento.createTextNode("185473"));
			Coe3.appendChild(documento.createTextNode("48.3"));
			raiz.appendChild(Pais3);
			Pais3.appendChild(PaisNombre3);
			Pais3.appendChild(Presidente3);
			Pais3.appendChild(PIB3);
			Pais3.appendChild(Coe3);

			Element Pais4 = documento.createElement("Pais");
			Element PaisNombre4 = documento.createElement("Nombre");
			Element Presidente4 = documento.createElement("Presidente");
			Element PIB4 = documento.createElement("PIB");
			Element Coe4 = documento.createElement("Coeficiente_de_Gini");
			PaisNombre4.appendChild(documento.createTextNode("Honduras"));
			Presidente4.appendChild(documento.createTextNode("Xiomara Castro"));
			PIB4.appendChild(documento.createTextNode("85625"));
			Coe4.appendChild(documento.createTextNode("48.2"));
			raiz.appendChild(Pais4);
			Pais4.appendChild(PaisNombre4);
			Pais4.appendChild(Presidente4);
			Pais4.appendChild(PIB4);
			Pais4.appendChild(Coe4);

			Element Pais5 = documento.createElement("Pais");
			Element PaisNombre5 = documento.createElement("Nombre");
			Element Presidente5 = documento.createElement("Presidente");
			Element PIB5 = documento.createElement("PIB");
			Element Coe5 = documento.createElement("Coeficiente_de_Gini");
			PaisNombre5.appendChild(documento.createTextNode("Nicaragua"));
			Presidente5.appendChild(documento.createTextNode("Daniel Ortega"));
			PIB5.appendChild(documento.createTextNode("47770"));
			Coe5.appendChild(documento.createTextNode("46.2"));
			raiz.appendChild(Pais5);
			Pais5.appendChild(PaisNombre5);
			Pais5.appendChild(Presidente5);
			Pais5.appendChild(PIB5);
			Pais5.appendChild(Coe5);
			
			Element Pais6 = documento.createElement("Pais");
			Element PaisNombre6 = documento.createElement("Nombre");
			Element Presidente6 = documento.createElement("Presidente");
			Element PIB6 = documento.createElement("PIB");
			Element Coe6 = documento.createElement("Coeficiente_de_Gini");
			PaisNombre6.appendChild(documento.createTextNode("México"));
			Presidente6.appendChild(documento.createTextNode("Andrés Manuel López Obrador"));
			PIB6.appendChild(documento.createTextNode("2890685"));
			Coe6.appendChild(documento.createTextNode("45.4"));
			raiz.appendChild(Pais6);
			Pais6.appendChild(PaisNombre6);
			Pais6.appendChild(Presidente6);
			Pais6.appendChild(PIB6);
			Pais6.appendChild(Coe6);

			Element Pais7 = documento.createElement("Pais");
			Element PaisNombre7 = documento.createElement("Nombre");
			Element Presidente7 = documento.createElement("Presidente");
			Element PIB7 = documento.createElement("PIB");
			Element Coe7 = documento.createElement("Coeficiente_de_Gini");
			PaisNombre7.appendChild(documento.createTextNode("Panamá"));
			Presidente7.appendChild(documento.createTextNode("Laurentino Cortizo"));
			PIB7.appendChild(documento.createTextNode("128500"));
			Coe7.appendChild(documento.createTextNode("50.9"));
			raiz.appendChild(Pais7);
			Pais7.appendChild(PaisNombre7);
			Pais7.appendChild(Presidente7);
			Pais7.appendChild(PIB7);
			Pais7.appendChild(Coe7);


			Element Pais8 = documento.createElement("Pais");
			Element PaisNombre8 = documento.createElement("Nombre");
			Element Presidente8 = documento.createElement("Presidente");
			Element PIB8 = documento.createElement("PIB");
			Element Coe8 = documento.createElement("Coeficiente_de_Gini");
			PaisNombre8.appendChild(documento.createTextNode("Costa Rica"));
			Presidente8.appendChild(documento.createTextNode("Rodrigo Chaves"));
			PIB8.appendChild(documento.createTextNode("129950"));
			Coe8.appendChild(documento.createTextNode("47.2"));
			raiz.appendChild(Pais8);
			Pais8.appendChild(PaisNombre8);
			Pais8.appendChild(Presidente8);
			Pais8.appendChild(PIB8);
			Pais8.appendChild(Coe8);

			TransformerFactory trasformar = TransformerFactory.newInstance();
			Transformer transformer = trasformar.newTransformer();
            // Configura la salida para la indentación
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

            DOMSource source = new DOMSource(documento);

            StreamResult result = new StreamResult("C:\\Users\\34636\\Desktop\\DAM 2\\ACCESO A DATOS\\ArchivosEjerFinales\\paises.xml");

            transformer.transform(source, result);

			System.out.println("Archivo XML creado");

		} catch (ParserConfigurationException | TransformerException e) {
			e.printStackTrace();
		}
	}
}
