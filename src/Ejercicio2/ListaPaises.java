package Ejercicio2;

import java.io.Serializable;
import java.util.ArrayList;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.AnyTypePermission;
import com.thoughtworks.xstream.security.WildcardTypePermission;

public class ListaPaises implements Serializable {
	private ArrayList<Pais> Paises;

	public ListaPaises() {
		this.Paises = new ArrayList<>();
	}

	public void agregarPais(Pais pais) {
		this.Paises.add(pais);
	}

	public ArrayList<Pais> getPaises() {
		return Paises;
	}

	public String toXML() {
		XStream xstream = new XStream();
		xstream.alias("Pais", Pais.class);
		xstream.alias("listaPaises", ListaPaises.class);
		return xstream.toXML(this);
	}

//	public static ListaPaises fromXML(String xml) {
//		XStream xstream = new XStream();
//		xstream.alias("Pais", Pais.class);
//		xstream.alias("listaPaises", ListaPaises.class);
//		return (ListaPaises) xstream.fromXML(xml);
//	}

    public static ListaPaises fromXML1(String xml) {
        try {
            XStream xstream = new XStream();
            
            // Configuración de seguridad personalizada
            xstream.addPermission(new WildcardTypePermission(new String[] {
                "Ejercicio2.*"
            }));

            xstream.alias("Pais", Pais.class);
            xstream.alias("listaPaises", ListaPaises.class);
            return (ListaPaises) xstream.fromXML(xml);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

	public static void main(String[] args) {
		ListaPaises lista = new ListaPaises();

		Pais pais1 = new Pais("Belice", "Froyla Tzalam", 1987, 53.3);
		Pais pais2 = new Pais("El Salvador", "Nayib Bukele", 74818, 38.8);
		Pais pais3 = new Pais("Guatemala", "Alejandro Giammattei", 185473, 48.3);
		Pais pais4 = new Pais("Honduras", "Xiomara Castro", 85625, 48.2);
		Pais pais5 = new Pais("Nicaragua", "Daniel Ortega", 4770, 46.2);
		Pais pais6 = new Pais("México", "Andrés Manuel López Obrador", 2890685, 45.4);
		Pais pais7 = new Pais("Panamá", "Laurentino Cortizo", 128500, 50.9);
		Pais pais8 = new Pais("Costa Rica", "Rodrigo Chaves", 129950, 47.2);

		lista.agregarPais(pais1);
		lista.agregarPais(pais2);
		lista.agregarPais(pais3);
		lista.agregarPais(pais4);
		lista.agregarPais(pais5);
		lista.agregarPais(pais6);
		lista.agregarPais(pais7);
		lista.agregarPais(pais8);

		String xml = lista.toXML();
		System.out.println(xml);

		ListaPaises listaDeserializada = ListaPaises.fromXML1(xml);

		for (Pais pais : listaDeserializada.getPaises()) {
			System.out.println(pais);
		}
	}
}