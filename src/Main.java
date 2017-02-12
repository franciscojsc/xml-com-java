import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Main {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Francisco");
		cliente.setSobrenome("Chaves");
		cliente.setIdade(24);
		cliente.setIdentificador(1);
		
		XStream stream = new XStream(new DomDriver());
		stream.alias("cliente", Cliente.class); //remoneando o nome do pacote
		
		String xml = stream.toXML(cliente);
		
		System.out.println(xml);
	}

}
